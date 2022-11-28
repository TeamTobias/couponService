package com.tobias.couponservice.outer.vo.couponItem;

import lombok.Data;

/*
*
* @Description: 내 쿠폰 조회 응답
* @Author: ImKunYoung
*
*/

@Data
public class GetMyCouponRequest {

    //- 쿠폰 타입
    private String couponType;

    //- 브랜드 id
    private String brandid;

    //- 세일즈 타입
    private String salesType;

    //- 쿠폰 세일즈
    private String couponSales;

    //- 쿠폰 내용
    private String content;

    //- 쿠폰 사용 가능 금액
    private String leastAmount;

    //- 쿠폰 만료일
    private String closeDate;

}
