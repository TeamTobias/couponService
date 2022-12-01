package com.tobias.couponservice.inner.service;

import com.tobias.couponservice.inner.domain.entity.Coupon;
import com.tobias.couponservice.inner.domain.entity.standardType.PermitStatus;
import com.tobias.couponservice.inner.domain.entity.standardType.PublisherType;
import com.tobias.couponservice.inner.domain.entity.standardType.Type;
import com.tobias.couponservice.inner.repository.CouponRepository;
import com.tobias.couponservice.outer.dto.brand.RegisterdRequestDto;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.Description;
import org.springframework.context.annotation.Profile;
import org.springframework.test.annotation.Commit;

import java.util.Date;

@Profile("dev")
@SpringBootTest
public class CouponServiceTests {

    @Autowired
    private CouponRepository couponRepository;

    @Autowired
    private CouponService couponService;


    /*판매자 쿠폰 등록 요청*/
    @Test
    @Commit
    @Description("판매자 쿠폰 등록 요청")
    public void registerBrandCouponRequest() {
        // BrandCouponRequestDto Builder
        RegisterdRequestDto registerdRequestDto = RegisterdRequestDto.builder()
                .brandid("1234")
                .openDate(new Date())
                .endDate(new Date())
                .content("쿠폰 내용")
                .type("PERCENTAG")
                .discountAmount(1000)
                .leastAmount(5000)
                .build();

        // BrandCouponRequestService.registerBrandCouponRequest(RegisterdRequestDto)
        couponService.registerBrandCouponRequest(registerdRequestDto);

        // if couponrepository.finlast.status  == PermitStatus.REQUESTED true
        if (couponRepository.findCouponByOrderByCreatedAt().getPermitStatus().equals(PermitStatus.REQUESTED)) {
            Assertions.assertTrue(true);
        } else {
            Assertions.fail();
        }
    }



    /*판매자 쿠폰 조회*/
    @Test
    @Description("판매자 쿠폰 조회")
    public void findBrandCoupon() {
        // 쿠폰 엔티티 builder (brandid = “1”, PublisherType = Brand)
        Coupon coupon = Coupon.builder()
                .brandid("1")
                .publisherType(PublisherType.valueOf("BRAND"))
                .openDate(new Date())
                .endDate(new Date())
                .content("쿠폰 내용")
                .type(Type.valueOf("PERCENTAG"))
                .discountAmount(1000)
                .leastAmount(5000)
                .permitStatus(PermitStatus.REQUESTED)
                .build();

        // couponRepository Save
        couponRepository.save(coupon);

        // 쿠폰 엔티티 builder  (brandid = “2”, PublisherType = Brand)
        Coupon coupon2 = Coupon.builder()
                .brandid("2")
                .publisherType(PublisherType.valueOf("BRAND"))
                .openDate(new Date())
                .endDate(new Date())
                .content("쿠폰 내용")
                .type(Type.valueOf("PERCENTAG"))
                .discountAmount(1000)
                .leastAmount(5000)
                .permitStatus(PermitStatus.REQUESTED)
                .build();

        // couponRepository Save
        couponRepository.save(coupon2);

        // 쿠폰 엔티티 builder  (brandid = “3”, PublisherType = MANAGER)
        Coupon coupon3 = Coupon.builder()
                .brandid("3")
                .publisherType(PublisherType.valueOf("MANAGER"))
                .openDate(new Date())
                .endDate(new Date())
                .content("쿠폰 내용")
                .type(Type.valueOf("PERCENTAG"))
                .discountAmount(1000)
                .leastAmount(5000)
                .permitStatus(PermitStatus.REQUESTED)
                .build();

        //couponRepository Save
        couponRepository.save(coupon3);

        // if each (Coupon Brandid == brandCouponService.findBrandCoupon(“1”)) && (PublisherType.BRAND == brandCouponService.findBrandCoupon(“1”)) true;
        for (Coupon coupon1 : couponService.findBrandCoupon("1")) {
            if (coupon1.getBrandid().equals("1") && coupon1.getPublisherType().equals(PublisherType.BRAND)) {
                Assertions.assertTrue(true);
            } else {
                Assertions.fail();
            }
        }


    }


    /*판매자 쿠폰 만료*/






    /*프로모션 쿠폰 등록*/
    @Test
    @Description("프로모션 쿠폰 등록")
    private void registerPromotionCoupon() {


    }

    /*프로모션 쿠폰 조회*/
    @Test
    @Description("프로모션 쿠폰 등록")
    private void findPromotionCoupon() {

    }
}
