package com.tobias.couponservice.inner.domain;

import com.tobias.couponservice.inner.domain.standardType.PermitStatus;
import com.tobias.couponservice.inner.domain.standardType.PublisherType;
import com.tobias.couponservice.inner.domain.standardType.Type;
import com.tobias.couponservice.inner.domain.vo.ConditionVo;
import com.tobias.couponservice.inner.domain.vo.PublisherVo;
import com.tobias.couponservice.outer.dto.PromotionCouponRequest;
import lombok.*;
import org.modelmapper.ModelMapper;
import org.modelmapper.convention.MatchingStrategies;

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



    public long getBrandid() {
        return this.publisherVo.getBrandid();
    }

    public PublisherType getPublisherType() {
        return this.publisherVo.getPublisherType();
    }

    public void setPermitStatus(PermitStatus requested) {
        this.publisherVo.setPermitStatus(requested);
    }

    public void setManagerid(long managerid) {
        this.publisherVo.setManagerid(managerid);
    }
}
