/**
 * @Copyright (c) 宝库技术团队 www.baoku.com
 * @authur Allen
 * @Generated: 2016-7-5 上午9:21:45
 */
package com.baoku.dt.model.request;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * 查询航班
 * 
 * @Description: TODO(....)
 * @author Allen
 * @version V1.0
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "AvCondition")
public class AvCondition {

	@XmlElement(name = "OrgCity")
	private String orgCity;// 始发城市
	@XmlElement(name = "DesCity")
	private String desCity;// 到达城市
	@XmlElement(name = "GoDate")
	private String goDate;// //出发日期
	@XmlElement(name = "CusBigCode")
	private String cusBigCode;// 大客户编码
	/**
	 * @see com.baoku.common.product.company.entity.CompanyPrepayProduct.UID
	 */
	@XmlElement(name = "RatePlanId")
	private String ratePlanId;// 产品编码。默认请传0 不可为空。

	/**
	 * @return the orgCity
	 */
	public String getOrgCity() {
		return orgCity;
	}

	/**
	 * @param orgCity
	 *            the orgCity to set
	 */
	public void setOrgCity(String orgCity) {
		this.orgCity = orgCity;
	}

	/**
	 * @return the desCity
	 */
	public String getDesCity() {
		return desCity;
	}

	/**
	 * @param desCity
	 *            the desCity to set
	 */
	public void setDesCity(String desCity) {
		this.desCity = desCity;
	}

	/**
	 * @return the goDate
	 */
	public String getGoDate() {
		return goDate;
	}

	/**
	 * @param goDate
	 *            the goDate to set
	 */
	public void setGoDate(String goDate) {
		this.goDate = goDate;
	}

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

}
