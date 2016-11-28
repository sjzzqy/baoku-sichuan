package com.baoku.dt.service;

import com.baoku.dt.model.common.Response;
import com.baoku.dt.model.request.account.LoginCondition;
import com.baoku.dt.model.result.account.Account;

public class LoginService extends BaseService<LoginCondition, Account> {

	private LoginCondition condition;

	public LoginService(LoginCondition condition) {
		super();
		this.condition = condition;
	}

	@Override
	public String method() {
		// TODO Auto-generated method stub
		return "account/login";
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
	public Response<Account> request() {
		String responseDate = this.connect();
		return this.xmlToObject(responseDate);
	}

}
