/**
 * @Copyright (c) 宝库技术团队 www.baoku.com
 * @authur Allen
 * @Generated: 2016-7-20 上午11:17:52
 */
package com.baoku.dt.model.request;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * 航班价格验证接口 创建订单前可以调用此接口
 * 
 * @Description: TODO(....)
 * @author Allen
 * @version V1.0
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "BookingCondition")
public class BookingCondition {

	@XmlElement(name = "CusBigCode")
	private String cusBigCode;// 大客户编码
	@XmlElement(name = "RatePlanId")
	private String ratePlanId;// 产品编码
	@XmlElement(name = "OrgCity")
	private String orgCity;// 始发城市
	@XmlElement(name = "DesCity")
	private String desCity;// 到达城市
	@XmlElement(name = "GoDate")
	private String goDate;// 出发日期
	@XmlElement(name = "FlightNo")
	private String flightNo;// 航班号
	@XmlElement(name = "CNo")
	private String cno;// 舱位代码
	@XmlElement(name = "Price")
	private Double price;// 协议价格
	@XmlElement(name = "AirTax")
	private Double airTax;// 机建
	@XmlElement(name = "AddFare")
	private Double addFare;// 燃油

	/**
	 * @return the cusBigCode
	 */
	public String getCusBigCode() {
		return cusBigCode;
	}

	/**
	 * @param cusBigCode
	 *            the cusBigCode to set
	 */
	public void setCusBigCode(String cusBigCode) {
		this.cusBigCode = cusBigCode;
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
	 * @return the goDate
	 */
	public String getGoDate() {
		return goDate;
	}

	/**
	 * @param goDate
	 *            the goDate to set
	 */
	public void setGoDate(String goDate) {
		this.goDate = goDate;
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

	/**
	 * @return the cno
	 */
	public String getCno() {
		return cno;
	}

	/**
	 * @param cno
	 *            the cno to set
	 */
	public void setCno(String cno) {
		this.cno = cno;
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
	 * @return the addFare
	 */
	public Double getAddFare() {
		return addFare;
	}

	/**
	 * @param addFare
	 *            the addFare to set
	 */
	public void setAddFare(Double addFare) {
		this.addFare = addFare;
	}

}
