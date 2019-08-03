/**
 * @Copyright (c) 宝库技术团队 www.baoku.com
 * @authur Qzzy
 * @Generated: 2019年4月19日上午9:43:07
 */
package com.baoku.dt.model.request.order;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * 十、 支付&出票接口
 * 
 * @author Qzzy
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "EtdzCreditCondition")
public class EtdzCreditCondition {

	private String orderNo;// 订单号
	private String payerAct;// 付款人登录账号
	private String payment;// 支付方式
	private String cardNo;// 卡号
	private String cardpwd;// 卡支付密码
	private String cardExp;// 信用卡有效期
	private String holder;// 持卡人姓名
	private String mobile;// 持卡人手机号
	private String cvv;// 信用卡CVV码
	private String amount;// 付款金额
	private String returl;// 异步通知地址

	/**
	 * @return the orderNo
	 */
	public String getOrderNo() {
		return orderNo;
	}

	/**
	 * @param orderNo
	 *            the orderNo to set
	 */
	public void setOrderNo(String orderNo) {
		this.orderNo = orderNo;
	}

	/**
	 * @return the payerAct
	 */
	public String getPayerAct() {
		return payerAct;
	}

	/**
	 * @param payerAct
	 *            the payerAct to set
	 */
	public void setPayerAct(String payerAct) {
		this.payerAct = payerAct;
	}

	/**
	 * @return the payment
	 */
	public String getPayment() {
		return payment;
	}

	/**
	 * @param payment
	 *            the payment to set
	 */
	public void setPayment(String payment) {
		this.payment = payment;
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
	 * @return the cardpwd
	 */
	public String getCardpwd() {
		return cardpwd;
	}

	/**
	 * @param cardpwd
	 *            the cardpwd to set
	 */
	public void setCardpwd(String cardpwd) {
		this.cardpwd = cardpwd;
	}

	/**
	 * @return the cardExp
	 */
	public String getCardExp() {
		return cardExp;
	}

	/**
	 * @param cardExp
	 *            the cardExp to set
	 */
	public void setCardExp(String cardExp) {
		this.cardExp = cardExp;
	}

	/**
	 * @return the holder
	 */
	public String getHolder() {
		return holder;
	}

	/**
	 * @param holder
	 *            the holder to set
	 */
	public void setHolder(String holder) {
		this.holder = holder;
	}

	/**
	 * @return the mobile
	 */
	public String getMobile() {
		return mobile;
	}

	/**
	 * @param mobile
	 *            the mobile to set
	 */
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	/**
	 * @return the cvv
	 */
	public String getCvv() {
		return cvv;
	}

	/**
	 * @param cvv
	 *            the cvv to set
	 */
	public void setCvv(String cvv) {
		this.cvv = cvv;
	}

	/**
	 * @return the amount
	 */
	public String getAmount() {
		return amount;
	}

	/**
	 * @param amount
	 *            the amount to set
	 */
	public void setAmount(String amount) {
		this.amount = amount;
	}

	/**
	 * @return the returl
	 */
	public String getReturl() {
		return returl;
	}

	/**
	 * @param returl
	 *            the returl to set
	 */
	public void setReturl(String returl) {
		this.returl = returl;
	}

}
