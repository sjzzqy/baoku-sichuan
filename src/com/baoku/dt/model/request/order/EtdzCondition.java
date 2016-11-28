/**
 * @Copyright (c) 宝库技术团队 www.baoku.com
 * @authur Allen
 * @Generated: 2016-8-1 下午3:34:05
 */
package com.baoku.dt.model.request.order;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * 出票
 * 
 * @Description: TODO(....)
 * @author Allen
 * @version V1.0
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "EtdzCondition")
public class EtdzCondition {

	@XmlElement(name = "CusBigCode")
	private String cusBigCode;
	@XmlElement(name = "OrderNo")
	private String orderNo;
	@XmlElement(name = "BankOrderNo")
	private String bankOrderNo;
	@XmlElement(name = "PayOrderNo")
	private String payOrderNo;
	@XmlElement(name = "Amout")
	private Double amout;
	@XmlElement(name = "PayChannel")
	private String payChannel;
	@XmlElement(name = "PayChanmes")
	private String payChanmes;

	/**
	 * @return the cusBigCode
	 */
	public String getCusBigCode() {
		return cusBigCode;
	}

	/**
	 * @param cusBigCode
	 *            the cusBigCode to set
	 */
	public void setCusBigCode(String cusBigCode) {
		this.cusBigCode = cusBigCode;
	}

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
	 * @return the bankOrderNo
	 */
	public String getBankOrderNo() {
		return bankOrderNo;
	}

	/**
	 * @param bankOrderNo
	 *            the bankOrderNo to set
	 */
	public void setBankOrderNo(String bankOrderNo) {
		this.bankOrderNo = bankOrderNo;
	}

	/**
	 * @return the payOrderNo
	 */
	public String getPayOrderNo() {
		return payOrderNo;
	}

	/**
	 * @param payOrderNo
	 *            the payOrderNo to set
	 */
	public void setPayOrderNo(String payOrderNo) {
		this.payOrderNo = payOrderNo;
	}

	/**
	 * @return the amout
	 */
	public Double getAmout() {
		return amout;
	}

	/**
	 * @param amout
	 *            the amout to set
	 */
	public void setAmout(Double amout) {
		this.amout = amout;
	}

	/**
	 * @return the payChannel
	 */
	public String getPayChannel() {
		return payChannel;
	}

	/**
	 * @param payChannel
	 *            the payChannel to set
	 */
	public void setPayChannel(String payChannel) {
		this.payChannel = payChannel;
	}

	/**
	 * @return the payChanmes
	 */
	public String getPayChanmes() {
		return payChanmes;
	}

	/**
	 * @param payChanmes
	 *            the payChanmes to set
	 */
	public void setPayChanmes(String payChanmes) {
		this.payChanmes = payChanmes;
	}

}
