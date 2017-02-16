/**
 * @Copyright (c) 宝库技术团队 www.baoku.com
 * @authur Allen
 * @Generated: 2017-2-14 上午11:13:40
 */
package com.baoku.dt.model.request.change;

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
@XmlRootElement(name = "Detail")
public class Detail {

	@XmlElement(name = "CertNo")
	private String certNo;// 证件号

	/**
	 * certNo
	 * 
	 * @return the certNo
	 */
	public String getCertNo() {
		return certNo;
	}

	/**
	 * certNo
	 * 
	 * @param certNo
	 *            the certNo to set
	 */
	public void setCertNo(String certNo) {
		this.certNo = certNo;
	}

}
