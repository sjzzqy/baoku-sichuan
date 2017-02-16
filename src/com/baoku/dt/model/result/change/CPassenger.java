/**
 * @Copyright (c) 宝库技术团队 www.baoku.com
 * @authur Allen
 * @Generated: 2017-2-13 下午2:04:10
 */
package com.baoku.dt.model.result.change;

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
public class CPassenger {

	@XmlElement(name = "Name")
	private String name;
	@XmlElement(name = "CertNo")
	private String certNo;
	@XmlElement(name = "FlightNo")
	private String flightNo;// 航班号
	@XmlElement(name = "Cabin")
	private String cabin;// 舱位
	@XmlElement(name = "ETNO")
	private String etno;
	@XmlElement(name = "Status")
	private Integer status;

	/**
	 * name
	 * 
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * name
	 * 
	 * @param name
	 *            the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * certNo
	 * 
	 * @return the certNo
	 */
	public String getCertNo() {
		return certNo;
	}

	/**
	 * certNo
	 * 
	 * @param certNo
	 *            the certNo to set
	 */
	public void setCertNo(String certNo) {
		this.certNo = certNo;
	}

	/**
	 * flightNo
	 * 
	 * @return the flightNo
	 */
	public String getFlightNo() {
		return flightNo;
	}

	/**
	 * flightNo
	 * 
	 * @param flightNo
	 *            the flightNo to set
	 */
	public void setFlightNo(String flightNo) {
		this.flightNo = flightNo;
	}

	/**
	 * cabin
	 * 
	 * @return the cabin
	 */
	public String getCabin() {
		return cabin;
	}

	/**
	 * cabin
	 * 
	 * @param cabin
	 *            the cabin to set
	 */
	public void setCabin(String cabin) {
		this.cabin = cabin;
	}

	/**
	 * etno
	 * 
	 * @return the etno
	 */
	public String getEtno() {
		return etno;
	}

	/**
	 * etno
	 * 
	 * @param etno
	 *            the etno to set
	 */
	public void setEtno(String etno) {
		this.etno = etno;
	}

	/**
	 * status
	 * 
	 * @return the status
	 */
	public Integer getStatus() {
		return status;
	}

	/**
	 * status
	 * 
	 * @param status
	 *            the status to set
	 */
	public void setStatus(Integer status) {
		this.status = status;
	}

}
