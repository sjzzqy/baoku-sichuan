package com.baoku.dt.service;

import com.baoku.dt.model.common.Response;
import com.baoku.dt.model.common.Validate;
import com.baoku.dt.model.request.BookingCondition;

public class BookingService extends BaseService<BookingCondition, Validate> {
	private BookingCondition condition;

	public BookingService(BookingCondition condition) {
		super();
		this.condition = condition;
	}

	@Override
	public String method() {
		// TODO Auto-generated method stub
		return "share/booking";
	}

	@Override
	public BookingCondition getConditon() {
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
