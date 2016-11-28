/**
 * @Copyright (c) 宝库技术团队 www.baoku.com
 * @authur Allen
 * @Generated: 2016-8-3 下午3:03:46
 */
package com.baoku.dt.model.request.refund;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * 提交退票
 * 
 * @Description: TODO(....)
 * @author Allen
 * @version V1.0
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "EtrfCondition")
public class EtrfCondition {

	@XmlElement(name = "OrderNo")
	private String orderNo;
	@XmlElement(name = "Nature")
	private int nature;
	@XmlElement(name = "Cause")
	private Integer cause;
	@XmlElement(name = "OtCause")
	private String otCause;
	@XmlElement(name = "Epost")
	private int epost;
	@XmlElement(name = "Remarks")
	private String remarks;
	@XmlElement(name = "Name")
	private String name;
	@XmlElement(name = "Phone")
	private String phone;// 电话
	@XmlElement(name = "Uids")
	private EtrfUids uids;

	/**
	 * @return the orderNo
	 */
	public String getOrderNo() {
		return orderNo;
	}

	/**
	 * @param orderNo
	 *            the orderNo to set
	 */
	public void setOrderNo(String orderNo) {
		this.orderNo = orderNo;
	}

	/**
	 * @return the nature
	 */
	public int getNature() {
		return nature;
	}

	/**
	 * @param nature
	 *            the nature to set
	 */
	public void setNature(int nature) {
		this.nature = nature;
	}

	/**
	 * @return the cause
	 */
	public Integer getCause() {
		return cause;
	}

	/**
	 * @param cause
	 *            the cause to set
	 */
	public void setCause(Integer cause) {
		this.cause = cause;
	}

	/**
	 * @return the otCause
	 */
	public String getOtCause() {
		return otCause;
	}

	/**
	 * @param otCause
	 *            the otCause to set
	 */
	public void setOtCause(String otCause) {
		this.otCause = otCause;
	}

	/**
	 * @return the epost
	 */
	public int getEpost() {
		return epost;
	}

	/**
	 * @param epost
	 *            the epost to set
	 */
	public void setEpost(int epost) {
		this.epost = epost;
	}

	/**
	 * @return the remarks
	 */
	public String getRemarks() {
		return remarks;
	}

	/**
	 * @param remarks
	 *            the remarks to set
	 */
	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}

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
	 * @return the uids
	 */
	public EtrfUids getUids() {
		return uids;
	}

	/**
	 * @param uids
	 *            the uids to set
	 */
	public void setUids(EtrfUids uids) {
		this.uids = uids;
	}

}
