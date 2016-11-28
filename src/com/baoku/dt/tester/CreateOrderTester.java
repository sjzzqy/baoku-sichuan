package com.baoku.dt.tester;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.HashSet;
import java.util.Set;

import com.baoku.dt.model.common.Response;
import com.baoku.dt.model.request.CreateOrderCondition;
import com.baoku.dt.model.request.Passenger;
import com.baoku.dt.model.request.Passengers;
import com.baoku.dt.model.request.Segment;
import com.baoku.dt.model.request.Segments;
import com.baoku.dt.model.result.CreateOrderResult;
import com.baoku.dt.model.result.order.Contact;
import com.baoku.dt.model.result.order.Contacts;
import com.baoku.dt.service.CreateOrderService;
/**
 * 创建订单
 * 
 * @author Allen
 * 
 */
public class CreateOrderTester {

	public static void main(String[] args) throws ParseException {
		CreateOrderCondition condition = new CreateOrderCondition();
		//condition.set....
		CreateOrderService service = new CreateOrderService(condition);
		Response<CreateOrderResult> result=service.request();
		System.out.println(result);
	}
}
