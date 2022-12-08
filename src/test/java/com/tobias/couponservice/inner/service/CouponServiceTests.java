package com.tobias.couponservice.inner.service;

import com.tobias.couponservice.inner.domain.Coupon;
import com.tobias.couponservice.inner.domain.vo.PublisherVo;
import com.tobias.couponservice.inner.domain.standardType.PermitStatus;
import com.tobias.couponservice.inner.domain.standardType.PublisherType;
import com.tobias.couponservice.inner.domain.standardType.Type;
import com.tobias.couponservice.inner.domain.vo.ConditionVo;
import com.tobias.couponservice.outer.repository.CouponRepository;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.Description;
import org.springframework.context.annotation.Profile;

import java.util.Date;

@Profile("dev")
@SpringBootTest
class CouponServiceTests {

    @Autowired
    private CouponRepository couponRepository;

    @Autowired
    private CouponService couponService;


//    /*판매자 쿠폰 등록 요청*/
//    @Test
//    @Commit
//    @Description("판매자 쿠폰 등록 요청")
//    void registerBrandCouponRequest() {
//        // BrandCouponRequestDto Builder
//        RegisterdRequestDto registerdRequestDto = RegisterdRequestDto.builder()
//                .brandid("1234")
//                .openDate(new Date())
//                .endDate(new Date())
//                .content("쿠폰 내용")
//                .type("PERCENTAG")
//                .discountAmount(1000)
//                .leastAmount(5000)
//                .build();
//
//        // BrandCouponRequestService.registerBrandCouponRequest(RegisterdRequestDto)
//        couponService.registerBrandCouponRequest(registerdRequestDto);
//
//        // if couponrepository.finlast.status  == PermitStatus.REQUESTED true
//        if (couponRepository.findCouponByOrderByCreatedAt().getPermitStatus().equals(PermitStatus.REQUESTED)) {
//            Assertions.assertTrue(true);
//        } else {
//            Assertions.fail();
//        }
//    }


    private static Coupon createCoupon() {

        return Coupon.builder()
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
                        .openDate(new Date())
                        .endDate(new Date())
                        .build())
                .build();

    }

    /*판매자 쿠폰 조회*/
    @Test
    @Description("판매자 쿠폰 조회")
    void findBrandCoupon() {
        // 쿠폰 엔티티 builder (brandid = “1”, PublisherType = Brand)
        Coupon coupon = Coupon.builder()
                .content("쿠폰 내용")
                .type(Type.PERCENTAG)
                .discountAmount(1000)
                .publisherVo(PublisherVo.builder()
                        .brandid(Long.parseLong("1"))
                        .publisherType(PublisherType.BRAND)
                        .permitStatus(PermitStatus.PERMIT)
                        .managerid(Long.parseLong("1234"))
                        .build())
                .conditionVo(ConditionVo.builder()
                        .leastAmount(5000)
                        .openDate(new Date())
                        .endDate(new Date())
                        .build())
                .build();

        // couponRepository Save
        couponRepository.save(coupon);

        // 쿠폰 엔티티 builder  (brandid = “2”, PublisherType = Brand)
        Coupon coupon2 = Coupon.builder()
                .content("쿠폰 내용")
                .type(Type.PERCENTAG)
                .discountAmount(1000)
                .publisherVo(PublisherVo.builder()
                        .brandid(Long.parseLong("2"))
                        .publisherType(PublisherType.BRAND)
                        .permitStatus(PermitStatus.PERMIT)
                        .managerid(Long.parseLong("1234"))
                        .build())
                .conditionVo(ConditionVo.builder()
                        .leastAmount(5000)
                        .openDate(new Date())
                        .endDate(new Date())
                        .build())
                .build();

        // couponRepository Save
        couponRepository.save(coupon2);

        // 쿠폰 엔티티 builder  (brandid = “3”, PublisherType = MANAGER)
        Coupon coupon3 = Coupon.builder()
                .content("쿠폰 내용")
                .type(Type.PERCENTAG)
                .discountAmount(1000)
                .publisherVo(PublisherVo.builder()
                        .brandid(Long.parseLong("3"))
                        .publisherType(PublisherType.BRAND)
                        .permitStatus(PermitStatus.PERMIT)
                        .managerid(Long.parseLong("1234"))
                        .build())
                .conditionVo(ConditionVo.builder()
                        .leastAmount(5000)
                        .openDate(new Date())
                        .endDate(new Date())
                        .build())
                .build();

        //couponRepository Save
        couponRepository.save(coupon3);

        // if each (Coupon Brandid == brandCouponService.findBrandCoupon(“1”)) && (PublisherType.BRAND == brandCouponService.findBrandCoupon(“1”)) true;
        for (Coupon coupon1 : couponService.findBrandCoupon(Long.parseLong("1"))) {
            if (coupon1.getBrandid() == 1L && coupon1.getPublisherType().equals(PublisherType.BRAND)) {
                Assertions.assertTrue(true);
            } else {
                Assertions.fail();
            }
        }


    }


    /*판매자 쿠폰 만료*/






//    /*프로모션 쿠폰 등록*/
//    @Test
//    @Description("프로모션 쿠폰 등록")
//    void registerPromotionCoupon() {
//
//
//    }
//
//    /*프로모션 쿠폰 조회*/
//    @Test
//    @Description("프로모션 쿠폰 등록")
//    void findPromotionCoupon() {
//
//    }
}
