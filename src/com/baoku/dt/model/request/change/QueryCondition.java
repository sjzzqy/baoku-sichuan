/**
 * @Copyright (c) 宝库技术团队 www.baoku.com
 * @authur Allen
 * @Generated: 2017-2-14 上午10:59:55
 */
package com.baoku.dt.model.request.change;

import java.util.HashSet;
import java.util.Set;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * 升舱改期航班查询
 * 
 * @Description: TODO(....)
 * @author Allen
 * @version V1.0
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "Condition")
public class QueryCondition {

	@XmlElement(name = "OrderNo")
	private String orderNo;// 订单号
	@XmlElement(name = "GoDate")
	private String goDate;// 改期至时间
	@XmlElement(name = "Flight")
	private Set<Flight> flight = new HashSet<Flight>();

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
	 * goDate
	 * 
	 * @return the goDate
	 */
	public String getGoDate() {
		return goDate;
	}

	/**
	 * goDate
	 * 
	 * @param goDate
	 *            the goDate to set
	 */
	public void setGoDate(String goDate) {
		this.goDate = goDate;
	}

	/**
	 * flight
	 * 
	 * @return the flight
	 */
	public Set<Flight> getFlight() {
		return flight;
	}

	/**
	 * flight
	 * 
	 * @param flight
	 *            the flight to set
	 */
	public void setFlight(Set<Flight> flight) {
		this.flight = flight;
	}

}
