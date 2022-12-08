package com.tobias.couponservice.outer.dto; ����ũ�μ���.coupon.outer.dto;


/**
 * @author ur2ku
 * @version 1.0
 * @created 08-12-2022 ���� 7:30:33
 */
public class BrandCouponRequestRes {

	private long id;
	private String content;
	private Type type;
	private int discountAmount;
	private long brandid;
	private String brandname;
	private int leastAmount;
	private Date openDate;
	private Date endDate;
	private Date createdAt;

	public BrandCouponRequestRes(){

	}

	public void finalize() throws Throwable {

	}

}