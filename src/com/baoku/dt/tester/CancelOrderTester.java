package com.baoku.dt.tester;

import com.baoku.dt.model.request.order.OrderCondition;
import com.baoku.dt.service.CancelOrderService;
/**
 * 取消订单
 * 
 * @author Allen
 * 
 */
public class CancelOrderTester {

	public static void main(String[] args) {

		OrderCondition condition = new OrderCondition();
		condition.setOrderNo("订单号");
		condition.setCusBigCode("大客户编码");
		CancelOrderService service = new CancelOrderService(condition);
		System.out.println(service.request());
	}
}
