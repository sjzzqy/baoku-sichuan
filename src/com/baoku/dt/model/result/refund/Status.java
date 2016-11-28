/**
 * @Copyright (c) 宝库技术团队 www.baoku.com
 * @authur Allen
 * @Generated: 2016-8-4 下午1:38:17
 */
package com.baoku.dt.model.result.refund;

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
@XmlRootElement(name = "Status")
public class Status {

	@XmlElement(name = "OrderNo")
	private String orderNo;// 订单号
	@XmlElement(name = "AmountStatus")
	private Integer amountStatus;// 退款状态
	@XmlElement(name = "OrderStatus")
	private Integer orderStatus;// 退票单状态

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
	 * @return the amountStatus
	 */
	public Integer getAmountStatus() {
		return amountStatus;
	}

	/**
	 * @param amountStatus
	 *            the amountStatus to set
	 */
	public void setAmountStatus(Integer amountStatus) {
		this.amountStatus = amountStatus;
	}

	/**
	 * @return the orderStatus
	 */
	public Integer getOrderStatus() {
		return orderStatus;
	}

	/**
	 * @param orderStatus
	 *            the orderStatus to set
	 */
	public void setOrderStatus(Integer orderStatus) {
		this.orderStatus = orderStatus;
	}

}
