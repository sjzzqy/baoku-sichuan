/**
 * @Copyright (c) 宝库技术团队 www.baoku.com
 * @authur Allen
 * @Generated: 2016-7-21 上午9:48:35
 */
package com.baoku.dt.model.result.order;

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
@XmlRootElement(name = "Segment")
public class Segment extends CommonSegment {
	@XmlElement(name = "Sequence")
	private String sequence;// 航段顺序
	@XmlElement(name = "OrgTerm")
	private String orgTerm;// 始发地航站楼
	@XmlElement(name = "DesTerm")
	private String desTerm;// 到达地航站楼
	@XmlElement(name = "FlightTime")
	private String flightTime;// 飞行时间
	@XmlElement(name = "PlaneModel")
	private String planeModel;// 机型
	@XmlElement(name = "Stop")
	private String stop;// 经停0-无 1-有
	@XmlElement(name = "CNo")
	private String cno;// 舱位代码
	@XmlElement(name = "ReFundRule")
	private String reFundRule;// 退票规定
	@XmlElement(name = "ChangeRule")
	private String changeRule;// 改期规定
	@XmlElement(name = "SignRule")
	private String signRule;// 签转规定
	@XmlElement(name = "PNR")
	private String pnr;//

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
	 * @return the orgTerm
	 */
	public String getOrgTerm() {
		return orgTerm;
	}

	/**
	 * @param orgTerm
	 *            the orgTerm to set
	 */
	public void setOrgTerm(String orgTerm) {
		this.orgTerm = orgTerm;
	}

	/**
	 * @return the desTerm
	 */
	public String getDesTerm() {
		return desTerm;
	}

	/**
	 * @param desTerm
	 *            the desTerm to set
	 */
	public void setDesTerm(String desTerm) {
		this.desTerm = desTerm;
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
	 * @return the stop
	 */
	public String getStop() {
		return stop;
	}

	/**
	 * @param stop
	 *            the stop to set
	 */
	public void setStop(String stop) {
		this.stop = stop;
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
	 * @return the reFundRule
	 */
	public String getReFundRule() {
		return reFundRule;
	}

	/**
	 * @param reFundRule
	 *            the reFundRule to set
	 */
	public void setReFundRule(String reFundRule) {
		this.reFundRule = reFundRule;
	}

	/**
	 * @return the changeRule
	 */
	public String getChangeRule() {
		return changeRule;
	}

	/**
	 * @param changeRule
	 *            the changeRule to set
	 */
	public void setChangeRule(String changeRule) {
		this.changeRule = changeRule;
	}

	/**
	 * @return the signRule
	 */
	public String getSignRule() {
		return signRule;
	}

	/**
	 * @param signRule
	 *            the signRule to set
	 */
	public void setSignRule(String signRule) {
		this.signRule = signRule;
	}

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

}
