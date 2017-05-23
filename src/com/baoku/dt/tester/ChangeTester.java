package com.baoku.dt.tester;

import java.util.HashSet;
import java.util.Set;

import com.baoku.dt.XmlUtils;
import com.baoku.dt.model.common.Response;
import com.baoku.dt.model.request.change.CreateCondition;
import com.baoku.dt.model.request.change.Flight;
import com.baoku.dt.model.request.change.QueryCondition;
import com.baoku.dt.model.request.order.OrderCondition;
import com.baoku.dt.model.result.AvResult;
import com.baoku.dt.model.result.CreateOrderResult;
import com.baoku.dt.model.result.change.ChangeResult;
import com.baoku.dt.service.change.ChangeApplyService;
import com.baoku.dt.service.change.CreateService;
import com.baoku.dt.service.change.FlightService;

public class ChangeTester {

	public static void main(String[] args) {
		TestChangeApply();

		// TestQueryFlights();

		// TestCreateOrder();
	}

	static void TestQueryFlights() {

		try {
			QueryCondition condition = new QueryCondition();
			condition.setOrderNo("CF170214000001");
			condition.setGoDate("2017-03-14");
			Set<Flight> flights = new HashSet<Flight>();
			Flight flight = new Flight();
			flight.setFlightNo("3U8882");
			Set<String> details = new HashSet<String>();
			details.add("EEE001");
			flight.setCertNo(details);
			flights.add(flight);
			condition.setFlight(flights);
			System.out.println(XmlUtils.objectToXml(condition));
			FlightService service = new FlightService(condition);
			Response<AvResult> result = service.request();
			System.out.println(XmlUtils.objectToXml(result));
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	// 申请改期
	static void TestChangeApply() {
		try {
			OrderCondition condition = new OrderCondition();
			condition.setOrderNo("CF170401000001");
			ChangeApplyService service = new ChangeApplyService(condition);
			Response<ChangeResult> result = service.request();
			System.out.println(XmlUtils.objectToXml(result));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	static void TestCreateOrder() {
		try {
			CreateCondition condition = new CreateCondition();
			condition.setBookManUid("o0fBj9P%2F2EY4F%2FKEozL76g%3D%3D");
			condition
					.setCanbinkey("tmnStISZED8G%2FzJO59yOHjP52zyOchSYCGgrxWxkQwxTZfvn5qO8qn%2FdoMnYIT24");
			condition.setCustOrderNo("TOTKDS001");
			condition.setGoDate("2017-03-14");
			CreateService service = new CreateService(condition);
			Response<CreateOrderResult> result = service.request();
			System.out.println(XmlUtils.objectToXml(result));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}