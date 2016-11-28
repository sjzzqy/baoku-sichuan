/**
 * @Copyright (c) 宝库技术团队 www.baoku.com
 * @authur Allen
 * @Generated: 2016-7-22 下午3:33:56
 */
package com.baoku.dt.model.request;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import com.baoku.dt.model.common.CommonSegment;

/**
 * @Description: TODO(....)
 * @author Allen
 * @version V1.0
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "Segment")
public class Segment extends CommonSegment {

	@XmlElement(name = "FuelTax")
	private Double fuelTax;
	@XmlElement(name = "AirTax")
	private Double airTax;
	@XmlElement(name = "RatePlanId")
	private String ratePlanId;
	@XmlElement(name = "CNo")
	private String cNo;
	@XmlElement(name = "CName")
	private String cName;
	@XmlElement(name = "Price")
	private Double price;

	/**
	 * @return the fuelTax
	 */
	public Double getFuelTax() {
		return fuelTax;
	}

	/**
	 * @param fuelTax
	 *            the fuelTax to set
	 */
	public void setFuelTax(Double fuelTax) {
		this.fuelTax = fuelTax;
	}

	/**
	 * @return the airTax
	 */
	public Double getAirTax() {
		return airTax;
	}

	/**
	 * @param airTax
	 *            the airTax to set
	 */
	public void setAirTax(Double airTax) {
		this.airTax = airTax;
	}

	/**
	 * @return the ratePlanId
	 */
	public String getRatePlanId() {
		return ratePlanId;
	}

	/**
	 * @param ratePlanId
	 *            the ratePlanId to set
	 */
	public void setRatePlanId(String ratePlanId) {
		this.ratePlanId = ratePlanId;
	}

	/**
	 * @return the cNo
	 */
	public String getcNo() {
		return cNo;
	}

	/**
	 * @param cNo
	 *            the cNo to set
	 */
	public void setcNo(String cNo) {
		this.cNo = cNo;
	}

	/**
	 * @return the cName
	 */
	public String getcName() {
		return cName;
	}

	/**
	 * @param cName
	 *            the cName to set
	 */
	public void setcName(String cName) {
		this.cName = cName;
	}

	/**
	 * @return the price
	 */
	public Double getPrice() {
		return price;
	}

	/**
	 * @param price
	 *            the price to set
	 */
	public void setPrice(Double price) {
		this.price = price;
	}

}
