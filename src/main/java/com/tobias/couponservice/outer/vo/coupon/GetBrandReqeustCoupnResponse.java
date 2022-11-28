package com.tobias.couponservice.outer.vo.coupon;

import lombok.Data;

import java.util.Date;

@Data
public class GetBrandReqeustCoupnResponse {


    //- 브랜드 id
    private String brandid;


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
    private Date endDate;


    //- 쿠폰 생성일
    private Date createdAt;


}
