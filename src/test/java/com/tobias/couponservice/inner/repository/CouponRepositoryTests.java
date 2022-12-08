package com.tobias.couponservice.inner.repository;

import com.tobias.couponservice.inner.domain.Coupon;
import com.tobias.couponservice.inner.domain.standardType.PermitStatus;
import com.tobias.couponservice.inner.domain.standardType.PublisherType;
import com.tobias.couponservice.inner.domain.standardType.Type;
import com.tobias.couponservice.inner.domain.vo.ConditionVo;
import com.tobias.couponservice.inner.domain.vo.PublisherVo;
import com.tobias.couponservice.outer.repository.CouponRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeAll;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Commit;

import java.util.Date;

@SpringBootTest
public class CouponRepositoryTests {

    @Autowired
    private CouponRepository couponRepository;

    @BeforeAll
    public static void setProfile() {
        System.setProperty("spring.profiles.active", "local");
    }

    @BeforeEach
    @Commit
     void sss() {
        for (int i = 0; i < 10; i++) {
            couponRepository.save(Coupon.builder()
                    .content("쿠폰 내용")
                    .type(Type.PERCENTAG)
                    .discountAmount(1000)
                    .publisherVo(PublisherVo.builder()
                            .brandid(Long.parseLong("1234"))
                            .publisherType(PublisherType.BRAND)
                            .permitStatus(PermitStatus.PERMIT)
                            .managerid(Long.parseLong("1234"))
                            .build())
                    .conditionVo(ConditionVo.builder()
                            .leastAmount(5000)
                            // 2022-10-12
                            .openDate(new Date(1634032000000L))
                            // 2023-12-24
                            .endDate(new Date(1711888000000L))
                            .build())
                    .build());
        }

    }

    @Test
    @Commit
    void init() {


        // insert coupons
        for (int i = 0; i < 10; i++) {
            couponRepository.save(Coupon.builder()
                    .content("쿠폰 내용")
                    .type(Type.PERCENTAG)
                    .discountAmount(1000)
                    .publisherVo(PublisherVo.builder()
                            .brandid(Long.parseLong("1234"))
                            .publisherType(PublisherType.BRAND)
                            .permitStatus(PermitStatus.PERMIT)
                            .managerid(Long.parseLong("1234"))
                            .build())
                    .conditionVo(ConditionVo.builder()
                            .leastAmount(5000)
                            // 2021-10-12
                            .openDate(new Date(1634032000000L))
                            // 2022-12-24
                            .endDate(new Date(1711888000000L))
                            .build())
                    .build());
        }

    }


    @Test
    void testSelectCoupon() {
        couponRepository.findAll().forEach(System.out::println);
        couponRepository.findEnableCoupon().forEach(System.out::println);
    }

}
