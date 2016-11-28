/**
 * @Copyright (c) 宝库技术团队 www.baoku.com
 * @authur Allen
 * @Generated: 2016-8-12 上午10:09:59
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
@XmlRootElement(name = "IncrStatus")
public class IncrStatus {

	@XmlElement(name = "Status")
	private Set<StatusResult> status;

	/**
	 * @return the status
	 */
	public Set<StatusResult> getStatus() {
		return status;
	}

	/**
	 * @param status
	 *            the status to set
	 */
	public void setStatus(Set<StatusResult> status) {
		this.status = status;
	}

}
