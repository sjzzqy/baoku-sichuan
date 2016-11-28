package com.baoku.dt.tester;

import com.baoku.dt.model.common.Response;
import com.baoku.dt.model.request.order.OrderCondition;
import com.baoku.dt.model.result.order.OrderResult;
import com.baoku.dt.service.OrderDetailService;

/**
 * 订单详情
 * 
 * @author Allen
 * 
 */
public class OrderDetailTester {

	public static void main(String[] args) {
		OrderCondition condition = new OrderCondition();
		condition.setOrderNo("订单号");
		condition.setCusBigCode("大客户编码");

		OrderDetailService service = new OrderDetailService(condition);
		Response<OrderResult> result = service.request();
		System.out.println(result);
	}
}
