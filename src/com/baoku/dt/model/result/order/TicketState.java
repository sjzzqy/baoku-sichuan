/**
 * @Copyright (c) 宝库技术团队 www.baoku.com
 * @authur Allen
 * @Generated: 2016-10-10 下午7:44:12
 */
package com.baoku.dt.model.result.order;

import java.util.Set;

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
@XmlRootElement(name = "TicketState")
public class TicketState {

	@XmlElement(name = "OrderNo")
	private String orderNo;
	@XmlElement(name = "Seg")
	private Set<TicketStatus> seg;

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
	 * @return the seg
	 */
	public Set<TicketStatus> getSeg() {
		return seg;
	}

	/**
	 * @param seg
	 *            the seg to set
	 */
	public void setSeg(Set<TicketStatus> seg) {
		this.seg = seg;
	}

}
