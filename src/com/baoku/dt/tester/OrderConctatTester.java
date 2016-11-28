package com.baoku.dt.tester;

import com.baoku.dt.model.common.Response;
import com.baoku.dt.model.request.OrderContactCondition;
import com.baoku.dt.model.result.ContactQ;
import com.baoku.dt.service.ContactQService;

/**
 * QQQ 获取订单联系人
 * 
 * @author Allen
 * 
 */
public class OrderConctatTester {

	public static void main(String[] args) {
		OrderContactCondition condition = new OrderContactCondition();
		condition.setPnr("MY68F3");
		condition.setOrgCity("CTU");
		condition.setDesCity("PEK");
		condition.setTakeoffTime("2016-11-30 20:30:00");

		ContactQService service = new ContactQService(condition);
		Response<ContactQ> result = service.request();
		System.out.println(result);
		System.out.println(result.getCode());
	}

}
