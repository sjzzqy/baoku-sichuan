package com.baoku.dt.service;

import com.baoku.dt.model.common.Response;
import com.baoku.dt.model.request.account.EmployeeCondition;
import com.baoku.dt.model.result.account.Accounts;

public class AccountSevice extends BaseService<EmployeeCondition, Accounts> {
	private EmployeeCondition condition;

	public AccountSevice(EmployeeCondition condition) {
		super();
		this.condition = condition;
	}

	@Override
	public String method() {
		// TODO Auto-generated method stub
		return "account/query";
	}

	@Override
	public EmployeeCondition getConditon() {
		// TODO Auto-generated method stub
		return condition;
	}

	@Override
	public boolean isRequiredSSL() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Response<Accounts> request() {
		String responseDate = this.connect();
		return this.xmlToObject(responseDate);
	}

}
