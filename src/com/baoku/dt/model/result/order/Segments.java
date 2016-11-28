/**
 * @Copyright (c) 宝库技术团队 www.baoku.com
 * @authur Allen
 * @Generated: 2016-7-21 上午9:47:49
 */
package com.baoku.dt.model.result.order;

import java.util.Set;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * @Description: TODO(....)
 * @author Allen
 * @version V1.0
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "Segments")
public class Segments {

	private Set<Segment> Segment;

	/**
	 * @return the segment
	 */
	public Set<Segment> getSegment() {
		return Segment;
	}

	/**
	 * @param segment
	 *            the segment to set
	 */
	public void setSegment(Set<Segment> segment) {
		Segment = segment;
	}

}
