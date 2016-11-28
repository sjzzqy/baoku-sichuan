/**
 * @Copyright (c) 宝库技术团队 www.baoku.com
 * @authur Allen
 * @Generated: 2016-10-10 下午7:50:41
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
@XmlRootElement(name = "Result")
public class TicketStatusResult {

	@XmlElement(name = "Order")
	private Set<TicketState> state;

	/**
	 * @return the state
	 */
	public Set<TicketState> getState() {
		return state;
	}

	/**
	 * @param state
	 *            the state to set
	 */
	public void setState(Set<TicketState> state) {
		this.state = state;
	}

}
