package com.baoku.dt.service.change;

import com.baoku.dt.model.common.Response;
import com.baoku.dt.model.request.order.OrderCondition;
import com.baoku.dt.model.result.change.ChangeResult;
import com.baoku.dt.service.BaseService;

public class ChangeApplyService extends
		BaseService<OrderCondition, ChangeResult> {

	private OrderCondition condition;

	public ChangeApplyService(OrderCondition condition) {
		super();
		this.condition = condition;
	}

	@Override
	public String method() {
		// TODO Auto-generated method stub
		return "change/apply";
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
	public Response<ChangeResult> request() {
		String responseDate = this.connect();
		return this.xmlToObject(responseDate);
	}

}
