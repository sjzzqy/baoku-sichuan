/**
 * @Copyright (c) 宝库技术团队 www.baoku.com
 * @authur Allen
 * @Generated: 2016-7-5 上午9:23:05
 */
package com.baoku.dt.model.result;

import java.util.Set;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * 航班列表
 * 
 * @Description: TODO(....)
 * @author Allen
 * @version V1.0
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "AvResult")
public class AvResult {

	@XmlElement(name = "Item")
	private Set<FlightItem> item;

	/**
	 * @return the item
	 */
	public Set<FlightItem> getItem() {
		return item;
	}

	/**
	 * @param item
	 *            the item to set
	 */
	public void setItem(Set<FlightItem> item) {
		this.item = item;
	}

}
