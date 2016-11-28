/**
 * @Copyright (c) 宝库技术团队 www.baoku.com
 * @authur Allen
 * @Generated: 2016-3-8 上午10:39:18
 */
package com.baoku.dt;

import java.io.IOException;
import java.io.StringReader;
import java.io.StringWriter;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;

/**
 * @author Allen
 */
public class XmlUtils {
	/**
	 * xml to object
	 * 
	 * @param str
	 * @param classesToBeBound
	 * @return
	 * @throws Exception
	 */
	public static Object xmlToObject(String str, Class<?> classesToBeBound)
			throws Exception {
		JAXBContext context = null;
		context = JAXBContext.newInstance(classesToBeBound);
		StringReader reader = new StringReader(str);
		Unmarshaller unmar = context.createUnmarshaller();
		return unmar.unmarshal(reader);
	}

	/**
	 * object to xml
	 * 
	 * @param value
	 * @return
	 * @throws Exception
	 */
	public static String objectToXml(Object value) throws Exception {
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
			throw new Exception(e);
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
