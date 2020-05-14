package com.demo.service;

import com.demo.model.LoginLog;

import java.util.List;

/**
 * @author linwei
 * @date 2020/5/14
 * @time 10:28
 * @description  登录日志实现
 * @return
 */
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
