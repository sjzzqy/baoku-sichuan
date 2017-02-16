/**
 * @Copyright (c) 宝库技术团队 www.baoku.com
 * @authur Allen
 * @Generated: 2017-2-13 下午1:51:58
 */
package com.baoku.dt.model.result.change;

import java.util.HashSet;
import java.util.Set;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;

/**
 * @Description: TODO(....)
 * @author Allen
 * @version V1.0
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "Change")
public class ChangeResult {

	@XmlSchemaType(name = "dateTime")
	@XmlElement(name = "bookTime")
	private java.util.Date bookTime;
	@XmlElement(name = "OrderNo")
	private String orderNo; // 订单号
	@XmlElement(name = "Passenger")
	private Set<CPassenger> passenger = new HashSet<CPassenger>();

	/**
	 * bookTime
	 * 
	 * @return the bookTime
	 */
	public java.util.Date getBookTime() {
		return bookTime;
	}

	/**
	 * bookTime
	 * 
	 * @param bookTime
	 *            the bookTime to set
	 */
	public void setBookTime(java.util.Date bookTime) {
		this.bookTime = bookTime;
	}

	/**
	 * orderNo
	 * 
	 * @return the orderNo
	 */
	public String getOrderNo() {
		return orderNo;
	}

	/**
	 * orderNo
	 * 
	 * @param orderNo
	 *            the orderNo to set
	 */
	public void setOrderNo(String orderNo) {
		this.orderNo = orderNo;
	}

	/**
	 * passenger
	 * 
	 * @return the passenger
	 */
	public Set<CPassenger> getPassenger() {
		return passenger;
	}

	/**
	 * passenger
	 * 
	 * @param passenger
	 *            the passenger to set
	 */
	public void setPassenger(Set<CPassenger> passenger) {
		this.passenger = passenger;
	}

}
