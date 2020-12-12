package com.hompan.tueparking.transaction.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.hompan.common.utils.PageUtils;
import com.hompan.tueparking.transaction.entity.RefundInfoEntity;

import java.util.Map;

/**
 * 退款信息
 *
 * @author hompan
 * @email 18258829416@163.com
 * @date 2020-07-11 18:38:51
 */
public interface RefundInfoService extends IService<RefundInfoEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

