/**
 * @Copyright (c) 宝库技术团队 www.baoku.com
 * @authur Allen
 * @Generated: 2016-10-10 下午6:22:32
 */
package com.baoku.dt.model.request;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * 清Q使用
 * <p>
 * 获取订单联系人信息
 * </p>
 * 
 * @Description: TODO(....)
 * @author Allen
 * @version V1.0
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "Root")
public class OrderContactCondition {

	@XmlElement(name = "PNR")
	private String pnr;
	@XmlElement(name = "OrgCity")
	private String orgCity;
	@XmlElement(name = "DesCity")
	private String desCity;
	@XmlElement(name = "TakeoffTime")
	private String takeoffTime;

	/**
	 * @return the pnr
	 */
	public String getPnr() {
		return pnr;
	}

	/**
	 * @param pnr
	 *            the pnr to set
	 */
	public void setPnr(String pnr) {
		this.pnr = pnr;
	}

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
	 * @return the takeoffTime
	 */
	public String getTakeoffTime() {
		return takeoffTime;
	}

	/**
	 * @param takeoffTime
	 *            the takeoffTime to set
	 */
	public void setTakeoffTime(String takeoffTime) {
		this.takeoffTime = takeoffTime;
	}

}
