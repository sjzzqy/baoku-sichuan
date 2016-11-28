package com.baoku.dt.service;

import com.baoku.dt.model.common.Response;
import com.baoku.dt.model.request.order.OrderCondition;
import com.baoku.dt.model.result.refund.Status;

public class RefundStatusService extends BaseService<OrderCondition, Status> {

	private OrderCondition condition;

	public RefundStatusService(OrderCondition condition) {
		super();
		this.condition = condition;
	}

	@Override
	public String method() {
		// TODO Auto-generated method stub
		return "refund/status";
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
	public Response<Status> request() {
		String responseDate = this.connect();
		return this.xmlToObject(responseDate);
	}

}
