package com.tobias.couponservice.outer.web.rest;

import com.tobias.couponservice.inner.service.CouponService;
import com.tobias.couponservice.outer.dto.FindCouponRes;
import io.swagger.v3.oas.annotations.media.ArraySchema;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.core.env.Environment;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
@CrossOrigin(origins = "*")
@RequestMapping("/coupon")
public class CouponResource {

	private final CouponService couponService;

	private final Environment environment;

	@GetMapping("/welcome")
	public ResponseEntity<String> welcome() {
		return ResponseEntity.ok(environment.getProperty("test.message"));
	}

	@ApiResponse(responseCode = "200", content = @Content(mediaType = "application/json", array = @ArraySchema(schema = @Schema(implementation = FindCouponRes.class))))
	@GetMapping("/v1")
	public ResponseEntity<List<FindCouponRes>> findCoupon(){
		return ResponseEntity.ok(couponService.findCoupon());
	}

}