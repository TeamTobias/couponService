package com.tobias.couponservice.inner.domain.entity;

import com.tobias.couponservice.inner.domain.entity.standardType.PermitStatus;
import com.tobias.couponservice.inner.domain.entity.standardType.PublisherType;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Embeddable;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import java.io.Serializable;

@Data
@Embeddable
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class PublisherVo implements Serializable {

    /*쿠폰 발행처*/
    @Enumerated(EnumType.STRING)
    private PublisherType publisherType;

    /*브랜드 일련 번호*/
    private String brandid;

    /*쿠폰 인가 상태*/
    @Enumerated(EnumType.STRING)
    private PermitStatus permitStatus;

    /*쿠폰 인가 직원 일련 번호*/
    private String managerid;

}