/**
 * @Copyright (c) 宝库技术团队 www.baoku.com
 * @authur Allen
 * @Generated: 2016-7-21 上午10:37:30
 */
package com.baoku.dt.model.result.order;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * 价格表
 * 
 * @Description: TODO(....)
 * @author Allen
 * @version V1.0
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "Ticket")
public class Ticket {

	@XmlElement(name = "FlightNo")
	private String flightNo;// 航班号
	@XmlElement(name = "ETNO")
	private String etno;// 票号
	@XmlElement(name = "FdPrice")
	private Double fdPrice;// 公布价
	@XmlElement(name = "Price")
	private Double price;// 实售价
	@XmlElement(name = "FuelTax")
	private Double fuelTax;// 燃油
	@XmlElement(name = "AirTax")
	private Double airTax;// 机建
	@XmlElement(name = "Total")
	private Double total;// 应收

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
	 * @return the etno
	 */
	public String getEtno() {
		return etno;
	}

	/**
	 * @param etno
	 *            the etno to set
	 */
	public void setEtno(String etno) {
		this.etno = etno;
	}

	/**
	 * @return the fdPrice
	 */
	public Double getFdPrice() {
		return fdPrice;
	}

	/**
	 * @param fdPrice
	 *            the fdPrice to set
	 */
	public void setFdPrice(Double fdPrice) {
		this.fdPrice = fdPrice;
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
	 * @return the total
	 */
	public Double getTotal() {
		return total;
	}

	/**
	 * @param total
	 *            the total to set
	 */
	public void setTotal(Double total) {
		this.total = total;
	}

}
