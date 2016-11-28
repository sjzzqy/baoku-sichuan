package com.baoku.dt.tester;

import com.baoku.dt.model.common.Response;
import com.baoku.dt.model.request.account.LoginCondition;
import com.baoku.dt.model.result.account.Account;
import com.baoku.dt.service.LoginService;

/**
 * 登录接口
 * 
 * @author Allen
 * 
 */
public class LoginTester {

	public static void main(String[] args) {
		LoginCondition condition = new LoginCondition();
		condition.setCusBigCode("大客户编码");
		condition.setPassword("密码");
		condition.setUserName("登录名");
		// condition.setLoginIp(loginIp);
		LoginService service = new LoginService(condition);
		Response<Account> result = service.request();
		System.out.println(result);
	}

}
