package com.tobias.couponservice.inner.domain.aggregate;

import com.tobias.couponservice.inner.repository.MyCouponRepository;
import org.aspectj.lang.annotation.Before;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class MyCouponTests {
    @Autowired
    private MyCouponRepository myCouponRepository;




    @Test
    public void test() {
        MyCoupon myCoupon = new MyCoupon();
        myCoupon.setUserId(1L);
        myCoupon.setBrandCouponItems(null);
        myCoupon.setPromotionCouponItems(null);
    }



}
