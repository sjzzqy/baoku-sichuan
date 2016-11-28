/**
 * @Copyright (c) 宝库技术团队 www.baoku.com
 * @authur Allen
 * @Generated: 2016-8-12 上午9:23:33
 */
package com.baoku.dt.model.request.order;

import java.util.Set;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * 查询订单状态
 * 
 * @Description: TODO(....)
 * @author Allen
 * @version V1.0
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "IncrStatusCondition")
public class IncrStatusCondition {

	@XmlElement(name = "OrderNo")
	private Set<String> orderNo;

	/**
	 * @return the orderNo
	 */
	public Set<String> getOrderNo() {
		return orderNo;
	}

	/**
	 * @param orderNo
	 *            the orderNo to set
	 */
	public void setOrderNo(Set<String> orderNo) {
		this.orderNo = orderNo;
	}

}
