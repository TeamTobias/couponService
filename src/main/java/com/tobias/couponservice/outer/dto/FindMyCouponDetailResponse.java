package com.tobias.couponservice.outer.dto;


import com.tobias.couponservice.inner.domain.standardType.CouponItemStatus;
import com.tobias.couponservice.inner.domain.standardType.Type;
import com.tobias.couponservice.inner.domain.vo.ConditionVo;

public class FindMyCouponDetailResponse {

	private String content;
	private Type type;
	private int discountAmount;
	private ConditionVo conditionVo;
	private CouponItemStatus status;


}