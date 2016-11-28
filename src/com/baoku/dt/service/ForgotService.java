package com.baoku.dt.service;

import com.baoku.dt.model.common.Response;
import com.baoku.dt.model.common.Validate;
import com.baoku.dt.model.request.account.LoginCondition;

public class ForgotService extends BaseService<LoginCondition, Validate> {

	private LoginCondition condition;

	public ForgotService(LoginCondition condition) {
		super();
		this.condition = condition;
	}

	@Override
	public String method() {
		// TODO Auto-generated method stub
		return "account/reset";
	}

	@Override
	public LoginCondition getConditon() {
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
