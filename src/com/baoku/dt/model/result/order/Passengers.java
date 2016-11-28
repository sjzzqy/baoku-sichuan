/**
 * @Copyright (c) 宝库技术团队 www.baoku.com
 * @authur Allen
 * @Generated: 2016-7-21 上午10:27:10
 */
package com.baoku.dt.model.result.order;

import java.util.Set;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * @Description: TODO(....)
 * @author Allen
 * @version V1.0
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "Passengers")
public class Passengers {

	private Set<Passenger> Passenger;

	/**
	 * @return the passenger
	 */
	public Set<Passenger> getPassenger() {
		return Passenger;
	}

	/**
	 * @param passenger
	 *            the passenger to set
	 */
	public void setPassenger(Set<Passenger> passenger) {
		Passenger = passenger;
	}

}
