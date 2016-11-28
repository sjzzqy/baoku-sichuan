package com.baoku.dt.tester;

import com.baoku.dt.model.request.order.OrderCondition;
import com.baoku.dt.service.CancelOrderService;

public class CancelOrderTester {

	public static void main(String[] args) {

		OrderCondition condition = new OrderCondition();
		condition.setOrderNo("WF160810000001");
		condition.setCusBigCode("6BJ001");
		CancelOrderService service = new CancelOrderService(condition);
		System.out.println(service.request());
	}
}
