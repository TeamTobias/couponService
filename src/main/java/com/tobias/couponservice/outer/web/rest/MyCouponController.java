package com.tobias.couponservice.outer.web.rest;

import com.tobias.couponservice.outer.vo.ResponseMessage;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.ArraySchema;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.http.ResponseEntity;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@Tag(name = "myCoupon", description = "내 쿠폰 API")
@RestController
@RequestMapping("/myCoupon")
public class MyCouponController {


    /*내 쿠폰 등록*/
    @Operation(summary= "쿠폰 저장하기", description = "내 쿠폰 등록", tags = "내 쿠폰")
    @ApiResponses({
            @ApiResponse(responseCode = "200", content = @Content(mediaType = "application/json", schema = @Schema(implementation = ResponseMessage.class))),
    })
    @PostMapping("/v1/{userid}/{couponid}")
    public ResponseEntity registerMyCoupon(@PathVariable("userid") String userid, @PathVariable("couponid") String couponid) {
        return ResponseEntity.ok(new ResponseMessage("쿠폰이 저장되었습니다."));
    }


    /*내 쿠폰 조회*/
    @Operation(summary= "내 쿠폰 조회", description = "내 쿠폰 조회", tags = "내 쿠폰")
    @ApiResponses({
            @ApiResponse(responseCode = "200", content = @Content(mediaType = "application/json", array = @ArraySchema(schema = @Schema(implementation = ResponseMessage.class)))),
    })
    @PostMapping("/v1/{userid}")
    public ResponseEntity getMyCoupon(@PathVariable("userid") String userid) {



        return ResponseEntity.ok(new ResponseMessage("쿠폰이 조회되었습니다."));
    }





}




