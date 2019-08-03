package com.baoku.dt.tester;

import com.baoku.dt.model.common.Response;
import com.baoku.dt.model.request.order.EtdzCreditCondition;
import com.baoku.dt.model.result.order.EtdzOrder;
import com.baoku.dt.service.EtdzCreditService;

/**
 * 支付出票
 * 
 * @author Qzzy
 *
 */
public class EtdzBuyTester {

	public static void main(String[] args) {
		EtdzCreditCondition condtion = new EtdzCreditCondition();
		condtion.setOrderNo("CF190114000001");
		condtion.setAmount("640");
		condtion.setCardNo("2342434");
		condtion.setCardpwd("322655");
		condtion.setPayment("UATP");
		condtion.setPayerAct("smetester");
		EtdzCreditService service = new EtdzCreditService(condtion);
		Response<EtdzOrder> request = service.request();
		System.out.println(request);
	}

}
