package com.baoku.dt.tester;

import com.baoku.dt.model.common.Response;
import com.baoku.dt.model.request.account.EmployeeCondition;
import com.baoku.dt.model.result.account.Accounts;
import com.baoku.dt.service.AccountSevice;

/**
 * 员工查询
 * 
 * @author Allen
 * 
 */
public class AccountTester {

	public static void main(String[] args) {
		try {
			EmployeeCondition condition = new EmployeeCondition();
			condition.setCusBigCode("6BJ001");
			AccountSevice service = new AccountSevice(condition);
			Response<Accounts> result = service.request();
			System.out.println(result);
		} catch (Exception e) {
		}
	}
}
