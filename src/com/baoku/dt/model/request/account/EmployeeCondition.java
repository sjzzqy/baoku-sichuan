/**
 * @Copyright (c) 宝库技术团队 www.baoku.com
 * @authur Allen
 * @Generated: 2016-7-19 下午5:47:58
 */
package com.baoku.dt.model.request.account;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import com.baoku.dt.model.common.PageCondition;

/**com.baoku.dt.model
 * @Description: TODO(....)
 * @author Allen
 * @version V1.0
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "EmployeeCondition")
public class EmployeeCondition extends PageCondition {

	@XmlElement(name = "CusBigCode")
	private String cusBigCode;// 大客户编码
	@XmlElement(name = "EmpName")
	private String empName;// 员工姓名
	@XmlElement(name = "Mobile")
	private String mobile;// 手机号
	@XmlElement(name = "Number")
	private String number;// 员工编号

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
	 * @return the empName
	 */
	public String getEmpName() {
		return empName;
	}

	/**
	 * @param empName
	 *            the empName to set
	 */
	public void setEmpName(String empName) {
		this.empName = empName;
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
	 * @return the number
	 */
	public String getNumber() {
		return number;
	}

	/**
	 * @param number
	 *            the number to set
	 */
	public void setNumber(String number) {
		this.number = number;
	}

}
