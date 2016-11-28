/**
 * @Copyright (c) 宝库技术团队 www.baoku.com
 * @authur Allen
 * @Generated: 2016-7-21 上午9:23:54
 */
package com.baoku.dt.model.result.order;

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
@XmlRootElement(name = "OrderResult")
public class OrderResult {
	@XmlElement(name = "OrderNo")
	private String orderNo;
	@XmlElement(name = "BookManName")
	private String bookManName;// 预订人
	@XmlElement(name = "OrderType")
	private String orderType;// 航线类型
	@XmlSchemaType(name = "dateTime")
	@XmlElement(name = "TicketTime")
	private java.util.Date ticketTime;// 出票时间
	@XmlSchemaType(name = "dateTime")
	@XmlElement(name = "CreateTime")
	private java.util.Date createTime;// 出票时间
	/**
	 * @see com.baoku.common.core.StatusConstant --APPROVE_STATUS
	 */
	@XmlElement(name = "AppStatus")
	private Integer appStatus;// 审批状态
	/**
	 * @see com.baoku.common.core.StatusConstant -- ORDER_STATUS
	 */
	@XmlElement(name = "OrderSatus")
	private Integer orderSatus;// 订单状态
	/**
	 * @see com.baoku.common.core.StatusConstant -- AIR_ORDER_PAYMENT
	 */
	@XmlElement(name = "PayStatus")
	private Integer payStatus;// 支付状态

	@XmlElement(name = "Segments")
	private Segments Segments;// 航段信息
	@XmlElement(name = "Passengers")
	private Passengers Passengers;// 乘机人信息
	private Contacts Contacts;// 联系人信息
	private Postinfo Postinfos;// 邮寄信息

	/**
	 * @return the orderNo
	 */
	public String getOrderNo() {
		return orderNo;
	}

	/**
	 * @param orderNo
	 *            the orderNo to set
	 */
	public void setOrderNo(String orderNo) {
		this.orderNo = orderNo;
	}

	/**
	 * @return the bookManName
	 */
	public String getBookManName() {
		return bookManName;
	}

	/**
	 * @param bookManName
	 *            the bookManName to set
	 */
	public void setBookManName(String bookManName) {
		this.bookManName = bookManName;
	}

	/**
	 * @return the orderType
	 */
	public String getOrderType() {
		return orderType;
	}

	/**
	 * @param orderType
	 *            the orderType to set
	 */
	public void setOrderType(String orderType) {
		this.orderType = orderType;
	}

	/**
	 * @return the ticketTime
	 */
	public java.util.Date getTicketTime() {
		return ticketTime;
	}

	/**
	 * @param ticketTime
	 *            the ticketTime to set
	 */
	public void setTicketTime(java.util.Date ticketTime) {
		this.ticketTime = ticketTime;
	}

	/**
	 * @return the createTime
	 */
	public java.util.Date getCreateTime() {
		return createTime;
	}

	/**
	 * @param createTime
	 *            the createTime to set
	 */
	public void setCreateTime(java.util.Date createTime) {
		this.createTime = createTime;
	}

	/**
	 * @return the appStatus
	 */
	public Integer getAppStatus() {
		return appStatus;
	}

	/**
	 * @param appStatus
	 *            the appStatus to set
	 */
	public void setAppStatus(Integer appStatus) {
		this.appStatus = appStatus;
	}

	/**
	 * @return the orderSatus
	 */
	public Integer getOrderSatus() {
		return orderSatus;
	}

	/**
	 * @param orderSatus
	 *            the orderSatus to set
	 */
	public void setOrderSatus(Integer orderSatus) {
		this.orderSatus = orderSatus;
	}

	/**
	 * @return the payStatus
	 */
	public Integer getPayStatus() {
		return payStatus;
	}

	/**
	 * @param payStatus
	 *            the payStatus to set
	 */
	public void setPayStatus(Integer payStatus) {
		this.payStatus = payStatus;
	}

	/**
	 * @return the segments
	 */
	public Segments getSegments() {
		return Segments;
	}

	/**
	 * @param segments
	 *            the segments to set
	 */
	public void setSegments(Segments segments) {
		Segments = segments;
	}

	/**
	 * @return the passengers
	 */
	public Passengers getPassengers() {
		return Passengers;
	}

	/**
	 * @param passengers
	 *            the passengers to set
	 */
	public void setPassengers(Passengers passengers) {
		Passengers = passengers;
	}

	/**
	 * @return the contacts
	 */
	public Contacts getContacts() {
		return Contacts;
	}

	/**
	 * @param contacts
	 *            the contacts to set
	 */
	public void setContacts(Contacts contacts) {
		Contacts = contacts;
	}

	/**
	 * @return the postinfos
	 */
	public Postinfo getPostinfos() {
		return Postinfos;
	}

	/**
	 * @param postinfos
	 *            the postinfos to set
	 */
	public void setPostinfos(Postinfo postinfos) {
		Postinfos = postinfos;
	}

}
