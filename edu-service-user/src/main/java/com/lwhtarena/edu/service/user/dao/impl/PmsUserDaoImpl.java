package com.lwhtarena.edu.service.user.dao.impl;

import com.lwhtarena.edu.facade.user.entity.PmsUser;
import com.lwhtarena.edu.service.user.common.core.dao.BaseDaoImpl;
import com.lwhtarena.edu.service.user.dao.PmsUserDao;
import org.springframework.stereotype.Repository;

/**
 * @描述: 用户表数据访问层接口实现类.
 * @author lwh
 * @folder com.lwhtarena.edu.service.user.dao.impl
 * @date 2016/9/1.
 * @版权 Copyright (c) 2016 lwhtarena.com. All Rights Reserved.
 */
@Repository("pmsUserDao")
public class PmsUserDaoImpl extends BaseDaoImpl<PmsUser> implements PmsUserDao {
    /**
     * 根据用户登录名获取用户信息.
     * @param userNo
     * @return user .
     */
    public PmsUser findByUserNo(String userNo) {
        return super.getSqlSession().selectOne(getStatement("findByUserNo"), userNo);
    }
}
