package com.baoku.dt.service;

import com.baoku.dt.model.common.Response;
import com.baoku.dt.model.request.refund.EtrfCondition;
import com.baoku.dt.model.result.refund.RefundResult;

public class CreateRefundService extends
		BaseService<EtrfCondition, RefundResult> {

	private EtrfCondition condition;

	public CreateRefundService(EtrfCondition condition) {
		super();
		this.condition = condition;
	}

	@Override
	public String method() {
		// TODO Auto-generated method stub
		return "refund/createRefund";
	}

	@Override
	public EtrfCondition getConditon() {
		// TODO Auto-generated method stub
		return condition;
	}

	@Override
	public boolean isRequiredSSL() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Response<RefundResult> request() {
		String responseDate = this.connect();
		return this.xmlToObject(responseDate);
	}

}
