package com.baoku.dt.tester;

import java.util.HashSet;
import java.util.Set;

import com.baoku.dt.model.common.Response;
import com.baoku.dt.model.request.order.IncrStatusCondition;
import com.baoku.dt.model.result.order.IncrStatus;
import com.baoku.dt.service.StatusService;

/**
 * 订单状态同步
 * 
 * @author Allen
 * 
 */
public class OrderStatusTester {

	public static void main(String[] args) {
		IncrStatusCondition condition = new IncrStatusCondition();
		Set<String> orderNo = new HashSet<String>();
		orderNo.add("订单号1");
		orderNo.add("订单号2");
		orderNo.add("订单号3");
		condition.setOrderNo(orderNo);
		StatusService service = new StatusService(condition);
		Response<IncrStatus> result = service.request();
		System.out.println(result);
		System.out.println("响应：" + result.getCode());
	}
}
