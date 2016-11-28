/**
 * @Copyright (c) 宝库技术团队 www.baoku.com
 * @authur Allen
 * @Generated: 2016-8-2 上午10:14:17
 */
package com.baoku.dt.model.result.refund;

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
@XmlRootElement(name = "Apply")
public class ApplyResult {

	@XmlElement(name = "Passenger")
	private Set<ApplyPassenger> passenger;

	/**
	 * @return the passenger
	 */
	public Set<ApplyPassenger> getPassenger() {
		return passenger;
	}

	/**
	 * @param passenger
	 *            the passenger to set
	 */
	public void setPassenger(Set<ApplyPassenger> passenger) {
		this.passenger = passenger;
	}

}
