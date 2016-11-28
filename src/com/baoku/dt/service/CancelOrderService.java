package com.baoku.dt.service;

import com.baoku.dt.model.common.Response;
import com.baoku.dt.model.common.Validate;
import com.baoku.dt.model.request.order.OrderCondition;

public class CancelOrderService extends BaseService<OrderCondition, Validate> {

	private OrderCondition condition;

	public CancelOrderService(OrderCondition condition) {
		super();
		this.condition = condition;
	}

	@Override
	public String method() {
		// TODO Auto-generated method stub
		return "order/cancelOrder";
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
	public Response<Validate> request() {
		String responseDate = this.connect();
		return this.xmlToObject(responseDate);
	}

}
