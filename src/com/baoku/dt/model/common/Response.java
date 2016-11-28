/**
 * @Copyright (c) 宝库技术团队 www.baoku.com
 * @authur Allen
 * @Generated: 2016-7-4 下午5:51:28
 */
package com.baoku.dt.model.common;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSeeAlso;

import com.baoku.dt.model.result.AvResult;
import com.baoku.dt.model.result.CreateOrderResult;
import com.baoku.dt.model.result.account.Account;
import com.baoku.dt.model.result.account.Accounts;
import com.baoku.dt.model.result.order.EtdzOrder;
import com.baoku.dt.model.result.order.IncrStatus;
import com.baoku.dt.model.result.order.OrderResult;
import com.baoku.dt.model.result.order.StatusResult;
import com.baoku.dt.model.result.refund.ApplyResult;
import com.baoku.dt.model.result.refund.RefundResult;
import com.baoku.dt.model.result.refund.Status;

/**
 * 主返回
 * 
 * @Description: TODO(....)
 * @author Allen
 * @version V1.0
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "Response")
@XmlSeeAlso({ AvResult.class, Account.class, Accounts.class, Validate.class,
		CreateOrderResult.class, StatusResult.class, EtdzOrder.class,
		StatusResult.class, ApplyResult.class, RefundResult.class,
		Status.class, OrderResult.class, IncrStatus.class })
public class Response<T> implements Serializable {

	private static final long serialVersionUID = 1L;
	@XmlElement(name = "Code")
	private String code;// 0成功
	@XmlElement(name = "Message")
	private String message;// 内容
	@XmlElement(name = "Result")
	private T result;// 类型持有者

	/**
	 * @return the code
	 */
	public String getCode() {
		return code;
	}

	/**
	 * @param code
	 *            the code to set
	 */
	public void setCode(String code) {
		this.code = code;
	}

	/**
	 * @return the message
	 */
	public String getMessage() {
		return message;
	}

	/**
	 * @param message
	 *            the message to set
	 */
	public void setMessage(String message) {
		this.message = message;
	}

	/**
	 * @return the result
	 */
	public T getResult() {
		return result;
	}

	/**
	 * @param result
	 *            the result to set
	 */
	public void setResult(T result) {
		this.result = result;
	}

}
