package com.tobias.couponservice.outer.dto;

import lombok.Data;

import java.util.Date;
/*
*
* @Description : 판매자 쿠폰 등록 요청
* @Author : ImKunYoung
*
* */

@Data
public class RegisterdRequestDto {

    //- 판매자 일련번호
    private String brandid;

    //- 쿠폰 오픈일
    private Date openDate;

    //- 쿠폰 만료일
    private Date closeDate;

    //- 쿠폰 내용
    private String content;

    //- 쿠폰 세일즈 타입
    private String salesType;

    //- 쿠폰 할인 금액
    private int discountAmount;

    //- 쿠폰 사용 가능 금액
    private int leastAmount;

}
