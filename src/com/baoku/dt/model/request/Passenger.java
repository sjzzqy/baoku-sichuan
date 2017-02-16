/**
 * @Copyright (c) 宝库技术团队 www.baoku.com
 * @authur Allen
 * @Generated: 2016-7-22 下午4:00:29
 */
package com.baoku.dt.model.request;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import com.baoku.dt.model.common.CommonPassenger;

/**
 * @Description: TODO(....)
 * @author Allen
 * @version V1.0
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "Passenger")
public class Passenger extends CommonPassenger {

	@XmlElement(name = "UID")
	private String uid;
	@XmlElement(name = "ScalCard")
	private String scalCard;

	/**
	 * @return the uid
	 */
	public String getUid() {
		return uid;
	}

	/**
	 * @param uid
	 *            the uid to set
	 */
	public void setUid(String uid) {
		this.uid = uid;
	}

	/**
	 * @return the scalCard
	 */
	public String getScalCard() {
		return scalCard;
	}

	/**
	 * @param scalCard
	 *            the scalCard to set
	 */
	public void setScalCard(String scalCard) {
		this.scalCard = scalCard;
	}

}
