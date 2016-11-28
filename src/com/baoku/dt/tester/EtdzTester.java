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
		condition.setOrderNo("订单号");
		condition.setAmout(1570d);
		condition.setBankOrderNo("银行流水号");
		condition.setCusBigCode("大客户编码");
		condition.setPayOrderNo("第三方支付交易单号");
		condition.setPayChannel("alipay");
		condition.setPayChanmes("支付宝");

		EtdzService service = new EtdzService(condition);
		Response<EtdzOrder> result = service.request();
		System.out.println(result);
	}
}
