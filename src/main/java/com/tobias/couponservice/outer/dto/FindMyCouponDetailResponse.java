package com.tobias.couponservice.outer.dto;

����ũ�μ���.coupon.outer.dto;

import ����ũ�μ���.coupon.inner.domain.vo.ConditionVo;

/**
 * @author ur2ku
 * @version 1.0
 * @created 08-12-2022 ���� 7:30:33
 */
public class FindMyCouponDetailResponse {

	private String content;
	private Type type;
	private int discountAmount;
	private ConditionVo conditionVo;
	private CouponItemStatus status;

	public FindMyCouponDetailResponse(){

	}

	public void finalize() throws Throwable {

	}

}