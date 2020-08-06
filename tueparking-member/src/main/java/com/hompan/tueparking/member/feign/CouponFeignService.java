package com.hompan.tueparking.member.feign;

import com.hompan.common.utils.R;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author Hom Pan
 * @date 2020/7/11 21:15
 */

@FeignClient("tueparking-coupon")
public interface CouponFeignService {

    @RequestMapping("coupon/coupon/member/list")
    public R membercoupons();

}
