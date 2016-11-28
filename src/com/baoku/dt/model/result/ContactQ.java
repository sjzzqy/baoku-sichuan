/**
 * @Copyright (c) 宝库技术团队 www.baoku.com
 * @authur Allen
 * @Generated: 2016-10-10 下午6:31:12
 */
package com.baoku.dt.model.result;

import java.util.Set;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * 清Q使用
 * <p>
 * 获取订单联系人信息
 * </p>
 * 
 * @Description: TODO(....)
 * @author Allen
 * @version V1.0
 */
@XmlRootElement(name = "Result")
@XmlAccessorType(XmlAccessType.FIELD)
public class ContactQ {

	@XmlElement(name = "ContactMobilePhone")
	private Set<String> contactMobilePhone;
	@XmlElement(name = "PsgName")
	private Set<String> psgName;

	/**
	 * @return the contactMobilePhone
	 */
	public Set<String> getContactMobilePhone() {
		return contactMobilePhone;
	}

	/**
	 * @param contactMobilePhone
	 *            the contactMobilePhone to set
	 */
	public void setContactMobilePhone(Set<String> contactMobilePhone) {
		this.contactMobilePhone = contactMobilePhone;
	}

	/**
	 * @return the psgName
	 */
	public Set<String> getPsgName() {
		return psgName;
	}

	/**
	 * @param psgName
	 *            the psgName to set
	 */
	public void setPsgName(Set<String> psgName) {
		this.psgName = psgName;
	}

}
