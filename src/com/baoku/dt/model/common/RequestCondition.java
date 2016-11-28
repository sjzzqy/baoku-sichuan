/**
 * @Copyright (c) 宝库技术团队 www.baoku.com
 * @authur Allen
 * @Generated: 2016-7-4 下午5:06:17
 */
package com.baoku.dt.model.common;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * 主请求
 * 
 * @Description: TODO(....)
 * @author Allen
 * @version V1.0
 */
@XmlRootElement(name = "Condition")
@XmlAccessorType(XmlAccessType.FIELD)
public class RequestCondition implements Serializable {

	private static final long serialVersionUID = 1L;
	private String appUser;// 账户名
	private String timestamp;// 时间戳（每个账户的请求时间戳只可以发起一次，30s有效）
	private String signature;// 签名方法：md5(timestamp+md5(data+appkey) + secretKey)
	private String data;// 请求内容。加密方法：encode(zip(AES(data,appkey)))

	/**
	 * @return the appUser
	 */
	public String getAppUser() {
		return appUser;
	}

	/**
	 * @param appUser
	 *            the appUser to set
	 */
	public void setAppUser(String appUser) {
		this.appUser = appUser;
	}

	/**
	 * @return the timestamp
	 */
	public String getTimestamp() {
		return timestamp;
	}

	/**
	 * @param timestamp
	 *            the timestamp to set
	 */
	public void setTimestamp(String timestamp) {
		this.timestamp = timestamp;
	}

	/**
	 * @return the signature
	 */
	public String getSignature() {
		return signature;
	}

	/**
	 * @param signature
	 *            the signature to set
	 */
	public void setSignature(String signature) {
		this.signature = signature;
	}

	/**
	 * @return the data
	 */
	public String getData() {
		return data;
	}

	/**
	 * @param data
	 *            the data to set
	 */
	public void setData(String data) {
		this.data = data;
	}

}
