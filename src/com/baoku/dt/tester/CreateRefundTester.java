package com.baoku.dt.tester;

import java.util.HashSet;
import java.util.Set;

import com.baoku.dt.model.common.Response;
import com.baoku.dt.model.request.refund.EtrfCondition;
import com.baoku.dt.model.request.refund.EtrfUids;
import com.baoku.dt.model.result.refund.RefundResult;
import com.baoku.dt.service.CreateRefundService;
/**
 * 申请退票
 * 
 * @author Allen
 * 
 */
public class CreateRefundTester {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		EtrfCondition condition = new EtrfCondition();
		condition.setOrderNo("订单号");
		EtrfUids uidd = new EtrfUids();
		Set<String> uids = new HashSet<String>();
		uids.add("Of%2FU1TpqfxqZ1YbZqxpjNQ%3D%3D");
		uidd.setUids(uids);
		condition.setUids(uidd);
		condition.setNature(1);
		condition.setCause(0);
		condition.setOtCause("测试，请全退");
		condition.setEpost(1);
		condition.setName("张三丰");
		condition.setPhone("13716890293");
		condition.setRemarks("测试票");
		CreateRefundService service = new CreateRefundService(condition);
		Response<RefundResult> result = service.request();
		System.out.println(result);
	}
}
