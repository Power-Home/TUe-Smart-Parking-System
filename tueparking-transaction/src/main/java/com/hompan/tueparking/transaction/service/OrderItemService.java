package com.hompan.tueparking.transaction.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.hompan.common.utils.PageUtils;
import com.hompan.tueparking.transaction.entity.OrderItemEntity;

import java.util.Map;

/**
 * 订单项信息
 *
 * @author hompan
 * @email 18258829416@163.com
 * @date 2020-07-11 18:38:51
 */
public interface OrderItemService extends IService<OrderItemEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

