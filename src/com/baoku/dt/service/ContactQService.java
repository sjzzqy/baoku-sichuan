package com.baoku.dt.service;

import com.baoku.dt.model.common.Response;
import com.baoku.dt.model.request.OrderContactCondition;
import com.baoku.dt.model.result.ContactQ;

public class ContactQService extends
		BaseService<OrderContactCondition, ContactQ> {

	private OrderContactCondition condition;

	public ContactQService(OrderContactCondition condition) {
		super();
		this.condition = condition;
	}

	@Override
	public String method() {
		// TODO Auto-generated method stub
		return "common/contactq";
	}

	@Override
	public OrderContactCondition getConditon() {
		// TODO Auto-generated method stub
		return condition;
	}

	@Override
	public boolean isRequiredSSL() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Response<ContactQ> request() {
		String responseDate = this.connect();
		return this.xmlToObject(responseDate);
	}

}
