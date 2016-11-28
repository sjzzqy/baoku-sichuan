package com.baoku.dt.tester;

import com.baoku.dt.model.common.Response;
import com.baoku.dt.model.request.order.OrderCondition;
import com.baoku.dt.model.result.refund.Status;
import com.baoku.dt.service.RefundStatusService;

/**
 * 退票单状态
 * 
 * @author Allen
 * 
 */
public class RefundStatusTester {

	public static void main(String[] args) {
		OrderCondition condition = new OrderCondition();
		condition.setOrderNo("退票单单号");
		condition.setCusBigCode("大客户编码");
		RefundStatusService service = new RefundStatusService(condition);
		Response<Status> result = service.request();
		System.out.println(result);
	}
}
