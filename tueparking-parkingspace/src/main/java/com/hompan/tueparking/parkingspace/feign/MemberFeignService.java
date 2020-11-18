package com.hompan.tueparking.parkingspace.feign;

import com.hompan.tueparking.parkingspace.entity.User;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

/**
 * @author Hom Pan
 * @date 2020/8/7 16:58
 */

@FeignClient("tueparking-member")
public interface MemberFeignService {

    @GetMapping("/memberList")
    public List<User> getMemberList();

}

