package com.hompan.tueparking.transaction.dao;

import com.hompan.tueparking.transaction.entity.PaymentInfoEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 支付信息表
 * 
 * @author hompan
 * @email 18258829416@163.com
 * @date 2020-07-11 18:38:51
 */
@Mapper
public interface PaymentInfoDao extends BaseMapper<PaymentInfoEntity> {
	
}
