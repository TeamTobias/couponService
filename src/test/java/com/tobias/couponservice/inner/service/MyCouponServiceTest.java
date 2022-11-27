package com.tobias.couponservice.inner.service;

import com.tobias.couponservice.inner.repository.CouponItemRepository;
import com.tobias.couponservice.outer.dto.MyCouponDto;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.Description;

@SpringBootTest
public class MyCouponServiceTest {

    private MyCouponService myCouponService;
    @Autowired private CouponItemRepository couponItemRepository;

    /*내 쿠폰 등록*/
    @Test
    @Description("내 쿠폰 등록")
    private void saveMyCoupon() {

        MyCouponDto myCouponDto = MyCouponDto.builder()
                .userid("1")
                .couponid("2")
                .build();

        couponItemRepository.findByUserid("1");

    }

}
