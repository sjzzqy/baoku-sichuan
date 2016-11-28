package com.baoku.dt.service;

import com.baoku.dt.model.common.Response;
import com.baoku.dt.model.request.order.IncrStatusCondition;
import com.baoku.dt.model.result.order.IncrStatus;

public class StatusService extends BaseService<IncrStatusCondition, IncrStatus> {

	private IncrStatusCondition condition;

	public StatusService(IncrStatusCondition condition) {
		super();
		this.condition = condition;
	}

	@Override
	public String method() {
		// TODO Auto-generated method stub
		return "order/status";
	}

	@Override
	public IncrStatusCondition getConditon() {
		// TODO Auto-generated method stub
		return condition;
	}

	@Override
	public boolean isRequiredSSL() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Response<IncrStatus> request() {
		String responseDate = this.connect();
		return this.xmlToObject(responseDate);
	}

}
