package com.tobias.couponservice.inner.domain.aggregate;

import com.tobias.couponservice.inner.domain.CouponStatus;
import com.tobias.couponservice.inner.domain.entity.PromotionCoupon;
import lombok.*;

import javax.persistence.*;

@Entity
@Getter
@Setter
@ToString
@RequiredArgsConstructor
@Table(name = "promotioncouponitem")
public class PromotionCouponItem {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "promotioncouponitemid", nullable = false)
    private Long id;

    @ManyToOne
    private MyCoupon myCoupon;

    @Enumerated(EnumType.STRING)
    private CouponStatus status;

    @ManyToOne
    private PromotionCoupon promotionCoupon;
}
