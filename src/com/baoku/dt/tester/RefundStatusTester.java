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
		condition.setOrderNo("R2016081000004");
		condition.setCusBigCode("6BJ001");
		RefundStatusService service = new RefundStatusService(condition);
		Response<Status> result = service.request();
		System.out.println(result);
	}
}
