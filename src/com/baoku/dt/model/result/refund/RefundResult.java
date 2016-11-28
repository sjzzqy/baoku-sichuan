/**
 * @Copyright (c) 宝库技术团队 www.baoku.com
 * @authur Allen
 * @Generated: 2016-8-4 上午10:53:29
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
@XmlRootElement(name = "Refunds")
public class RefundResult {

	@XmlElement(name = "Refund")
	private Set<Refunds> refunds;

	/**
	 * @return the refunds
	 */
	public Set<Refunds> getRefunds() {
		return refunds;
	}

	/**
	 * @param refunds
	 *            the refunds to set
	 */
	public void setRefunds(Set<Refunds> refunds) {
		this.refunds = refunds;
	}

}
