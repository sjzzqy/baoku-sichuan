/**
 * @Copyright (c) 宝库技术团队 www.baoku.com
 * @authur Allen
 * @Generated: 2017-2-16 上午9:53:12
 */
package com.baoku.dt.model.request.change;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * 创建改期订单
 * 
 * @Description: TODO(....)
 * @author Allen
 * @version V1.0
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "Condition")
public class CreateCondition {

	@XmlElement(name = "CustOrderNo")
	private String custOrderNo;
	@XmlElement(name = "BookManUid")
	private String bookManUid;
	@XmlElement(name = "Canbinkey")
	private String canbinkey;
	@XmlElement(name = "GoDate")
	private String goDate;

	/**
	 * custOrderNo
	 * 
	 * @return the custOrderNo
	 */
	public String getCustOrderNo() {
		return custOrderNo;
	}

	/**
	 * custOrderNo
	 * 
	 * @param custOrderNo
	 *            the custOrderNo to set
	 */
	public void setCustOrderNo(String custOrderNo) {
		this.custOrderNo = custOrderNo;
	}

	/**
	 * bookManUid
	 * 
	 * @return the bookManUid
	 */
	public String getBookManUid() {
		return bookManUid;
	}

	/**
	 * bookManUid
	 * 
	 * @param bookManUid
	 *            the bookManUid to set
	 */
	public void setBookManUid(String bookManUid) {
		this.bookManUid = bookManUid;
	}

	/**
	 * canbinkey
	 * 
	 * @return the canbinkey
	 */
	public String getCanbinkey() {
		return canbinkey;
	}

	/**
	 * canbinkey
	 * 
	 * @param canbinkey
	 *            the canbinkey to set
	 */
	public void setCanbinkey(String canbinkey) {
		this.canbinkey = canbinkey;
	}

	/**
	 * goDate
	 * 
	 * @return the goDate
	 */
	public String getGoDate() {
		return goDate;
	}

	/**
	 * goDate
	 * 
	 * @param goDate
	 *            the goDate to set
	 */
	public void setGoDate(String goDate) {
		this.goDate = goDate;
	}

}
