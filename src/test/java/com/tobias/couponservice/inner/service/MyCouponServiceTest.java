package com.tobias.couponservice.inner.service;

import com.tobias.couponservice.inner.domain.entity.Coupon;
import com.tobias.couponservice.inner.domain.standardType.CouponItemStatus;
import com.tobias.couponservice.inner.domain.standardType.PermitStatus;
import com.tobias.couponservice.inner.domain.standardType.PublisherType;
import com.tobias.couponservice.inner.repository.CouponItemRepository;
import com.tobias.couponservice.inner.repository.CouponRepository;
import com.tobias.couponservice.outer.dto.MyCouponDto;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.Description;
import org.springframework.context.annotation.Profile;
import org.springframework.test.annotation.Commit;


@Profile("test")
@SpringBootTest
public class MyCouponServiceTest {

    @Autowired
    private MyCouponService myCouponService;

    @Autowired
    private CouponRepository couponRepository;

    @Autowired
    private CouponItemRepository couponItemRepository;

    // set profile test
    @BeforeAll
    static void beforeAll() {

        System.setProperty("spring.profiles.active", "test");

    }


    @BeforeEach
    public void init() {

        couponRepository.save(Coupon.builder()
                .id(1L)
                .publisherType(PublisherType.BRAND)
                .permitStatus(PermitStatus.PERMIT)
                .build());
    }


    /*내 쿠폰 등록*/
    @Description("내 쿠폰 등록")
    @Commit
    @Test
    void saveMyCoupon() {

        myCouponService.saveMyCoupon(MyCouponDto.builder()
                .userid("1")
                .couponid("1")
                .build());


        myCouponService.saveMyCoupon(MyCouponDto.builder()
                .userid("1")
                .couponid("1")
                .build());

    }


    /*내 쿠폰 사용*/
    @Description("내 쿠폰 사용")
    @Commit
    @Test
    void useMyCoupon() {


        Coupon coupon = Coupon.builder()
                .id(1L)
                .publisherType(PublisherType.BRAND)
                .permitStatus(PermitStatus.PERMIT)
                .build();

        couponRepository.save(coupon);

        myCouponService.saveMyCoupon(MyCouponDto.builder()
                .userid("1")
                .couponid("1")
                .build());

        myCouponService.useMyCoupon("1", 1L);

        // couponItem의 status가 USED로 변경되었는지 확인
        Assertions.assertEquals(CouponItemStatus.USED, couponItemRepository.findByUseridAndCoupon("1", coupon).getStatus());

    }


}


