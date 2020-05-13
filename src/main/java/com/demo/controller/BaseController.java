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
 * 项目名称：framework
 * 类描述：
 * 创建人：QiuYu
 * 创建时间：2017/12/11 14:09
 * 修改人：QiuYu
 * 修改时间：2018-3-27 08:54:01
 * 修改备注：去除内置的BaseMessage对象,单例模式可导致线程安全问题
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