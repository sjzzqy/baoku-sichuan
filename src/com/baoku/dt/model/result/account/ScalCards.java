/**
 * @Copyright (c) 宝库技术团队 www.baoku.com
 * @authur Allen
 * @Generated: 2016-7-6 下午4:54:43
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
@XmlRootElement(name = "Cards")
public class ScalCards {

	private List<ScalCard> Card;// 常旅客卡号

	/**
	 * @return the card
	 */
	public List<ScalCard> getCard() {
		return Card;
	}

	/**
	 * @param card
	 *            the card to set
	 */
	public void setCard(List<ScalCard> card) {
		Card = card;
	}

}
