/**
 * @Copyright (c) 宝库技术团队 www.baoku.com
 * @authur Allen
 * @Generated: 2016-7-22 下午3:55:49
 */
package com.baoku.dt.model.common;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;

/**
 * @Description: TODO(....)
 * @author Allen
 * @version V1.0
 */
@XmlAccessorType(XmlAccessType.FIELD)
public class CommonPassenger {

	@XmlElement(name = "Name")
	private String name;// 姓名
	@XmlElement(name = "CertType")
	private String certType;
	@XmlElement(name = "CertNo")
	private String certNo;
	@XmlElement(name = "Ptype")
	private String ptype;
	@XmlElement(name = "Mobile")
	private String mobile;
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
	 * @return the certType
	 */
	public String getCertType() {
		return certType;
	}

	/**
	 * @param certType
	 *            the certType to set
	 */
	public void setCertType(String certType) {
		this.certType = certType;
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
	 * @return the ptype
	 */
	public String getPtype() {
		return ptype;
	}

	/**
	 * @param ptype
	 *            the ptype to set
	 */
	public void setPtype(String ptype) {
		this.ptype = ptype;
	}

	/**
	 * @return the mobile
	 */
	public String getMobile() {
		return mobile;
	}

	/**
	 * @param mobile
	 *            the mobile to set
	 */
	public void setMobile(String mobile) {
		this.mobile = mobile;
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
