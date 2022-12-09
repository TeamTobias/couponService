package com.tobias.couponservice.inner.repository;

import com.tobias.couponservice.inner.domain.CouponItem;
import com.tobias.couponservice.inner.domain.Coupon;
import com.tobias.couponservice.inner.domain.vo.PublisherVo;
import com.tobias.couponservice.inner.domain.standardType.PermitStatus;
import com.tobias.couponservice.inner.domain.standardType.PublisherType;
import com.tobias.couponservice.inner.domain.standardType.Type;
import com.tobias.couponservice.inner.domain.vo.ConditionVo;
import com.tobias.couponservice.outer.repository.CouponItemRepository;
import com.tobias.couponservice.outer.repository.CouponRepository;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.Description;
import org.springframework.context.annotation.Profile;
import org.springframework.test.annotation.Commit;

import java.util.Date;

@Profile("dev")
@SpringBootTest
public class CouponItemRepositoryTests {

    @Autowired private CouponItemRepository couponItemRepository;
    @Autowired private CouponRepository couponRepository;


    // set profile test
    @BeforeAll
    public static void setProfile() {
        System.setProperty("spring.profiles.active", "local");
    }


    @Test
    @Commit
    @Description("couponitem 등록 테스트")
    void saveCouponItem() {

        Coupon coupon = Coupon.builder()
                .content("쿠폰 내용")
                .type(Type.PERCENTAG)
                .discountAmount(1000)
                .publisherVo(PublisherVo.builder()
                        .brandid(2L)
                        .publisherType(PublisherType.BRAND)
                        .permitStatus(PermitStatus.PERMIT)
                        .managerid(1L)
                        .build())
                .conditionVo(ConditionVo.builder()
                        .leastAmount(5000)
                        // 2022-10-12
                        .openDate(new Date(1634032000000L))
                        // 2022-12-24
                        .endDate(new Date(1640345600000L))
                        .build())
                .build();

        couponRepository.save(coupon);

        couponItemRepository.save(CouponItem.builder().userid("1").coupon(coupon).build());


        couponRepository.findAll().forEach(System.out::println);
        couponItemRepository.findAll().forEach(System.out::println);

    }







}
