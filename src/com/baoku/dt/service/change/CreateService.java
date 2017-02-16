package com.baoku.dt.service.change;

import com.baoku.dt.model.common.Response;
import com.baoku.dt.model.request.change.CreateCondition;
import com.baoku.dt.model.result.CreateOrderResult;
import com.baoku.dt.service.BaseService;

public class CreateService extends
		BaseService<CreateCondition, CreateOrderResult> {

	private CreateCondition condition;

	public CreateService(CreateCondition condition) {
		super();
		this.condition = condition;
	}

	@Override
	public String method() {
		// TODO Auto-generated method stub
		return "change/create";
	}

	@Override
	public CreateCondition getConditon() {
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
