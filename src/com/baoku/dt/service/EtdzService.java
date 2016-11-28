package com.baoku.dt.service;

import com.baoku.dt.model.common.Response;
import com.baoku.dt.model.request.order.EtdzCondition;
import com.baoku.dt.model.result.order.EtdzOrder;

public class EtdzService extends BaseService<EtdzCondition, EtdzOrder> {

	private EtdzCondition condition;

	public EtdzService(EtdzCondition condition) {
		super();
		this.condition = condition;
	}

	@Override
	public String method() {
		// TODO Auto-generated method stub
		return "order/etdz";
	}

	@Override
	public EtdzCondition getConditon() {
		// TODO Auto-generated method stub
		return condition;
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
