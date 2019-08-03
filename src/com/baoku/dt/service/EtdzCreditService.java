package com.baoku.dt.service;

import com.baoku.dt.model.common.Response;
import com.baoku.dt.model.request.order.EtdzCreditCondition;
import com.baoku.dt.model.result.order.EtdzOrder;

public class EtdzCreditService extends BaseService<EtdzCreditCondition, EtdzOrder> {

	private EtdzCreditCondition condtion;

	public EtdzCreditService(EtdzCreditCondition condtion) {
		super();
		this.condtion = condtion;
	}

	@Override
	public String method() {
		return "order/buytkt";
	}

	@Override
	public EtdzCreditCondition getConditon() {
		// TODO Auto-generated method stub
		return condtion;
	}

	@Override
	public boolean isRequiredSSL() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Response<EtdzOrder> request() {
		String responseDate = this.connect();
		return this.xmlToObject(responseDate);
	}

}
