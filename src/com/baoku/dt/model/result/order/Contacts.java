/**
 * @Copyright (c) 宝库技术团队 www.baoku.com
 * @authur Allen
 * @Generated: 2016-7-21 上午11:49:36
 */
package com.baoku.dt.model.result.order;

import java.util.Set;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * @Description: TODO(....)
 * @author Allen
 * @version V1.0
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "Contacts")
public class Contacts {
	private Set<Contact> Contact;

	/**
	 * @return the contact
	 */
	public Set<Contact> getContact() {
		return Contact;
	}

	/**
	 * @param contact
	 *            the contact to set
	 */
	public void setContact(Set<Contact> contact) {
		Contact = contact;
	}

}
