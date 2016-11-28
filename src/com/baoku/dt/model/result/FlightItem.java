/**
 * @Copyright (c) 宝库技术团队 www.baoku.com
 * @authur Allen
 * @Generated: 2016-7-5 上午9:47:40
 */
package com.baoku.dt.model.result;

import java.util.Set;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;

/**
 * 航班
 * 
 * @Description: TODO(....)
 * @author Allen
 * @version V1.0
 */
@XmlRootElement(name = "Item")
@XmlAccessorType(XmlAccessType.FIELD)
public class FlightItem {
	@XmlElement(name = "FlightNo")
	private String flightNo;// 航班号
	@XmlElement(name = "Carrier")
	private String carrier;// 承运航班，共享航班该节点有值，否则为空
	@XmlElement(name = "OrgCity")
	private String orgCity;// 始发城市
	@XmlElement(name = "DepTerm")
	private String depTerm;// 始发航站楼
	@XmlElement(name = "DesCity")
	private String desCity;// 到达城市
	@XmlElement(name = "ArrTerm")
	private String arrTerm;// 达到航站楼
	@XmlSchemaType(name = "dateTime")
	@XmlElement(name = "TakeOffTime")
	private java.util.Date takeOffTime;// 起飞时间
	@XmlSchemaType(name = "dateTime")
	@XmlElement(name = "ArriveTime")
	private java.util.Date arriveTime;// 到达时间
	@XmlElement(name = "FlightTime")
	private String flightTime;// 飞行时间（分钟）
	@XmlElement(name = "PlaneModel")
	private String planeModel;// 机型
	@XmlElement(name = "AirTax")
	private double airTax;// 成人机场建设费
	@XmlElement(name = "AddFare")
	private double addFare;// 成人燃油附加费
	@XmlElement(name = "IsDirect")
	private boolean isDirect;// 是否直达
	@XmlElement(name = "IsShare")
	private boolean isShare;// 是否共享
	@XmlElement(name = "StopQuantity")
	private int stopQuantity;// 经停数量

	@XmlElement(name = "Cabin")
	private Set<CabinItem> cabin;// 舱位

	/**
	 * @return the flightNo
	 */
	public String getFlightNo() {
		return flightNo;
	}

	/**
	 * @param flightNo
	 *            the flightNo to set
	 */
	public void setFlightNo(String flightNo) {
		this.flightNo = flightNo;
	}

	/**
	 * @return the carrier
	 */
	public String getCarrier() {
		return carrier;
	}

	/**
	 * @param carrier
	 *            the carrier to set
	 */
	public void setCarrier(String carrier) {
		this.carrier = carrier;
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
	 * @return the depTerm
	 */
	public String getDepTerm() {
		return depTerm;
	}

	/**
	 * @param depTerm
	 *            the depTerm to set
	 */
	public void setDepTerm(String depTerm) {
		this.depTerm = depTerm;
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
	 * @return the arrTerm
	 */
	public String getArrTerm() {
		return arrTerm;
	}

	/**
	 * @param arrTerm
	 *            the arrTerm to set
	 */
	public void setArrTerm(String arrTerm) {
		this.arrTerm = arrTerm;
	}

	/**
	 * @return the takeOffTime
	 */
	public java.util.Date getTakeOffTime() {
		return takeOffTime;
	}

	/**
	 * @param takeOffTime
	 *            the takeOffTime to set
	 */
	public void setTakeOffTime(java.util.Date takeOffTime) {
		this.takeOffTime = takeOffTime;
	}

	/**
	 * @return the arriveTime
	 */
	public java.util.Date getArriveTime() {
		return arriveTime;
	}

	/**
	 * @param arriveTime
	 *            the arriveTime to set
	 */
	public void setArriveTime(java.util.Date arriveTime) {
		this.arriveTime = arriveTime;
	}

	/**
	 * @return the flightTime
	 */
	public String getFlightTime() {
		return flightTime;
	}

	/**
	 * @param flightTime
	 *            the flightTime to set
	 */
	public void setFlightTime(String flightTime) {
		this.flightTime = flightTime;
	}

	/**
	 * @return the planeModel
	 */
	public String getPlaneModel() {
		return planeModel;
	}

	/**
	 * @param planeModel
	 *            the planeModel to set
	 */
	public void setPlaneModel(String planeModel) {
		this.planeModel = planeModel;
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
	 * @return the isDirect
	 */
	public boolean isDirect() {
		return isDirect;
	}

	/**
	 * @param isDirect
	 *            the isDirect to set
	 */
	public void setDirect(boolean isDirect) {
		this.isDirect = isDirect;
	}

	/**
	 * @return the isShare
	 */
	public boolean isShare() {
		return isShare;
	}

	/**
	 * @param isShare
	 *            the isShare to set
	 */
	public void setShare(boolean isShare) {
		this.isShare = isShare;
	}

	/**
	 * @return the stopQuantity
	 */
	public int getStopQuantity() {
		return stopQuantity;
	}

	/**
	 * @param stopQuantity
	 *            the stopQuantity to set
	 */
	public void setStopQuantity(int stopQuantity) {
		this.stopQuantity = stopQuantity;
	}

	/**
	 * @return the cabin
	 */
	public Set<CabinItem> getCabin() {
		return cabin;
	}

	/**
	 * @param cabin
	 *            the cabin to set
	 */
	public void setCabin(Set<CabinItem> cabin) {
		this.cabin = cabin;
	}

}
