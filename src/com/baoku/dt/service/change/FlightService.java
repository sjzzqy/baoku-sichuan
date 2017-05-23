package com.baoku.dt.service.change;

import com.baoku.dt.model.common.Response;
import com.baoku.dt.model.request.change.QueryCondition;
import com.baoku.dt.model.result.AvResult;
import com.baoku.dt.service.BaseService;

public class FlightService extends BaseService<QueryCondition, AvResult> {

	private QueryCondition condition;

	public FlightService(QueryCondition condition) {
		super();
		this.condition = condition;
	}

	@Override
	public String method() {
		// TODO Auto-generated method stub
		return "change/query";
	}

	@Override
	public QueryCondition getConditon() {
		// TODO Auto-generated method stub
		return condition;
	}

	@Override
	public boolean isRequiredSSL() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Response<AvResult> request() {
		String responseDate = this.connect();
		return this.xmlToObject(responseDate);
	}

}