package com.lwhtarena.edu.service.user.dao;

import com.lwhtarena.edu.facade.user.entity.PmsUser;
import com.lwhtarena.edu.service.user.common.core.dao.BaseDao;

/**
 * @描述: 用户表数据访问层接口.
 * @author lwh
 * @folder com.lwhtarena.edu.service.user.dao
 * @date 2016/9/1.
 * @版权 Copyright (c) 2016 lwhtarena.com. All Rights Reserved.
 */
public interface PmsUserDao extends BaseDao<PmsUser> {
    /**
     * 根据用户登录名获取用户信息.
     * @param userNo
     * @return user .
     */
    PmsUser findByUserNo(String userNo);
}