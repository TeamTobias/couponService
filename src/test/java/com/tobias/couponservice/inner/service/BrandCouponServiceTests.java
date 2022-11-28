package com.tobias.couponservice.inner.service;

import com.tobias.couponservice.inner.domain.standardType.PermitStatus;
import com.tobias.couponservice.inner.repository.CouponRepository;
import com.tobias.couponservice.outer.dto.RegisterdRequestDto;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.Description;
import org.springframework.test.annotation.Commit;

import java.util.Date;

@SpringBootTest
public class BrandCouponServiceTests {

    @Autowired
    private CouponRepository couponRepository;

    @Autowired
    private BrandCouponService brandCouponService;


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
        brandCouponService.registerBrandCouponRequest(registerdRequestDto);

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
    }


    /*판매자 쿠폰 만료*/

}
