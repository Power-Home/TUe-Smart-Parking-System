package com.hompan.tueparking.transaction.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.hompan.common.utils.PageUtils;
import com.hompan.tueparking.transaction.entity.OrderEntity;

import java.util.Map;

/**
 * 订单
 *
 * @author hompan
 * @email 18258829416@163.com
 * @date 2020-07-11 18:38:50
 */
public interface OrderService extends IService<OrderEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

