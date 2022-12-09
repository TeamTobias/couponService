package com.tobias.couponservice.outer.dto;

import lombok.Data;

import java.util.Date;

@Data
public class BrandCouponRequest {

	private String brandid;
	private String brandname;
	private Date openDate;
	private Date endDate;
	private String content;
	private String type;
	private int discountAmount;
	private int leastAmount;


}