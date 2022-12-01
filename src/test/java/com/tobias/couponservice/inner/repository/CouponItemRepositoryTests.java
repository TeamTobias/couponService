package com.tobias.couponservice.inner.repository;

import com.tobias.couponservice.inner.domain.entity.CouponItem;
import com.tobias.couponservice.inner.domain.entity.Coupon;
import com.tobias.couponservice.inner.domain.entity.standardType.PermitStatus;
import com.tobias.couponservice.inner.domain.entity.standardType.PublisherType;
import com.tobias.couponservice.inner.domain.entity.standardType.Type;
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
        System.setProperty("spring.profiles.active", "test");
    }


    @Test
    @Commit
    @Description("couponitem 등록 테스트")
    void saveCouponItem() {

        Coupon coupon = Coupon.builder()
                .publisherType(PublisherType.BRAND)
                .permitStatus(PermitStatus.PERMIT)
                .content("content")
                .type(Type.PERCENTAG)
                .leastAmount(1000)
                .openDate(new Date())
                .endDate(new Date())
                .build();

        couponRepository.save(coupon);

        couponItemRepository.save(CouponItem.builder().userid("1").coupon(coupon).build());


        couponRepository.findAll().forEach(System.out::println);
        couponItemRepository.findAll().forEach(System.out::println);

    }







}
