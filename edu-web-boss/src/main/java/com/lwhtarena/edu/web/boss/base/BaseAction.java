package com.lwhtarena.edu.web.boss.base;

import com.lwhtarena.edu.constants.SessionConstant;
import com.lwhtarena.edu.facade.user.entity.PmsUser;
import com.lwhtarena.edu.struts.Struts2ActionSupport;

/**
 * @描述: Web系统权限模块基础支撑Action.
 * @author lwh
 * @folder com.lwhtarena.edu.web.boss.base
 * @date 2016/9/2.
 * @版权 Copyright (c) 2016 lwhtarena.com. All Rights Reserved.
 */
@SuppressWarnings("serial")
public class BaseAction  extends Struts2ActionSupport implements UserLoginedAware{

    /**
     * 取出当前登录用户对象
     */
    public PmsUser getLoginedUser() {
        PmsUser user = (PmsUser) this.getSessionMap().get(SessionConstant.USER_SESSION_KEY);
        return user;
    }
}
