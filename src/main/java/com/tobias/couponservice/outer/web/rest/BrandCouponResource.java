package com.tobias.couponservice.outer.web.rest;

import com.tobias.couponservice.inner.service.CouponService;
import com.tobias.couponservice.outer.dto.BrandCouponRequest;
import com.tobias.couponservice.outer.dto.BrandCouponRequestRes;
import com.tobias.couponservice.outer.dto.FindCouponRes;
import com.tobias.couponservice.outer.dto.ResponseMessage;
import io.swagger.v3.oas.annotations.media.ArraySchema;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/brandCoupon")
public class BrandCouponResource {

    private final CouponService couponService;


    @ApiResponse(responseCode = "200", content = @Content(mediaType = "application/json", schema = @Schema(implementation = ResponseMessage.class)))
    @PostMapping("/v1")
    public ResponseEntity brandCouponRequest(@RequestBody BrandCouponRequest brandCouponRequest) {
        return null;
    }


    @ApiResponse(responseCode = "200", content = @Content(mediaType = "application/json", array = @ArraySchema(schema = @Schema(implementation = FindCouponRes.class))))
    @GetMapping("/v1/{brandid}")
    public ResponseEntity<List<FindCouponRes>> findBrandCoupon(@PathVariable long brandid) {
        couponService.findBrandCoupon(brandid);
        return null;
    }


    @ApiResponse(responseCode = "200", content = @Content(mediaType = "application/json", array = @ArraySchema(schema = @Schema(implementation = BrandCouponRequestRes.class))))
    @GetMapping("/v1")
    public ResponseEntity<List<BrandCouponRequestRes>> findBrandCouponRequest() {
        List<BrandCouponRequestRes> brandCouponRequestReses = couponService.findBrandCouponRequest();
        return ResponseEntity.ok(brandCouponRequestReses);
    }
}