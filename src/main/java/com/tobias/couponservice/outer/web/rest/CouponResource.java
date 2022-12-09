package com.tobias.couponservice.outer.web.rest;

import com.tobias.couponservice.outer.dto.FindCouponRes;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/coupon")
public class CouponResource {


	@ApiResponse(responseCode = "200", content = @Content(mediaType = "application/json", schema = @Schema(implementation = FindCouponRes.class)))
	@GetMapping("/v1")
	public ResponseEntity<List<FindCouponRes>> findCoupon(){
		return null;
	}

}