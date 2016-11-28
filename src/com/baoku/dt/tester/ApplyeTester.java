package com.baoku.dt.tester;

import com.baoku.dt.model.request.order.OrderCondition;
import com.baoku.dt.service.ApplyService;
/**
 * 申请可退票
 * 
 * @author Allen
 * 
 */
public class ApplyeTester {

	public static void main(String[] args) {
		OrderCondition condition = new OrderCondition();
		condition.setOrderNo("订单号");
		condition.setCusBigCode("大客户编码");
		ApplyService service = new ApplyService(condition);
		System.out.println(service.connect());
	}
}
