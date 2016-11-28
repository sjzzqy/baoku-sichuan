package com.baoku.dt.service;

import com.baoku.dt.model.common.Response;
import com.baoku.dt.model.request.order.OrderCondition;
import com.baoku.dt.model.result.refund.ApplyResult;

public class ApplyService extends BaseService<OrderCondition, ApplyResult> {

	private OrderCondition condition;

	public ApplyService(OrderCondition condition) {
		super();
		this.condition = condition;
	}

	@Override
	public String method() {
		// TODO Auto-generated method stub
		return "refund/apply";
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
	public Response<ApplyResult> request() {
		String responseDate = this.connect();
		return this.xmlToObject(responseDate);
	}

}
