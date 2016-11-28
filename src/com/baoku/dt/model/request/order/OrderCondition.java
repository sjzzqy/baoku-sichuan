/**
 * @Copyright (c) 宝库技术团队 www.baoku.com
 * @authur Allen
 * @Generated: 2016-8-1 下午1:46:33
 */
package com.baoku.dt.model.request.order;

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
@XmlRootElement(name = "CancelCondition")
public class OrderCondition {

	@XmlElement(name = "OrderNo")
	private String orderNo;
	@XmlElement(name = "CusBigCode")
	private String cusBigCode;// 大客户编码
	@XmlElement(name = "Cancel")
	private String cancel;// 订单取消原因

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
	 * @return the cancel
	 */
	public String getCancel() {
		return cancel;
	}

	/**
	 * @param cancel
	 *            the cancel to set
	 */
	public void setCancel(String cancel) {
		this.cancel = cancel;
	}

}
