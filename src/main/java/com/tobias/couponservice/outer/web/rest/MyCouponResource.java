package com.tobias.couponservice.outer.web.rest;

����ũ�μ���.coupon.outer.web;

import ����ũ�μ���.coupon.outer.dto.SaveMyCouponRequest;
import ����ũ�μ���.coupon.inner.Impl.CouponItemServiceImpl;

/**
 * @author ur2ku
 * @version 1.0
 * @created 08-12-2022 ���� 7:45:33
 */
public class MyCouponResource {

	public MyCouponResource(){

	}

	public void finalize() throws Throwable {

	}

	/**
	 * 
	 * @param saveMyCouponRequest
	 */
	public ResponseEntity saveMyCoupon(SaveMyCouponRequest saveMyCouponRequest){
		return null;
	}

	/**
	 * 
	 * @param userid
	 */
	public ResponseEntity<List<FindMyCouponDetailResponse>> findMyCoupon(String userid){
		return null;
	}

	/**
	 * 
	 * @param userid
	 * @param couponItemId
	 */
	public ResponseEntity useMyCoupon(String userid, Long couponItemId){
		return null;
	}

}