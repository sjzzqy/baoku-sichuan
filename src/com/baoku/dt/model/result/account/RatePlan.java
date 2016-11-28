/**
 * @Copyright (c) 宝库技术团队 www.baoku.com
 * @authur Allen
 * @Generated: 2016-7-6 下午4:33:35
 */
package com.baoku.dt.model.result.account;

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
@XmlRootElement(name = "RatePlan")
public class RatePlan {

	@XmlElement(name = "RatePlanId")
	private String ratePlanId;// 产品ID（业务主键）
	@XmlElement(name = "BuyerType")
	private String buyerType;// 产品类型ID
	@XmlElement(name = "RateName")
	private String rateName;// 产品主类型名称
	@XmlElement(name = "PlanName")
	private String planName;// 产品子类名称（对用户展示的产品名称）
	@XmlElement(name = "RatePlanCode")
	private String ratePlanCode;// 协议编号
	@XmlElement(name = "CardNo")
	private String cardNo;// 卡号
	@XmlElement(name = "Note")
	private String note;

	/**
	 * @return the ratePlanId
	 */
	public String getRatePlanId() {
		return ratePlanId;
	}

	/**
	 * @param ratePlanId
	 *            the ratePlanId to set
	 */
	public void setRatePlanId(String ratePlanId) {
		this.ratePlanId = ratePlanId;
	}

	/**
	 * @return the buyerType
	 */
	public String getBuyerType() {
		return buyerType;
	}

	/**
	 * @param buyerType
	 *            the buyerType to set
	 */
	public void setBuyerType(String buyerType) {
		this.buyerType = buyerType;
	}

	/**
	 * @return the rateName
	 */
	public String getRateName() {
		return rateName;
	}

	/**
	 * @param rateName
	 *            the rateName to set
	 */
	public void setRateName(String rateName) {
		this.rateName = rateName;
	}

	/**
	 * @return the planName
	 */
	public String getPlanName() {
		return planName;
	}

	/**
	 * @param planName
	 *            the planName to set
	 */
	public void setPlanName(String planName) {
		this.planName = planName;
	}

	/**
	 * @return the ratePlanCode
	 */
	public String getRatePlanCode() {
		return ratePlanCode;
	}

	/**
	 * @param ratePlanCode
	 *            the ratePlanCode to set
	 */
	public void setRatePlanCode(String ratePlanCode) {
		this.ratePlanCode = ratePlanCode;
	}

	/**
	 * @return the cardNo
	 */
	public String getCardNo() {
		return cardNo;
	}

	/**
	 * @param cardNo
	 *            the cardNo to set
	 */
	public void setCardNo(String cardNo) {
		this.cardNo = cardNo;
	}

	/**
	 * @return the note
	 */
	public String getNote() {
		return note;
	}

	/**
	 * @param note
	 *            the note to set
	 */
	public void setNote(String note) {
		this.note = note;
	}

}
