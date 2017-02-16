/**
 * @Copyright (c) 宝库技术团队 www.baoku.com
 * @authur Allen
 * @Generated: 2016-8-2 上午10:23:20
 */
package com.baoku.dt.model.result.refund;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import com.baoku.dt.model.common.CommonSegment;

/**
 * @Description: TODO(....)
 * @author Allen
 * @version V1.0
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "Item")
public class ApplyItem extends CommonSegment {

	@XmlElement(name = "UID")
	private String uid;
	@XmlElement(name = "Sequence")
	private String sequence;// 序号 Y（原单）123 N（新单）123
	@XmlElement(name = "ETNO")
	private String etno;// 票号
	@XmlElement(name = "CNo")
	private String cno;// 舱位
	@XmlElement(name = "Price")
	private double price;// 票款
	@XmlElement(name = "AirTax")
	private double airTax;// 成人机场建设费
	@XmlElement(name = "AddFare")
	private double addFare;// 成人燃油附加费
	@XmlElement(name = "Charge")
	private double charge;// 手续费
	@XmlElement(name = "TotalRefund")
	private double totalRefund;// 应退款

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
	 * @return the sequence
	 */
	public String getSequence() {
		return sequence;
	}

	/**
	 * @param sequence
	 *            the sequence to set
	 */
	public void setSequence(String sequence) {
		this.sequence = sequence;
	}

	/**
	 * @return the etno
	 */
	public String getEtno() {
		return etno;
	}

	/**
	 * @param etno
	 *            the etno to set
	 */
	public void setEtno(String etno) {
		this.etno = etno;
	}

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
	 * @return the airTax
	 */
	public double getAirTax() {
		return airTax;
	}

	/**
	 * @param airTax
	 *            the airTax to set
	 */
	public void setAirTax(double airTax) {
		this.airTax = airTax;
	}

	/**
	 * @return the addFare
	 */
	public double getAddFare() {
		return addFare;
	}

	/**
	 * @param addFare
	 *            the addFare to set
	 */
	public void setAddFare(double addFare) {
		this.addFare = addFare;
	}

	/**
	 * @return the charge
	 */
	public double getCharge() {
		return charge;
	}

	/**
	 * @param charge
	 *            the charge to set
	 */
	public void setCharge(double charge) {
		this.charge = charge;
	}

	/**
	 * @return the totalRefund
	 */
	public double getTotalRefund() {
		return totalRefund;
	}

	/**
	 * @param totalRefund
	 *            the totalRefund to set
	 */
	public void setTotalRefund(double totalRefund) {
		this.totalRefund = totalRefund;
	}

}
