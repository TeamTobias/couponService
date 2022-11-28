package com.tobias.couponservice.outer.dto.user;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/*
*
* @Description: 내 쿠폰 등록
*
* */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class MyCouponDto {

    /*사용자 일련 번호*/
    private String userid;

    /*쿠폰 일련 번호*/
    private String couponid;

    public Long getCouponid() {
        return Long.valueOf(couponid);
    }

}
