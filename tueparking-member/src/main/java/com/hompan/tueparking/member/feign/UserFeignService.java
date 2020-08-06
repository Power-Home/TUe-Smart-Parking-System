package com.hompan.tueparking.member.feign;

import com.hompan.common.utils.R;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author Hom Pan
 * @date 2020/7/19 23:43
 */

@FeignClient("renren-fast")
public interface UserFeignService {

    @RequestMapping("/sys/user/list")
    public R getMemberList();
}
