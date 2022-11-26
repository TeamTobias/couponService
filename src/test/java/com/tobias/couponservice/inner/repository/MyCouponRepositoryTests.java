package com.tobias.couponservice.inner.repository;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.Description;
import org.springframework.context.annotation.Profile;

import java.util.Date;

@Profile("dev")
@SpringBootTest
public class MyCouponRepositoryTests {

//    @Autowired
//    private MyCouponRepository myCouponRepository;
//
//    @Autowired
//    private BrandCouponItemRepository brandCouponItemRepository;
//
//    @Autowired
//    private PromotionCouponItemRepository promotionCouponItemRepository;
//
//    @Autowired
//    private PromotionCouponRepository promotionCouponRepository;
//
//    @Autowired
//    private BrandCouponRepository brandCouponRepository;
//
//    @BeforeAll
//    public static void beforeAll() {
//        System.setProperty("spring.profiles.active", "dev");
//    }
//
//    /*더미 데이터 집어넣기*/
//    @Description("더미 데이터 집어넣기")
//    @BeforeEach
//    public void beforeEach() {
//        /*promotion coupon*/
//        promotionCouponRepository.save(PromotionCoupon.builder()
//                .managerid("1000")
//                .description("쿠폰 내용 입력함")
//                .couponType(CouponType.AMOUNT)
//                .leastPrice(1000L)
//                .openDate(new Date())
//                .closeDate(new Date())
//                .build());
//
//
//        /*brand coupon*/
//        brandCouponRepository.save(BrandCoupon.builder()
//                .brandId("1000")
//                .status(BrandCouponPermitStatus.PERMIT)
//                .description("쿠폰 내용 입력함")
//                .type(CouponType.AMOUNT)
//                .leastPrice(1000L)
//                .openDate(new Date())
//                .closeDate(new Date())
//                .build());
//
//
//
//    }
//
//    /*내 쿠폰 등록*/
//    @Test
//    @Description("내 쿠폰 등록")
//    public void test() {
//            /*promotion coupon*/
//            MyCoupon myCoupon = MyCoupon.builder()
//                    .userId("12")
//                    .build();
//
//            myCouponRepository.save(myCoupon);
//    }
}
