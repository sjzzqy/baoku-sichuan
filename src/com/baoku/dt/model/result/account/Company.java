/**
 * @Copyright (c) 宝库技术团队 www.baoku.com
 * @authur Allen
 * @Generated: 2016-7-6 下午4:26:51
 */
package com.baoku.dt.model.result.account;

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
@XmlRootElement(name = "Company")
public class Company {

	@XmlElement(name = "CusBigCode")
	private String cusBigCode;// 大客户编码
	@XmlElement(name = "Name")
	private String name;// 公司名称
	@XmlElement(name = "Address")
	private String address;// 地址
	@XmlElement(name = "Scope")
	private String scope;// 公司规模
	@XmlElement(name = "SaleDept")
	private String saleDept;// 所属营业部名称
	@XmlElement(name = "Industry")
	private String industry;// 经营行业
	@XmlElement(name = "Sales")
	private String sales;// 川航票量
	@XmlElement(name = "Fax")
	private String fax; // 客户传真
	@XmlElement(name = "ZipCode")
	private String zipCode; // 邮政编码
	@XmlElement(name = "CName")
	private String cname; // 联系人姓名
	@XmlElement(name = "CTel")
	private String ctel; // 联系电话

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
	 * @return the address
	 */
	public String getAddress() {
		return address;
	}

	/**
	 * @param address
	 *            the address to set
	 */
	public void setAddress(String address) {
		this.address = address;
	}

	/**
	 * @return the scope
	 */
	public String getScope() {
		return scope;
	}

	/**
	 * @param scope
	 *            the scope to set
	 */
	public void setScope(String scope) {
		this.scope = scope;
	}

	/**
	 * @return the saleDept
	 */
	public String getSaleDept() {
		return saleDept;
	}

	/**
	 * @param saleDept
	 *            the saleDept to set
	 */
	public void setSaleDept(String saleDept) {
		this.saleDept = saleDept;
	}

	/**
	 * @return the industry
	 */
	public String getIndustry() {
		return industry;
	}

	/**
	 * @param industry
	 *            the industry to set
	 */
	public void setIndustry(String industry) {
		this.industry = industry;
	}

	/**
	 * @return the sales
	 */
	public String getSales() {
		return sales;
	}

	/**
	 * @param sales
	 *            the sales to set
	 */
	public void setSales(String sales) {
		this.sales = sales;
	}

	/**
	 * @return the fax
	 */
	public String getFax() {
		return fax;
	}

	/**
	 * @param fax
	 *            the fax to set
	 */
	public void setFax(String fax) {
		this.fax = fax;
	}

	/**
	 * @return the zipCode
	 */
	public String getZipCode() {
		return zipCode;
	}

	/**
	 * @param zipCode
	 *            the zipCode to set
	 */
	public void setZipCode(String zipCode) {
		this.zipCode = zipCode;
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
	 * @return the ctel
	 */
	public String getCtel() {
		return ctel;
	}

	/**
	 * @param ctel
	 *            the ctel to set
	 */
	public void setCtel(String ctel) {
		this.ctel = ctel;
	}

}
