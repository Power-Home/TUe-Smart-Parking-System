package com.hompan.tueparking.ware.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.hompan.common.utils.PageUtils;
import com.hompan.tueparking.ware.entity.PurchaseDetailEntity;

import java.util.Map;

/**
 * 
 *
 * @author hompan
 * @email 18258829416@163.com
 * @date 2020-07-11 18:56:15
 */
public interface PurchaseDetailService extends IService<PurchaseDetailEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

