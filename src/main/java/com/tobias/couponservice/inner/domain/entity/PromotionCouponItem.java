package com.tobias.couponservice.inner.domain.entity;

import com.tobias.couponservice.inner.domain.aggregate.MyCoupon;
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
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "mycouponid")
    private MyCoupon myCoupon;

    @Enumerated(EnumType.STRING)
    private CouponStatus status;
}
