package com.tobias.couponservice.inner.domain.entity;

import com.tobias.couponservice.inner.domain.entity.standardType.Type;
import com.tobias.couponservice.inner.domain.vo.ConditionVo;
import lombok.*;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Coupon implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    /*쿠폰 내용*/
    private String content;

    /*쿠폰 타입*/
    @Enumerated(EnumType.STRING)
    private Type type;

    /*쿠폰 할인 금액*/
    private int discountAmount;

    @Embedded
    private PublisherVo publisherVo;

    @Embedded
    private ConditionVo conditionVo;

    public void getCoupon(long couponid) {
        this.id = couponid;
    }
}
