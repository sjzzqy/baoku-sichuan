/**
 * @Copyright (c) 宝库技术团队 www.baoku.com
 * @authur Allen
 * @Generated: 2016-7-6 下午4:40:07
 */
package com.baoku.dt.model.result.account;

import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * 协议产品
 * 
 * @Description: TODO(....)
 * @author Allen
 * @version V1.0
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "Plans")
public class RatePlans {

	@XmlElement(name = "RatePlan")
	private List<RatePlan> ratePlan;

	/**
	 * @return the ratePlan
	 */
	public List<RatePlan> getRatePlan() {
		return ratePlan;
	}

	/**
	 * @param ratePlan
	 *            the ratePlan to set
	 */
	public void setRatePlan(List<RatePlan> ratePlan) {
		this.ratePlan = ratePlan;
	}

}
