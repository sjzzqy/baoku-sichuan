/**
 * @Copyright (c) 宝库技术团队 www.baoku.com
 * @authur Allen
 * @Generated: 2016-7-5 上午11:09:18
 */
package com.baoku.dt.model.result;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * 舱位
 * 
 * @Description: TODO(....)
 * @author Allen
 * @version V1.0
 */
@XmlRootElement(name = "Cabin")
@XmlAccessorType(XmlAccessType.FIELD)
public class CabinItem {

	@XmlElement(name = "CNo")
	private String cno;// 舱位代码
	@XmlElement(name = "CName")
	private String cname;// 舱位中文描述
	@XmlElement(name = "Fdprice")
	private double fdprice;// FD价格，不可购买。
	@XmlElement(name = "Price")
	private double price;// 可售价格
	@XmlElement(name = "Seatnum")
	private String seatnum;// A 为9 个以上含9 个
	@XmlElement(name = "ReFundRule")
	private String reFundRule;// 退票规定
	@XmlElement(name = "ChangeRule")
	private String changeRule;// 改期规定
	@XmlElement(name = "SignRule")
	private String signRule;// 签转规定
	@XmlElement(name = "ClassLevel")
	private String classLevel;// 舱位等级

	/**
	 * @return the cno
	 */
	public String getCno() {
		return cno;
	}

	/**
	 * @param cno
	 *            the cno to set
	 */
	public void setCno(String cno) {
		this.cno = cno;
	}

	/**
	 * @return the cname
	 */
	public String getCname() {
		return cname;
	}

	/**
	 * @param cname
	 *            the cname to set
	 */
	public void setCname(String cname) {
		this.cname = cname;
	}

	/**
	 * @return the fdprice
	 */
	public double getFdprice() {
		return fdprice;
	}

	/**
	 * @param fdprice
	 *            the fdprice to set
	 */
	public void setFdprice(double fdprice) {
		this.fdprice = fdprice;
	}

	/**
	 * @return the price
	 */
	public double getPrice() {
		return price;
	}

	/**
	 * @param price
	 *            the price to set
	 */
	public void setPrice(double price) {
		this.price = price;
	}

	/**
	 * @return the seatnum
	 */
	public String getSeatnum() {
		return seatnum;
	}

	/**
	 * @param seatnum
	 *            the seatnum to set
	 */
	public void setSeatnum(String seatnum) {
		this.seatnum = seatnum;
	}

	/**
	 * @return the reFundRule
	 */
	public String getReFundRule() {
		return reFundRule;
	}

	/**
	 * @param reFundRule
	 *            the reFundRule to set
	 */
	public void setReFundRule(String reFundRule) {
		this.reFundRule = reFundRule;
	}

	/**
	 * @return the changeRule
	 */
	public String getChangeRule() {
		return changeRule;
	}

	/**
	 * @param changeRule
	 *            the changeRule to set
	 */
	public void setChangeRule(String changeRule) {
		this.changeRule = changeRule;
	}

	/**
	 * @return the signRule
	 */
	public String getSignRule() {
		return signRule;
	}

	/**
	 * @param signRule
	 *            the signRule to set
	 */
	public void setSignRule(String signRule) {
		this.signRule = signRule;
	}

	/**
	 * @return the classLevel
	 */
	public String getClassLevel() {
		return classLevel;
	}

	/**
	 * @param classLevel
	 *            the classLevel to set
	 */
	public void setClassLevel(String classLevel) {
		this.classLevel = classLevel;
	}

}
