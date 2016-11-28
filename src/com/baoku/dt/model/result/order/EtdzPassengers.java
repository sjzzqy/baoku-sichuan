/**
 * @Copyright (c) 宝库技术团队 www.baoku.com
 * @authur Allen
 * @Generated: 2016-8-1 下午4:05:46
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
@XmlRootElement(name = "Passengers")
public class EtdzPassengers {

	@XmlElement(name = "Passenger")
	private Set<EtdzPassenger> etdzPassenger;

	/**
	 * @return the etdzPassenger
	 */
	public Set<EtdzPassenger> getEtdzPassenger() {
		return etdzPassenger;
	}

	/**
	 * @param etdzPassenger
	 *            the etdzPassenger to set
	 */
	public void setEtdzPassenger(Set<EtdzPassenger> etdzPassenger) {
		this.etdzPassenger = etdzPassenger;
	}

}
