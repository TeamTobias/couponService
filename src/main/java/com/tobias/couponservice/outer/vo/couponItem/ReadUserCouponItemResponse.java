package com.tobias.couponservice.outer.vo.couponItem;

import lombok.Data;

import java.util.Date;

/*
*
* @Description: 내 쿠폰 정보 반환
* @Author: ImKunYoung
*
*/

@Data
public class ReadUserCouponItemResponse {

    //- 쿠폰 사용 상태
    private String status;

    //- 쿠폰 발행처
    private String publisherType;

    //- 브랜드 id
    private Long brandid;

    //- 쿠폰 내용
    private String content;

    //- 쿠폰 타입
    private String type;

    //- 할인 금액
    private int discountAmount;

    //- 쿠폰 적용 가능 금액
    private int leastAmount;

    //- 쿠폰 시작일
    private Date openDate;

    //- 쿠폰 종료일
    private Date closeDate;


}
