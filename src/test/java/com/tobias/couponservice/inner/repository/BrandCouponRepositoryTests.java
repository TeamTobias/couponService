package com.tobias.couponservice.inner.repository;

import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.Profile;


@Profile("test")
@SpringBootTest
public class BrandCouponRepositoryTests {
//
//    @BeforeAll
//    public static void beforeAll() {
//        System.setProperty("spring.profiles.active", "dev");
//    }
//
//    @Autowired
//    private BrandCouponRepository brandCouponRepository;
//
//    /*insert data*/
//    @Test
//    public void testInsert() {
//
//        IntStream.rangeClosed(1, 20).forEach(i -> {
//
//            BrandCoupon brandCoupon = BrandCoupon.builder()
//                    .brandId(UUID.randomUUID().toString())
//                    .status(BrandCouponPermitStatus.PERMIT)
//                    .description("description")
//                    .type(CouponType.AMOUNT)
//                    .leastPrice(1000L)
//                    .openDate(new Date())
//                    .closeDate(new Date())
//                    .build();
//
//
//            brandCouponRepository.save(brandCoupon);
//        });
//
//
//    }

}
