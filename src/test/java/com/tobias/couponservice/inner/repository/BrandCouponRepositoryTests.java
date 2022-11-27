package com.tobias.couponservice.inner.repository;

import com.tobias.couponservice.inner.domain.BrandCouponPermitStatus;
import com.tobias.couponservice.inner.domain.CouponType;
import com.tobias.couponservice.inner.domain.entity.BrandCoupon;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Date;
import java.util.UUID;
import java.util.stream.IntStream;

@SpringBootTest
public class BrandCouponRepositoryTests {

    @BeforeAll
    public static void beforeAll() {
        System.setProperty("spring.profiles.active", "dev");
    }

    @Autowired
    private BrandCouponRepository brandCouponRepository;

    /*insert data*/
    @Test
    public void testInsert() {

        IntStream.rangeClosed(1, 20).forEach(i -> {

            BrandCoupon brandCoupon = BrandCoupon.builder()
                    .brandId(UUID.randomUUID().toString())
                    .status(BrandCouponPermitStatus.PERMIT)
                    .description("description")
                    .type(CouponType.AMOUNT)
                    .leastPrice(1000L)
                    .openDate(new Date())
                    .closeDate(new Date())
                    .build();


            brandCouponRepository.save(brandCoupon);
        });


    }

}
