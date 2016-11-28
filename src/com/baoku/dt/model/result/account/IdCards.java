/**
 * @Copyright (c) 宝库技术团队 www.baoku.com
 * @authur Allen
 * @Generated: 2016-7-6 下午4:56:00
 */
package com.baoku.dt.model.result.account;

import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * @Description: TODO(....)
 * @author Allen
 * @version V1.0
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "IdCards")
public class IdCards {

	private List<IdCard> IdCard;// 证件

	/**
	 * @return the idCard
	 */
	public List<IdCard> getIdCard() {
		return IdCard;
	}

	/**
	 * @param idCard
	 *            the idCard to set
	 */
	public void setIdCard(List<IdCard> idCard) {
		IdCard = idCard;
	}

}
