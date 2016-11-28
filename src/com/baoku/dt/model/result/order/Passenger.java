/**
 * @Copyright (c) 宝库技术团队 www.baoku.com
 * @authur Allen
 * @Generated: 2016-7-21 上午10:28:08
 */
package com.baoku.dt.model.result.order;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import com.baoku.dt.model.common.CommonPassenger;

/**
 * @Description: TODO(....)
 * @author Allen
 * @version V1.0
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "Passenger")
public class Passenger extends CommonPassenger {

	@XmlElement(name = "Sequence")
	private String sequence;// 乘机人顺序
	@XmlElement(name = "Tickets")
	private Tickets Tickets;// 价格表

	/**
	 * @return the sequence
	 */
	public String getSequence() {
		return sequence;
	}

	/**
	 * @param sequence
	 *            the sequence to set
	 */
	public void setSequence(String sequence) {
		this.sequence = sequence;
	}

	/**
	 * @return the tickets
	 */
	public Tickets getTickets() {
		return Tickets;
	}

	/**
	 * @param tickets
	 *            the tickets to set
	 */
	public void setTickets(Tickets tickets) {
		Tickets = tickets;
	}

}
