package com.baoku.dt.tester;

import com.baoku.dt.model.common.Response;
import com.baoku.dt.model.request.AvCondition;
import com.baoku.dt.model.result.AvResult;
import com.baoku.dt.service.AvService;

/**
 * 航班查询
 * 
 * @author Allen
 * 
 */
public class AvTester {

	public static void main(String[] args) {
		AvCondition condition = new AvCondition();
		condition.setCusBigCode("6BJ001");
		condition.setOrgCity("CTU");
		condition.setDesCity("PEK");
		condition.setGoDate("2017-01-22");
		condition.setRatePlanId("8Y9G%2BP6HM2Kwg0GTMA11VA%3D%3D");
		AvService service = new AvService(condition);
		Response<AvResult> result = service.request();
		System.out.println(result);
	}
}
