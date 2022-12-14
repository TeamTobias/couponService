package com.tobias.couponservice.outer.dto;

import lombok.Data;

@Data
public class SaveMyCouponRequest {

	private String userid;
	private String couponid;

	public SaveMyCouponRequest(String userid, String couponid) {
		this.userid = userid;
		this.couponid = couponid;
	}


	public long getCouponid(){
		return Long.parseLong(couponid);
	}

}

