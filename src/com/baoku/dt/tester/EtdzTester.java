package com.baoku.dt.tester;

import com.baoku.dt.model.common.Response;
import com.baoku.dt.model.request.order.EtdzCondition;
import com.baoku.dt.model.result.order.EtdzOrder;
import com.baoku.dt.service.EtdzService;

/**
 * 支付出票
 * 
 * @author Allen
 * 
 */
public class EtdzTester {

	public static void main(String[] args) {

		EtdzCondition condition = new EtdzCondition();
		condition.setOrderNo("WF160810000002");
		condition.setAmout(1570d);
		condition.setBankOrderNo("TEST90930394874");
		condition.setCusBigCode("6BJ001");
		condition.setPayOrderNo("TEST90930394875");
		condition.setPayChannel("alipay");
		condition.setPayChanmes("支付宝");

		EtdzService service = new EtdzService(condition);
		Response<EtdzOrder> result = service.request();
		System.out.println(result);
	}
}
