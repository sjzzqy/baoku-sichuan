package com.baoku.dt.service;

import com.baoku.dt.model.common.Response;
import com.baoku.dt.model.request.order.IncrStatusCondition;
import com.baoku.dt.model.result.order.TicketStatusResult;

public class TicketStatusService extends
		BaseService<IncrStatusCondition, TicketStatusResult> {
	private IncrStatusCondition condition;

	public TicketStatusService(IncrStatusCondition condition) {
		super();
		this.condition = condition;
	}

	@Override
	public String method() {
		// TODO Auto-generated method stub
		return "order/tstatus";
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
	public Response<TicketStatusResult> request() {
		String responseDate = this.connect();
		return this.xmlToObject(responseDate);
	}

}
