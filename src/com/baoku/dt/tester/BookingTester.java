package com.baoku.dt.tester;

import com.baoku.dt.model.request.BookingCondition;
import com.baoku.dt.service.BookingService;

/**
 * 四、 航班价格验证接口
 * 
 * @author Allen
 * 
 */
public class BookingTester {

	public static void main(String[] args) {

		BookingCondition condition = new BookingCondition();
		condition.setOrgCity("CTU");
		condition.setDesCity("PEK");
		condition.setCusBigCode("大客户编码");
		condition.setGoDate("2016-08-30");
		condition.setFlightNo("3U8889");
		condition.setCno("T");
		condition.setAddFare(0d);
		condition.setAirTax(50d);
		condition.setPrice(1520d);
		condition.setRatePlanId("8Y9G%2BP6HM2Kwg0GTMA11VA%3D%3D");
		BookingService service = new BookingService(condition);
		System.out.println(service.request());
	}
}
