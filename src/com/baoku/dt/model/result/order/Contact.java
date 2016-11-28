/**
 * @Copyright (c) 宝库技术团队 www.baoku.com
 * @authur Allen
 * @Generated: 2016-7-21 上午11:49:43
 */
package com.baoku.dt.model.result.order;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * @Description: TODO(....)
 * @author Allen
 * @version V1.0
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "Contacts")
public class Contact {

	@XmlElement(name = "Name")
	private String name;
	@XmlElement(name = "Phone")
	private String phone;
	private boolean bsms;
	private boolean tsms;

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name
	 *            the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the phone
	 */
	public String getPhone() {
		return phone;
	}

	/**
	 * @param phone
	 *            the phone to set
	 */
	public void setPhone(String phone) {
		this.phone = phone;
	}

	/**
	 * @return the bsms
	 */
	public boolean isBsms() {
		return bsms;
	}

	/**
	 * @param bsms
	 *            the bsms to set
	 */
	public void setBsms(boolean bsms) {
		this.bsms = bsms;
	}

	/**
	 * @return the tsms
	 */
	public boolean isTsms() {
		return tsms;
	}

	/**
	 * @param tsms
	 *            the tsms to set
	 */
	public void setTsms(boolean tsms) {
		this.tsms = tsms;
	}

}
