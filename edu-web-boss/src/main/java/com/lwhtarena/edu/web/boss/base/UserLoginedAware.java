package com.lwhtarena.edu.web.boss.base;

import com.lwhtarena.edu.facade.user.entity.PmsUser;

/**
 * @author lwh
 * @folder com.lwhtarena.edu.web.boss.base
 * @date 2016/9/2.
 * @版权 Copyright (c) 2016 lwhtarena.com. All Rights Reserved.
 */
public interface UserLoginedAware {

    /**
     * 取得登录的用户
     * @return
     */
    public PmsUser getLoginedUser();
}