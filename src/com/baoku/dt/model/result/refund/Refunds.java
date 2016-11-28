/**
 * @Copyright (c) 宝库技术团队 www.baoku.com
 * @authur Allen
 * @Generated: 2016-8-4 上午10:54:29
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
@XmlRootElement(name = "Refund")
public class Refunds {

	@XmlElement(name = "RefundNo")
	private String refundNo;// 退票单号
	@XmlElement(name = "OrderNo")
	private String orderNo;// 订单号

	/**
	 * @return the refundNo
	 */
	public String getRefundNo() {
		return refundNo;
	}

	/**
	 * @param refundNo
	 *            the refundNo to set
	 */
	public void setRefundNo(String refundNo) {
		this.refundNo = refundNo;
	}

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

}
