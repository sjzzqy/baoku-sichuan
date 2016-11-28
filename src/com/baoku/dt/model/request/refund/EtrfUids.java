/**
 * @Copyright (c) 宝库技术团队 www.baoku.com
 * @authur Allen
 * @Generated: 2016-8-4 上午9:37:30
 */
package com.baoku.dt.model.request.refund;

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
@XmlRootElement(name = "Uids")
public class EtrfUids {

	@XmlElement(name = "UID")
	private Set<String> uids;

	/**
	 * @return the uids
	 */
	public Set<String> getUids() {
		return uids;
	}

	/**
	 * @param uids
	 *            the uids to set
	 */
	public void setUids(Set<String> uids) {
		this.uids = uids;
	}

}
