/**
 * @Copyright (c) 宝库技术团队 www.baoku.com
 * @authur Allen
 * @Generated: 2016-7-21 上午10:36:28
 */
package com.baoku.dt.model.result.order;

import java.util.Set;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * 价格表
 * 
 * @Description: TODO(....)
 * @author Allen
 * @version V1.0
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "Tickets")
public class Tickets {

	private Set<Ticket> Ticket;

	/**
	 * @return the ticket
	 */
	public Set<Ticket> getTicket() {
		return Ticket;
	}

	/**
	 * @param ticket
	 *            the ticket to set
	 */
	public void setTicket(Set<Ticket> ticket) {
		Ticket = ticket;
	}

}
