package com.tobias.couponservice.outer.dto;

import lombok.Data;
/*
*
* @Description: 내 쿠폰 등록
*
* */
@Data
public class MyCouponDto {

    /*사용자 일련 번호*/
    private String userid;

    /*쿠폰 일련 번호*/
    private String couponid;

}
