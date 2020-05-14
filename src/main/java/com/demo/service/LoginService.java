package com.demo.service;

import com.demo.model.LoginUser;

/**
 * @author linwei
 * @date 2020/5/14
 * @time 10:28
 * @description  登录实现
 * @return
 */
public interface LoginService {

    /**
     * @author linwei
     * @date 2020/5/12
     * @time 15:20
     * @description  账号密码验证
     * @param userName
     * @param userPassword
     * @return java.lang.Integer
     */
    Integer login(String userName, String userPassword);

    /**
     * @author linwei
     * @date 2020/5/14
     * @time 10:29
     * @description  修改登录日志表中的退出时间
     * @param loginUser
     * @return void
     */
    void logout(LoginUser loginUser);
}
