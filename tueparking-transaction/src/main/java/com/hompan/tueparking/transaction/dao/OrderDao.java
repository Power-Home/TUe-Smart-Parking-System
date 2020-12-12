package com.hompan.tueparking.transaction.dao;

import com.hompan.tueparking.transaction.entity.OrderEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 订单
 * 
 * @author hompan
 * @email 18258829416@163.com
 * @date 2020-07-11 18:38:50
 */
@Mapper
public interface OrderDao extends BaseMapper<OrderEntity> {
	
}
