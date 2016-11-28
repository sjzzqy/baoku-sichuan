package com.baoku.dt.service;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.StringReader;
import java.io.StringWriter;
import java.lang.reflect.ParameterizedType;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;

import com.baoku.dt.AESUtil;
import com.baoku.dt.Http;
import com.baoku.dt.Tool;
import com.baoku.dt.model.common.Response;

/**
 * webService 基类
 * 
 * @Description: TODO(....)
 * @author Allen
 * @version V1.0
 */
public abstract class BaseService<T, T2> {
	private static String appUser = null; // 帐号
	private static String serverHost = null;
	private static String appKey = null;
	private static String secretKey = null;

	private void loadConf() {
		String path = this.getClass().getResource("/smeWebService.conf")
				.getPath();
		File file = new File(path);
		BufferedReader reader = null;
		try {
			reader = new BufferedReader(new FileReader(file));
			String tempString = null;
			while ((tempString = reader.readLine()) != null) {
				String[] arr = tempString.split("=");
				if (arr != null && arr.length == 2) {
					String name = arr[0].trim();
					String value = arr[1].trim();
					if ("appUser".equals(name)) {
						appUser = value;
					} else if ("appKey".equals(name)) {
						appKey = value;
					} else if ("secretKey".equals(name)) {
						secretKey = value;
					} else if ("serverHost".equals(name)) {
						serverHost = value;
					}
				}

			}
			reader.close();
		} catch (IOException e) {
			System.out
					.println("ERROR - failed to load conf from test.conf\r\n");
			e.printStackTrace();
		} finally {
			if (reader != null) {
				try {
					reader.close();
				} catch (IOException e1) {
				}
			}
		}

		if (appUser == null || appUser.equals("")) {
			System.out
					.println("ERROR - plz conf appUser in  smeWebService.conf\r\n");
		} else if (appKey == null || appKey.equals("")) {
			System.out
					.println("ERROR - plz conf appKey in  smeWebService.conf\r\n");
		} else if (secretKey == null || secretKey.equals("")) {
			System.out
					.println("ERROR - plz conf secretKey in  smeWebService.conf\r\n");
		} else if (serverHost == null || serverHost.equals("")) {
			System.out
					.println("ERROR - plz conf serverHost in  smeWebService.conf\r\n");
		}

	}

	public BaseService() {
		loadConf();
	}

	public abstract String method();

	public abstract T getConditon();

	public abstract boolean isRequiredSSL();

	public abstract Response<T2> request();

	public String connect() {
		if (appUser == null || appUser.equals("")) {
			System.out.println("please set appUser and keys.");
			return null;
		}
		try {
			T t = this.getConditon();
			String str = null;
			str = this.objectToXml(t);
			System.out.println("Condition " + str);
			long epoch = System.currentTimeMillis() / 1000;

			String signature = Tool.md5(epoch + Tool.md5(str + appKey)
					+ secretKey);
			String data = Tool.encodeUri(AESUtil.Encrypt(str, appKey));

			String url = "http" + (this.isRequiredSSL() ? "s" : "") + "://"
					+ serverHost + "/" + this.method() + "?appUser=" + appUser
					+ "&timestamp=";
			url += epoch;
			url += "&signature=" + signature;
			url += "&data=" + data;
			System.out.println(url);
			return Http.Send("GET", url, "");
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}

	@SuppressWarnings("unchecked")
	public Response<T2> xmlToObject(String str) {
		JAXBContext context = null;
		Response<T2> obj = null;
		Class<T2> T2Class = null;
		try {
			ParameterizedType type = (ParameterizedType) (getClass()
					.getGenericSuperclass());
			java.lang.reflect.Type[] types = type.getActualTypeArguments();
			if (types != null && types.length > 1) {
				T2Class = (Class<T2>) types[1];
			}
			context = JAXBContext.newInstance(Response.class, T2Class);
			StringReader reader = new StringReader(str);
			Unmarshaller unmar = context.createUnmarshaller();
			obj = (Response<T2>) unmar.unmarshal(reader);
		} catch (JAXBException e) {
			e.printStackTrace();
		}
		return obj;
	}

	public String objectToXml(Object value) {
		String str = null;

		JAXBContext context = null;

		StringWriter writer = null;
		try {

			context = JAXBContext.newInstance(value.getClass());
			Marshaller mar = context.createMarshaller();
			writer = new StringWriter();
			mar.marshal(value, writer);
			str = writer.toString();
		} catch (JAXBException e) {
			e.printStackTrace();
		} finally {
			if (context != null)
				context = null;
			if (writer != null) {
				try {
					writer.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
				writer = null;
			}
		}

		return str;
	}
}
