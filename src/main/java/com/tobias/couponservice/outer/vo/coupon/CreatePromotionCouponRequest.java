package com.tobias.couponservice.outer.vo.coupon;

/*
* @Description: 프로모션 쿠폰 등록
*/

import lombok.Data;

import java.util.Date;

@Data
public class CreatePromotionCouponRequest {

    //- 관리자 일련 번호
    private String brandid;

    //- 쿠폰 내용
    private String content;

    //- 쿠폰 타입
    private String type;

    //- 쿠폰 할인 금액
    private Long discountAmount;

    //- 쿠폰 사용 가능 금액
    private Long leastAmount;

    //- 쿠폰 시작일
    private Date openDate;

    //- 쿠폰 종료일
    private Date closeDate;

}
