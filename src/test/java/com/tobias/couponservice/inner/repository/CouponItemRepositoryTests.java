package com.tobias.couponservice.inner.repository;

import com.tobias.couponservice.inner.domain.aggregate.CouponItem;
import com.tobias.couponservice.inner.domain.entity.Coupon;
import com.tobias.couponservice.inner.domain.standardType.PermitStatus;
import com.tobias.couponservice.inner.domain.standardType.PublisherType;
import com.tobias.couponservice.inner.domain.standardType.Type;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.Description;
import org.springframework.context.annotation.Profile;
import org.springframework.test.annotation.Commit;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;

@Profile("test")
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
                .startDate(new Date())
                .endDate(new Date())
                .build();

        couponRepository.save(coupon);

        couponItemRepository.save(CouponItem.builder().userid("1").coupon(coupon).build());
//        couponItemRepository.save(CouponItem.builder().userid("1").coupon(coupon).build());


        couponRepository.findAll().forEach(System.out::println);
        couponItemRepository.findAll().forEach(System.out::println);

    }


    @Test
    @Commit
    @Transactional
    @Description("userid로 couponitem 조회 테스트")
    void findByUserid() {

        couponItemRepository.findByUserid("1").forEach(System.out::println);

    }


}
