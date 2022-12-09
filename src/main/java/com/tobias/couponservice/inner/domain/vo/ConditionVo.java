package com.tobias.couponservice.inner.domain.vo;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.CreatedDate;

import javax.persistence.Embeddable;
import java.io.Serializable;
import java.util.Date;

@Data
@Embeddable
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class ConditionVo implements Serializable {


    /*쿠폰 적용 가능 금액*/
    private int leastAmount;

    /*쿠폰 시작일*/
    private Date openDate;

    /*쿠폰 종료일*/
    private Date endDate;

    /*쿠폰 생성일*/
    @CreatedDate
    private Date createdAt;

}