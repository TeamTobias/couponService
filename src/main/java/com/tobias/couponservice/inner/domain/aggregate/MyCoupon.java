package com.tobias.couponservice.inner.domain.aggregate;

import lombok.*;

import javax.persistence.*;
import java.util.List;

@Entity
@Getter
@Setter
@ToString
@RequiredArgsConstructor
@Table(name = "mycoupon")
public class MyCoupon {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "mycouponid", nullable = false)
    private Long id;

    @Column(name = "userid", nullable = false)
    private Long userId;

    /*TODO: -check*/
//    @OneToMany(mappedBy = "myCoupon", cascade = CascadeType.ALL)
//    private List<PromotionCouponItem> promotionCouponItems;
//
//    @OneToMany(mappedBy = "myCoupon", cascade = CascadeType.ALL)
//    private List<BrandCouponItem> brandCouponItems;

}
