package com.tobias.couponservice.inner.domain.aggregate;

import com.tobias.couponservice.inner.domain.CouponStatus;
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
    @Column(name = "promotioncouponitemid", nullable = false)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "mycouponid")
    private MyCoupon myCoupon;

    @Enumerated(EnumType.STRING)
    private CouponStatus status;
}
