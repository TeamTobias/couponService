package com.tobias.couponservice.inner.domain.aggregate;

import com.tobias.couponservice.inner.domain.entity.BrandCouponItem;
import com.tobias.couponservice.inner.domain.entity.PromotionCouponItem;
import lombok.*;

import javax.persistence.*;
import java.util.Collection;
import java.util.List;

@Entity
@Getter
@Setter
@ToString
@RequiredArgsConstructor
@Table(name = "mycoupon")
public class MyCoupon {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "mycouponid", nullable = false)
    private Long id;

    @Column(name = "userid", nullable = false)
    private Long userId;

    @OneToMany(mappedBy = "myCoupon", cascade = CascadeType.ALL)
    private List<PromotionCouponItem> promotionCouponItems;

    @OneToMany(mappedBy = "myCoupon", cascade = CascadeType.ALL)
    private List<BrandCouponItem> brandCouponItems = new java.util.ArrayList<>();

}
