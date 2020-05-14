package com.demo.controller;

import com.demo.model.LoginUser;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import static com.demo.service.impl.LoginServiceImpl.LOGIN_USER;

/**
 * @author linwei
 * @date 2020/5/14
 * @time 10:25
 * @description  session信息
 * @return
 */
public class BaseController {

    /**
     * 获取Request对象
     * @return Current Request
     */
    protected HttpServletRequest getRequest(){
        return ((ServletRequestAttributes) RequestContextHolder.getRequestAttributes()).getRequest();
    }

    /**
     * 获取Response对象
     * @return Current Response
     */
    protected HttpServletResponse getResponse(){
        return ((ServletRequestAttributes) RequestContextHolder.getRequestAttributes()).getResponse();
    }

    /**
     * 获取Session对象
     * @return Current Session
     */
    protected HttpSession getSession(){
        return this.getRequest().getSession();
    }

    /**
     * 获取登录用户对象
     * @return LoginUser
     */
    protected LoginUser getLoginUser(){
        return (LoginUser)this.getSession().getAttribute(LOGIN_USER);
    }
}