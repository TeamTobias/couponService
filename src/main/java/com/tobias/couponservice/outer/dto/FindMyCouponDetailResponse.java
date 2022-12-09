package com.tobias.couponservice.outer.dto;


import com.tobias.couponservice.inner.domain.CouponItem;
import com.tobias.couponservice.inner.domain.standardType.CouponItemStatus;
import com.tobias.couponservice.inner.domain.standardType.Type;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class FindMyCouponDetailResponse implements Serializable {

	private String content;
	private Type type;
	private int discountAmount;

	private int leastAmount;
	private Date openDate;
	private Date endDate;

	private CouponItemStatus status;

	public FindMyCouponDetailResponse(CouponItem couponItem) {
		this.content = couponItem.getCoupon().getContent();
		this.type = couponItem.getCoupon().getType();
		this.discountAmount = couponItem.getCoupon().getDiscountAmount();
		this.leastAmount = couponItem.getCoupon().getConditionVo().getLeastAmount();
		this.openDate = couponItem.getCoupon().getConditionVo().getOpenDate();
		this.endDate = couponItem.getCoupon().getConditionVo().getEndDate();
		this.status = couponItem.getStatus();
	}
}