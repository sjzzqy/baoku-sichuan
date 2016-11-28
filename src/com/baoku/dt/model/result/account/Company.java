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

	public String getCusBigCode() {
		return cusBigCode;
	}

	public void setCusBigCode(String cusBigCode) {
		this.cusBigCode = cusBigCode;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getScope() {
		return scope;
	}

	public void setScope(String scope) {
		this.scope = scope;
	}

	public String getSaleDept() {
		return saleDept;
	}

	public void setSaleDept(String saleDept) {
		this.saleDept = saleDept;
	}

	public String getIndustry() {
		return industry;
	}

	public void setIndustry(String industry) {
		this.industry = industry;
	}

	public String getSales() {
		return sales;
	}

	public void setSales(String sales) {
		this.sales = sales;
	}

	public String getFax() {
		return fax;
	}

	public void setFax(String fax) {
		this.fax = fax;
	}

	public String getZipCode() {
		return zipCode;
	}

	public void setZipCode(String zipCode) {
		this.zipCode = zipCode;
	}

	public String getCname() {
		return cname;
	}

	public void setCname(String cname) {
		this.cname = cname;
	}

	public String getCtel() {
		return ctel;
	}

	public void setCtel(String ctel) {
		this.ctel = ctel;
	}

}
