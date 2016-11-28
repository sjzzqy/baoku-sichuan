/**
 * @Copyright (c) 宝库技术团队 www.baoku.com
 * @authur Allen
 * @Generated: 2016-7-22 下午4:00:19
 */
package com.baoku.dt.model.request;

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
@XmlRootElement(name = "Passengers")
public class Passengers {

	@XmlElement(name = "Passenger")
	private Set<Passenger> passenger;

	/**
	 * @return the passenger
	 */
	public Set<Passenger> getPassenger() {
		return passenger;
	}

	/**
	 * @param passenger
	 *            the passenger to set
	 */
	public void setPassenger(Set<Passenger> passenger) {
		this.passenger = passenger;
	}

}
