/**
 * @Copyright (c) 宝库技术团队 www.baoku.com
 * @authur Allen
 * @Generated: 2016-7-21 上午11:53:12
 */
package com.baoku.dt.model.result.order;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * 邮寄信息
 * 
 * @Description: TODO(....)
 * @author Allen
 * @version V1.0
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "Postinfo")
public class Postinfo {

	@XmlElement(name = "Category")
	private String category;// 公司签约的邮寄类型、中文字符（统一邮寄、集中配送）
	@XmlElement(name = "Sname")
	private String sname;// 签收人
	@XmlElement(name = "Phone")
	private String phone;// 签收人联系电话
	@XmlElement(name = "Time")
	private String time;// 邮寄时间
	@XmlElement(name = "ZipCode")
	private String zipCode;// 邮编
	@XmlElement(name = "Stype")
	private String stype;// 邮寄方式（挂号信、快递包邮等）中文字符
	@XmlElement(name = "Address")
	private String address;// 邮寄地址
	@XmlElement(name = "Status")
	private Integer status;// 邮寄状态 0未邮寄 2已邮寄

	/**
	 * @return the category
	 */
	public String getCategory() {
		return category;
	}

	/**
	 * @param category
	 *            the category to set
	 */
	public void setCategory(String category) {
		this.category = category;
	}

	/**
	 * @return the sname
	 */
	public String getSname() {
		return sname;
	}

	/**
	 * @param sname
	 *            the sname to set
	 */
	public void setSname(String sname) {
		this.sname = sname;
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
	 * @return the time
	 */
	public String getTime() {
		return time;
	}

	/**
	 * @param time
	 *            the time to set
	 */
	public void setTime(String time) {
		this.time = time;
	}

	/**
	 * @return the zipCode
	 */
	public String getZipCode() {
		return zipCode;
	}

	/**
	 * @param zipCode
	 *            the zipCode to set
	 */
	public void setZipCode(String zipCode) {
		this.zipCode = zipCode;
	}

	/**
	 * @return the stype
	 */
	public String getStype() {
		return stype;
	}

	/**
	 * @param stype
	 *            the stype to set
	 */
	public void setStype(String stype) {
		this.stype = stype;
	}

	/**
	 * @return the address
	 */
	public String getAddress() {
		return address;
	}

	/**
	 * @param address
	 *            the address to set
	 */
	public void setAddress(String address) {
		this.address = address;
	}

	/**
	 * @return the status
	 */
	public Integer getStatus() {
		return status;
	}

	/**
	 * @param status
	 *            the status to set
	 */
	public void setStatus(Integer status) {
		this.status = status;
	}

}
