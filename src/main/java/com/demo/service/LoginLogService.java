package com.demo.service;

import com.demo.model.LoginLog;

import java.util.List;

public interface LoginLogService {

    /**
     * @author linwei
     * @date 2020/5/12
     * @time 19:26
     * @description  查询登录日志
     * @return java.util.List<com.demo.model.LoginLog>
     */
    List<LoginLog> list();
}
