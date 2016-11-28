/**
 * @Copyright (c) 宝库技术团队 www.baoku.com
 * @authur Allen
 * @Generated: 2016-10-10 下午7:44:12
 */
package com.baoku.dt.model.result.order;

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
@XmlRootElement(name = "TicketStatus")
public class TicketStatus {

	@XmlElement(name = "ETNO")
	private String etno;
	@XmlElement(name = "Status")
	private String status;

	/**
	 * @return the etno
	 */
	public String getEtno() {
		return etno;
	}

	/**
	 * @param etno
	 *            the etno to set
	 */
	public void setEtno(String etno) {
		this.etno = etno;
	}

	/**
	 * @return the status
	 */
	public String getStatus() {
		return status;
	}

	/**
	 * @param status
	 *            the status to set
	 */
	public void setStatus(String status) {
		this.status = status;
	}

}
