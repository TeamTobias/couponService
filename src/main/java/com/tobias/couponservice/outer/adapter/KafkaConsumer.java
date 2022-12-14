package com.tobias.couponservice.outer.adapter;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.tobias.couponservice.inner.service.CouponItemService;
import com.tobias.couponservice.outer.dto.SaveMyCouponRequest;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

import com.fasterxml.jackson.core.type.TypeReference;
import java.util.Map;

@Service
@Slf4j
@RequiredArgsConstructor
public class KafkaConsumer {

    private final CouponItemService couponItemService;


    @KafkaListener(topics = "coupon", groupId = "coupon")
    public void processMessage(String kafkaMessage) {
        log.info("Kafka MessageL ====>"+kafkaMessage);

        Map<Object, Object> map;
        ObjectMapper mapper = new ObjectMapper();

        try {
            map = mapper.readValue(kafkaMessage, new TypeReference<>() {});
        } catch (JsonProcessingException e) {
            throw new RuntimeException(e);
        }

        SaveMyCouponRequest saveMyCouponRequest = new SaveMyCouponRequest((String) map.get("userid"), (String) map.get("couponid"));
        couponItemService.saveMyCoupon(saveMyCouponRequest);


    }


}
