/**
 * @Copyright (c) 宝库技术团队 www.baoku.com
 * @authur Allen
 * @Generated: 2016-7-22 下午3:57:16
 */
package com.baoku.dt.model.common;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;

/**
 * @Description: TODO(....)
 * @author Allen
 * @version V1.0
 */
@XmlAccessorType(XmlAccessType.FIELD)
public class CommonSegment {
	@XmlElement(name = "OrgCity")
	private String orgCity;// 始发地
	@XmlElement(name = "DesCity")
	private String desCity;// 到达地
	@XmlSchemaType(name = "dateTime")
	@XmlElement(name = "OrgDate")
	private java.util.Date orgDate;// 起飞时间
	@XmlSchemaType(name = "dateTime")
	@XmlElement(name = "DesDate")
	private java.util.Date desDate;// 到达时间
	@XmlElement(name = "FlightNo")
	private String flightNo;// 航班号

	/**
	 * @return the orgCity
	 */
	public String getOrgCity() {
		return orgCity;
	}

	/**
	 * @param orgCity
	 *            the orgCity to set
	 */
	public void setOrgCity(String orgCity) {
		this.orgCity = orgCity;
	}

	/**
	 * @return the desCity
	 */
	public String getDesCity() {
		return desCity;
	}

	/**
	 * @param desCity
	 *            the desCity to set
	 */
	public void setDesCity(String desCity) {
		this.desCity = desCity;
	}

	/**
	 * @return the orgDate
	 */
	public java.util.Date getOrgDate() {
		return orgDate;
	}

	/**
	 * @param orgDate
	 *            the orgDate to set
	 */
	public void setOrgDate(java.util.Date orgDate) {
		this.orgDate = orgDate;
	}

	/**
	 * @return the desDate
	 */
	public java.util.Date getDesDate() {
		return desDate;
	}

	/**
	 * @param desDate
	 *            the desDate to set
	 */
	public void setDesDate(java.util.Date desDate) {
		this.desDate = desDate;
	}

	/**
	 * @return the flightNo
	 */
	public String getFlightNo() {
		return flightNo;
	}

	/**
	 * @param flightNo
	 *            the flightNo to set
	 */
	public void setFlightNo(String flightNo) {
		this.flightNo = flightNo;
	}

}
