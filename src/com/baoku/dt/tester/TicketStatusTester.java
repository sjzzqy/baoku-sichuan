package com.baoku.dt.tester;

import java.util.HashSet;
import java.util.Set;

import com.baoku.dt.model.common.Response;
import com.baoku.dt.model.request.order.IncrStatusCondition;
import com.baoku.dt.model.result.order.TicketStatusResult;
import com.baoku.dt.service.TicketStatusService;

/**
 * 订单客票状态
 * 
 * @author Allen
 * 
 */
public class TicketStatusTester {

	public static void main(String[] args) {
		IncrStatusCondition condition = new IncrStatusCondition();
		Set<String> orders = new HashSet<String>();
		orders.add("订单号1");
		orders.add("订单号2");
		condition.setOrderNo(orders);

		TicketStatusService service = new TicketStatusService(condition);
		Response<TicketStatusResult> response = service.request();

		System.out.println(response);
	}
}
