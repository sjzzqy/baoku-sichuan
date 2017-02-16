/**
 * @Copyright (c) 宝库技术团队 www.baoku.com
 * @authur Allen
 * @Generated: 2016-7-22 下午3:26:26
 */
package com.baoku.dt.model.request;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import com.baoku.dt.model.result.order.Contacts;

/**
 * 创建订单
 * 
 * @Description: TODO(....)
 * @author Allen
 * @version V1.0
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "CreateOrderCondition")
public class CreateOrderCondition {

	@XmlElement(name = "CustOrderNo")
	private String custOrderNo;// 合作伙伴订单号
	@XmlElement(name = "CusBigCode")
	private String cusBigCode;
	@XmlElement(name = "OrderType")
	private String orderType;
	@XmlElement(name = "BookManUid")
	private String bookManUid;
	@XmlElement(name = "Ftype")
	private String ftype;// ow单程 rt往返 uw多程
	@XmlElement(name = "FP")
	private String fp;// PNR FP项内容
	@XmlElement(name = "Contacts")
	private Contacts contacts;// 联系人
	@XmlElement(name = "Segments")
	private Segments segments;// 航段
	@XmlElement(name = "Passengers")
	private Passengers passengers;// 乘机人

	/**
	 * @return the custOrderNo
	 */
	public String getCustOrderNo() {
		return custOrderNo;
	}

	/**
	 * @param custOrderNo
	 *            the custOrderNo to set
	 */
	public void setCustOrderNo(String custOrderNo) {
		this.custOrderNo = custOrderNo;
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
	 * @return the orderType
	 */
	public String getOrderType() {
		return orderType;
	}

	/**
	 * @param orderType
	 *            the orderType to set
	 */
	public void setOrderType(String orderType) {
		this.orderType = orderType;
	}

	/**
	 * @return the bookManUid
	 */
	public String getBookManUid() {
		return bookManUid;
	}

	/**
	 * @param bookManUid
	 *            the bookManUid to set
	 */
	public void setBookManUid(String bookManUid) {
		this.bookManUid = bookManUid;
	}

	/**
	 * @return the ftype
	 */
	public String getFtype() {
		return ftype;
	}

	/**
	 * @param ftype
	 *            the ftype to set
	 */
	public void setFtype(String ftype) {
		this.ftype = ftype;
	}

	/**
	 * @return the contacts
	 */
	public Contacts getContacts() {
		return contacts;
	}

	/**
	 * @param contacts
	 *            the contacts to set
	 */
	public void setContacts(Contacts contacts) {
		this.contacts = contacts;
	}

	/**
	 * @return the segments
	 */
	public Segments getSegments() {
		return segments;
	}

	/**
	 * @param segments
	 *            the segments to set
	 */
	public void setSegments(Segments segments) {
		this.segments = segments;
	}

	/**
	 * @return the passengers
	 */
	public Passengers getPassengers() {
		return passengers;
	}

	/**
	 * @param passengers
	 *            the passengers to set
	 */
	public void setPassengers(Passengers passengers) {
		this.passengers = passengers;
	}

	/**
	 * fp
	 * 
	 * @return the fp
	 */
	public String getFp() {
		return fp;
	}

	/**
	 * fp
	 * 
	 * @param fp
	 *            the fp to set
	 */
	public void setFp(String fp) {
		this.fp = fp;
	}

}
