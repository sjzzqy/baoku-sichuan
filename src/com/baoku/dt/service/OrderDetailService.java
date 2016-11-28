package com.baoku.dt.service;

import com.baoku.dt.model.common.Response;
import com.baoku.dt.model.request.order.OrderCondition;
import com.baoku.dt.model.result.order.OrderResult;

public class OrderDetailService extends BaseService<OrderCondition, OrderResult> {

	private OrderCondition condition;

	public OrderDetailService(OrderCondition condition) {
		super();
		this.condition = condition;
	}

	@Override
	public String method() {
		// TODO Auto-generated method stub
		return "order/detail";
	}

	@Override
	public OrderCondition getConditon() {
		// TODO Auto-generated method stub
		return condition;
	}

	@Override
	public boolean isRequiredSSL() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Response<OrderResult> request() {
		String responseDate = this.connect();
		return this.xmlToObject(responseDate);
	}

}
