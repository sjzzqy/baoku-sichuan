/**
 * @Copyright (c) 宝库技术团队 www.baoku.com
 * @authur Allen
 * @Generated: 2016-8-2 上午11:58:45
 */
package com.baoku.dt.model.result.refund;

import java.util.Set;

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
@XmlRootElement(name = "Passenger")
public class ApplyPassenger {
	
	@XmlElement(name = "Name")
	private String name;
	@XmlElement(name = "CertNo")
	private String certNo;
	@XmlElement(name = "Item")
	private Set<ApplyItem> item;

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
	 * @return the certNo
	 */
	public String getCertNo() {
		return certNo;
	}

	/**
	 * @param certNo
	 *            the certNo to set
	 */
	public void setCertNo(String certNo) {
		this.certNo = certNo;
	}

	/**
	 * @return the item
	 */
	public Set<ApplyItem> getItem() {
		return item;
	}

	/**
	 * @param item
	 *            the item to set
	 */
	public void setItem(Set<ApplyItem> item) {
		this.item = item;
	}

}
