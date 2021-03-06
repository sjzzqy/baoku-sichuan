package com.baoku.dt.tester;

import com.baoku.dt.model.request.account.LoginCondition;
import com.baoku.dt.service.ForgotService;

/**
 * 找回密码
 * 
 * @author Allen
 * 
 */
public class ForgotTester {

	public static void main(String[] args) {
		LoginCondition condition = new LoginCondition();
		condition.setCusBigCode("6BJ001");
		condition.setUserName("weiyumeng");
		ForgotService service = new ForgotService(condition);
		System.out.println(service.request());
	}
}
