/**
 * @Copyright (c) 宝库技术团队 www.baoku.com
 * @authur Allen
 * @Generated: 2016-7-6 下午4:17:25
 */
package com.baoku.dt.model.result.account;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * 员工信息
 * 
 * @Description: TODO(....)
 * @author Allen
 * @version V1.0
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "Account")
public class Account {

	@XmlElement(name = "UID")
	private String uid;// 唯一编码
	@XmlElement(name = "Name")
	private String name;// 姓名
	@XmlElement(name = "EmpNumber")
	private String empNumber;// 工号
	@XmlElement(name = "Gender")
	private String gender;// 性别 Female 女，Maile 男
	@XmlElement(name = "Mobile")
	private String mobile;// 手机号

	private Company Company;// 公司信息
	private RatePlans Plans;// 产品协议

	private ScalCards Cards;// 常客卡
	private IdCards IdCards;// 证件

	// private DepartMent DepartMent;// 部门
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
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name
	 *            the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the empNumber
	 */
	public String getEmpNumber() {
		return empNumber;
	}

	/**
	 * @param empNumber
	 *            the empNumber to set
	 */
	public void setEmpNumber(String empNumber) {
		this.empNumber = empNumber;
	}

	/**
	 * @return the gender
	 */
	public String getGender() {
		return gender;
	}

	/**
	 * @param gender
	 *            the gender to set
	 */
	public void setGender(String gender) {
		this.gender = gender;
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
	 * @return the company
	 */
	public Company getCompany() {
		return Company;
	}

	/**
	 * @param company
	 *            the company to set
	 */
	public void setCompany(Company company) {
		Company = company;
	}

	/**
	 * @return the plans
	 */
	public RatePlans getPlans() {
		return Plans;
	}

	/**
	 * @param plans
	 *            the plans to set
	 */
	public void setPlans(RatePlans plans) {
		Plans = plans;
	}

	/**
	 * @return the cards
	 */
	public ScalCards getCards() {
		return Cards;
	}

	/**
	 * @param cards
	 *            the cards to set
	 */
	public void setCards(ScalCards cards) {
		Cards = cards;
	}

	/**
	 * @return the idCards
	 */
	public IdCards getIdCards() {
		return IdCards;
	}

	/**
	 * @param idCards
	 *            the idCards to set
	 */
	public void setIdCards(IdCards idCards) {
		IdCards = idCards;
	}

}
