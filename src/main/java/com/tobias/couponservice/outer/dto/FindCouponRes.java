package com.tobias.couponservice.outer.dto;


import com.tobias.couponservice.inner.domain.standardType.PublisherType;
import com.tobias.couponservice.inner.domain.standardType.Type;
import lombok.Data;

import java.util.Date;

@Data
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


}