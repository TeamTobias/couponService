package com.tobias.couponservice.inner.service;

import com.tobias.couponservice.inner.domain.Coupon;
import com.tobias.couponservice.outer.repository.CouponItemRepository;
import com.tobias.couponservice.outer.repository.CouponRepository;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeAll;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.Description;
import org.springframework.context.annotation.Profile;
import org.springframework.test.annotation.Commit;



//import com.tobias.couponservice.inner.domain.entity.Coupon;
//import com.tobias.couponservice.inner.domain.entity.CouponItem;
//import com.tobias.couponservice.inner.domain.entity.standardType.CouponItemStatus;
//import com.tobias.couponservice.inner.domain.entity.standardType.PermitStatus;
//import com.tobias.couponservice.inner.domain.entity.standardType.PublisherType;
//import com.tobias.couponservice.inner.repository.CouponItemRepository;
//import com.tobias.couponservice.inner.repository.CouponRepository;
//import com.tobias.couponservice.outer.dto.user.MyCouponDto;
//import org.junit.jupiter.api.Assertions;
//import org.junit.jupiter.api.BeforeAll;
//import org.junit.jupiter.api.BeforeEach;
//import org.junit.jupiter.api.Test;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.test.context.SpringBootTest;
//import org.springframework.context.annotation.Description;
//import org.springframework.context.annotation.Profile;
//import org.springframework.test.annotation.Commit;

@Profile("local")
@SpringBootTest
public class CouponItemServiceTests {

//    @Autowired
//    private CouponItemService couponItemService;
//
//    @Autowired
//    private CouponRepository couponRepository;
//
//    @Autowired
//    private CouponItemRepository couponItemRepository;
//
//    // set profile test
//    @BeforeAll
//    static void beforeAll() {
//
//        System.setProperty("spring.profiles.active", "local");
//
//    }

    //
//    @BeforeEach
//    public void init() {
//
//        couponRepository.save(Coupon.builder()
//                .id(1L)
//                .publisherType(PublisherType.BRAND)
//                .permitStatus(PermitStatus.PERMIT)
//                .build());
//    }
//
//
//    /*내 쿠폰 등록*/
//    @Description("내 쿠폰 등록")
//    @Commit
//    @Test
//    void saveMyCoupon() {
//        Coupon coupon = Coupon.builder().id(1L).build();
//        couponRepository.save(coupon);
//
//
//        couponItemService.saveMyCoupon(MyCouponDto.builder()
//                .userid("1")
//                .couponid("1")
//                .build());


//        couponItemService.saveMyCoupon(MyCouponDto.builder()
//                .userid("1")
//                .couponid("1")
//                .build());
//
//    }

//
//    /*내 쿠폰 조회*/
//    //테스트
//    //- coupon save
//    //- couponitem save
//    //- couponitem service :: findmycoupon(userid) 호출
//    //- for couponitem.getType !=ENABLE -> fail
//    //- for couponitem.getType == ENABLE -> success
//    @Description("내 쿠폰 조회")
//    @Commit
//    @Test
//    void findMyCoupon() {
//
//        //coupon save
//        Coupon coupon = Coupon.builder()
//                .publisherType(PublisherType.BRAND)
//                .permitStatus(PermitStatus.PERMIT)
//                .build();
//        couponRepository.save(coupon);
//
//        //couponitem sample data 채움
//        couponItemRepository.save(CouponItem.builder()
//                .userid("1")
//                .coupon(coupon)
//                .status(CouponItemStatus.ENABLED)
//                .build());
//
//
//        //coupon save
//        Coupon coupon2 = Coupon.builder()
//                .publisherType(PublisherType.MANAGER)
//                .permitStatus(PermitStatus.PERMIT)
//                .build();
//
//        couponRepository.save(coupon2);
//
//        //couponitem sample data 채움
//        couponItemRepository.save(CouponItem.builder()
//                .userid("1")
//                .coupon(coupon2)
//                .status(CouponItemStatus.DISABLED)
//                .build());
//
//        // couponitem service :: findmycoupon(userid) 호출
//
//
//
//
//        for (CouponItem couponItem : couponItemService.findMyCoupon("1")) {
//            System.out.println("couponItem = " + couponItem);
//            if (couponItem.getStatus() != CouponItemStatus.ENABLED) {
//                System.out.println("fail");
//                Assertions.fail();
//            } else {
//                Assertions.assertTrue(true);
//            }
//        }
//
//    }

//
//    /*내 쿠폰 사용*/
//    @Description("내 쿠폰 사용")
//    @Commit
//    @Test
//    void useMyCoupon() {
//
//        Coupon coupon = Coupon.builder()
//                .id(1L)
//                .publisherType(PublisherType.BRAND)
//                .permitStatus(PermitStatus.PERMIT)
//                .build();
//
//        couponRepository.save(coupon);
//
//        couponItemService.saveMyCoupon(MyCouponDto.builder()
//                .userid("1")
//                .couponid("1")
//                .build());
//
//        couponItemService.useMyCoupon("1", 1L);
//
//        // couponItem의 status가 USED로 변경되었는지 확인
//        Assertions.assertEquals(CouponItemStatus.USED, couponItemRepository.findByUseridAndCoupon("1", coupon).getStatus());
//
//    }


}


