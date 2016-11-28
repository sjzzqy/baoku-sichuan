package com.baoku.dt.service;

import com.baoku.dt.model.common.Response;
import com.baoku.dt.model.request.AvCondition;
import com.baoku.dt.model.result.AvResult;

/**
 * 航班查询接口
 * 
 * @author Allen
 * 
 */
public class AvService extends BaseService<AvCondition, AvResult> {

	private AvCondition condition;

	public AvService(AvCondition condition) {
		super();
		this.condition = condition;
	}

	public AvCondition getCondition() {
		return condition;
	}

	public void setCondition(AvCondition condition) {
		this.condition = condition;
	}

	@Override
	public String method() {
		// TODO Auto-generated method stub
		return "share/scalAv";
	}

	@Override
	public AvCondition getConditon() {
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
