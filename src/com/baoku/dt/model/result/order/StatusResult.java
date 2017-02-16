/**
 * @Copyright (c) 宝库技术团队 www.baoku.com
 * @authur Allen
 * @Generated: 2016-8-1 下午3:06:33
 */
package com.baoku.dt.model.result.order;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * 訂單狀態
 * 
 * @Description: TODO(....)
 * @author Allen
 * @version V1.0
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "Result")
public class StatusResult {

	@XmlElement(name = "OrderNo")
	private String orderNo;
	@XmlElement(name = "AppStatus")
	private Integer appStatus;
	@XmlElement(name = "OrderStatus")
	private Integer orderSatus;
	@XmlElement(name = "PayStatus")
	private Integer payStatus;

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

}
