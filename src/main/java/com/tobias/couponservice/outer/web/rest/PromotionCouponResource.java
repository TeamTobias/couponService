package com.tobias.couponservice.outer.web.rest;

import com.tobias.couponservice.inner.service.CouponService;
import com.tobias.couponservice.outer.dto.PromotionCouponRequest;
import com.tobias.couponservice.outer.dto.ResponseMessage;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/promotionCoupon")
@RequiredArgsConstructor
public class PromotionCouponResource {

	private final CouponService couponService;

	@ApiResponse(responseCode = "200", content = @Content(mediaType = "application/json", schema = @Schema(implementation = ResponseMessage.class)))
	@PostMapping("/v1")
	public ResponseEntity<ResponseMessage> promotionCouponRequest(@RequestBody PromotionCouponRequest promotionCouponRequest){
		couponService.promotionCouponRequest(promotionCouponRequest);
		return ResponseEntity.ok(new ResponseMessage());
	}

	@ApiResponse(responseCode = "200", content = @Content(mediaType = "application/json", schema = @Schema(implementation = ResponseMessage.class)))
	@PostMapping("/v1/{managerid}/{couponid}")
	public ResponseEntity<ResponseMessage> brandCouponPermit(long couponid, long managerid){
		couponService.brandCouponPermit(couponid, managerid);
		return ResponseEntity.ok(new ResponseMessage());
	}


}