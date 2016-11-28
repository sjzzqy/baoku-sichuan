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
	@XmlElement(name = "ETNo")
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

	public String getFlightNo() {
		return flightNo;
	}

	public void setFlightNo(String flightNo) {
		this.flightNo = flightNo;
	}

	public String getEtno() {
		return etno;
	}

	public void setEtno(String etno) {
		this.etno = etno;
	}

	public Double getFdPrice() {
		return fdPrice;
	}

	public void setFdPrice(Double fdPrice) {
		this.fdPrice = fdPrice;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public Double getFuelTax() {
		return fuelTax;
	}

	public void setFuelTax(Double fuelTax) {
		this.fuelTax = fuelTax;
	}

	public Double getAirTax() {
		return airTax;
	}

	public void setAirTax(Double airTax) {
		this.airTax = airTax;
	}

	public Double getTotal() {
		return total;
	}

	public void setTotal(Double total) {
		this.total = total;
	}

}
