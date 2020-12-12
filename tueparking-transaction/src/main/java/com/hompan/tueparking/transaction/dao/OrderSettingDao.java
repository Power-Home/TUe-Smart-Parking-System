package com.hompan.tueparking.transaction.dao;

import com.hompan.tueparking.transaction.entity.OrderSettingEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 订单配置信息
 * 
 * @author hompan
 * @email 18258829416@163.com
 * @date 2020-07-11 18:38:51
 */
@Mapper
public interface OrderSettingDao extends BaseMapper<OrderSettingEntity> {
	
}
