package com.baoku.dt.service;

import com.baoku.dt.model.common.Response;
import com.baoku.dt.model.request.CreateOrderCondition;
import com.baoku.dt.model.result.CreateOrderResult;

public class CreateOrderService extends
		BaseService<CreateOrderCondition, CreateOrderResult> {

	private CreateOrderCondition condition;

	public CreateOrderService(CreateOrderCondition condition) {
		super();
		this.condition = condition;
	}

	@Override
	public String method() {
		// TODO Auto-generated method stub
		return "share/createOrder";
	}

	@Override
	public CreateOrderCondition getConditon() {
		// TODO Auto-generated method stub
		return condition;
	}

	@Override
	public boolean isRequiredSSL() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Response<CreateOrderResult> request() {
		String responseDate = this.connect();
		return this.xmlToObject(responseDate);
	}

}
