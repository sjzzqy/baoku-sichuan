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
		condition.setOrderNo("WF160801000001");
		condition.setCusBigCode("6BJ001");

		OrderDetailService service = new OrderDetailService(condition);
		Response<OrderResult> result = service.request();
		System.out.println(result);
	}
}
