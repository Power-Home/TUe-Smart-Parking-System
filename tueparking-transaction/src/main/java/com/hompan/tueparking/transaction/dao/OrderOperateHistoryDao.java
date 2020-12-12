package com.hompan.tueparking.transaction.dao;

import com.hompan.tueparking.transaction.entity.OrderOperateHistoryEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 订单操作历史记录
 * 
 * @author hompan
 * @email 18258829416@163.com
 * @date 2020-07-11 18:38:51
 */
@Mapper
public interface OrderOperateHistoryDao extends BaseMapper<OrderOperateHistoryEntity> {
	
}
