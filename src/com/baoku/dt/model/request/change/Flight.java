/**
 * @Copyright (c) 宝库技术团队 www.baoku.com
 * @authur Allen
 * @Generated: 2017-2-14 上午11:11:35
 */
package com.baoku.dt.model.request.change;

import java.util.HashSet;
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
@XmlRootElement(name = "Flight")
public class Flight {

	@XmlElement(name = "FlightNo")
	private String flightNo;// 原航班号
	@XmlElement(name = "CertNo")
	private Set<String> certNo = new HashSet<String>();

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

	/**
	 * @return the certNo
	 */
	public Set<String> getCertNo() {
		return certNo;
	}

	/**
	 * @param certNo
	 *            the certNo to set
	 */
	public void setCertNo(Set<String> certNo) {
		this.certNo = certNo;
	}

}
