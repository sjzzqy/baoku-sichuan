/**
 * @Copyright (c) 宝库技术团队 www.baoku.com
 * @authur Allen
 * @Generated: 2016-7-22 下午3:33:34
 */
package com.baoku.dt.model.request;

import java.util.Set;

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
@XmlRootElement(name = "Segments")
public class Segments {

	@XmlElement(name = "Segment")
	private Set<Segment> segment;

	/**
	 * @return the segment
	 */
	public Set<Segment> getSegment() {
		return segment;
	}

	/**
	 * @param segment
	 *            the segment to set
	 */
	public void setSegment(Set<Segment> segment) {
		this.segment = segment;
	}

}
