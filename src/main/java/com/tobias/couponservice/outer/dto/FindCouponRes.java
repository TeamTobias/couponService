package com.tobias.couponservice.outer.dto;


import com.tobias.couponservice.inner.domain.Coupon;
import com.tobias.couponservice.inner.domain.standardType.PublisherType;
import com.tobias.couponservice.inner.domain.standardType.Type;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class FindCouponRes {

	private long id;
	private String content;
	private Type type;
	private int discountAmount;
	private PublisherType publisherType;
	private long brandid;
	private String brandname;
	private int leastAmount;
	private Date openDate;
	private Date endDate;


	public FindCouponRes(Coupon coupon) {
		this.id = coupon.getId();
		this.content = coupon.getContent();
		this.type = coupon.getType();
		this.discountAmount = coupon.getDiscountAmount();
		this.publisherType = coupon.getPublisherVo().getPublisherType();
		this.brandid = coupon.getPublisherVo().getBrandid();
		this.brandname = coupon.getPublisherVo().getBrandname();
		this.leastAmount = coupon.getConditionVo().getLeastAmount();
		this.openDate = coupon.getConditionVo().getOpenDate();
		this.endDate = coupon.getConditionVo().getEndDate();
	}
}