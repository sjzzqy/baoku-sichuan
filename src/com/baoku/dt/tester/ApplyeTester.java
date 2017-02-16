package com.baoku.dt.tester;

import com.baoku.dt.model.request.order.OrderCondition;
import com.baoku.dt.service.ApplyService;

public class ApplyeTester {

	public static void main(String[] args) {
		OrderCondition condition = new OrderCondition();
		condition.setOrderNo("WF161026000061");
		condition.setCusBigCode("BKSCAL06");
		ApplyService service = new ApplyService(condition);
		System.out.println(service.connect());
		
		
	}
}
