package com.tobias.couponservice.outer.web.rest;

import com.tobias.couponservice.outer.dto.BrandCouponRequest;
import com.tobias.couponservice.outer.dto.FindCouponRes;
import com.tobias.couponservice.outer.dto.ResponseMessage;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/brandCoupon")
public class BrandCouponResource {


    @ApiResponse(responseCode = "200", content = @Content(mediaType = "application/json", schema = @Schema(implementation = ResponseMessage.class)))
    @PostMapping("/v1")
    public ResponseEntity brandCouponRequest(@RequestBody BrandCouponRequest brandCouponRequest) {
        return null;
    }


//    @ApiResponse(responseCode = "200", content = @Content(mediaType = "application/json", schema = @Schema(implementation = ResponseMessage.class)))
    public ResponseEntity<List<FindCouponRes>> findBrandCoupon(@PathVariable("brandid") String brandid) {
        return null;
    }

}