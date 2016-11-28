package com.baoku.dt.tester;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.HashSet;
import java.util.Set;

import com.baoku.dt.model.common.Response;
import com.baoku.dt.model.request.CreateOrderCondition;
import com.baoku.dt.model.request.Passenger;
import com.baoku.dt.model.request.Passengers;
import com.baoku.dt.model.request.Segment;
import com.baoku.dt.model.request.Segments;
import com.baoku.dt.model.result.CreateOrderResult;
import com.baoku.dt.model.result.order.Contact;
import com.baoku.dt.model.result.order.Contacts;
import com.baoku.dt.service.CreateOrderService;

public class CreateOrderTester {

	public static void main(String[] args) throws ParseException {
		CreateOrderCondition condition = new CreateOrderCondition();
		condition.setBookManUid("DF9qp%2FtWHr30L%2BvtFnnB7w%3D%3D");
		condition.setCusBigCode("6BJ001");
		condition.setCustOrderNo("APP160730001");
		condition.setOrderType("D");
		Contacts contacts = new Contacts();
		Set<Contact> contact = new HashSet<Contact>();
		Contact ct = new Contact();
		ct.setBsms(true);
		ct.setTsms(false);
		ct.setName("测试");
		ct.setPhone("11111111111");
		contact.add(ct);
		contacts.setContact(contact);
		condition.setContacts(contacts);

		// 乘机人
		Passengers passengers = new Passengers();
		Set<Passenger> passenger = new HashSet<Passenger>();
		Passenger pgr = new Passenger();
		pgr.setUid("DF9qp%2FtWHr30L%2BvtFnnB7w%3D%3D");
		pgr.setBsms(true);
		pgr.setTsms(true);
		pgr.setCertNo("E000321");
		pgr.setMobile("11111111111");
		pgr.setName("测试");
		pgr.setScalCard("TEST00001");
		passenger.add(pgr);
		
		Passenger pgr2 = new Passenger();
		pgr2.setUid("o0fBj9P%2F2EY4F%2FKEozL76g%3D%3D");
		pgr2.setBsms(true);
		pgr2.setTsms(true);
		pgr2.setCertNo("EEE001");
		pgr2.setMobile("11111111111");
		pgr2.setName("测试二");
		pgr2.setScalCard("TEST00001");
		passenger.add(pgr2);
		
		
		passengers.setPassenger(passenger);
		condition.setPassengers(passengers);
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm");
		Segments segments = new Segments();
		Set<Segment> segment = new HashSet<Segment>();
		Segment st = new Segment();
		st.setFlightNo("3U8893");
		st.setOrgCity("CTU");
		st.setOrgDate(sdf.parse("2016-08-30 20:30"));
		st.setDesCity("PEK");
		st.setDesDate(sdf.parse("2016-08-30 23:15"));
		st.setAirTax(50d);
		st.setcNo("T");
		st.setFuelTax(0d);
		st.setPrice(1520d);
		st.setRatePlanId("8Y9G%2BP6HM2Kwg0GTMA11VA%3D%3D");
		segment.add(st);
		segments.setSegment(segment);
		condition.setSegments(segments);

		CreateOrderService service = new CreateOrderService(condition);
		Response<CreateOrderResult> result=service.request();
		System.out.println(result);
	}
}
