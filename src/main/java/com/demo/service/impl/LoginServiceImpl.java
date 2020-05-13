package com.demo.service.impl;

import com.demo.dao.LoginLogMapper;
import com.demo.dao.UserMapper;
import com.demo.model.*;
import com.demo.service.LoginService;
import com.demo.util.DateUtil;
import org.springframework.stereotype.Service;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.util.List;

@Service("loginService")
public class LoginServiceImpl implements LoginService {

    public static final String LOGIN_USER = "_login_user";

    @Resource
    private UserMapper userMapper;

    @Resource
    private LoginLogMapper loginLogMapper;


    /**
     * @param userName
     * @param userPassword
     * @return java.lang.Integer
     * @author linwei
     * @date 2020/5/12
     * @time 15:20
     * @description 账号密码验证
     */
    @Override
    public Integer login(String userName, String userPassword) {
        // 判断用户是否存在
        UserExample example1 = new UserExample();
        example1.createCriteria().andUserNameEqualTo(userName).andEnableFlagEqualTo("1");
        List<User> list1 = userMapper.selectByExample(example1);
        // 往登录日志表插入记录
        LoginLog loginLog = new LoginLog();
        loginLog.setId(null);
        loginLog.setUserName(userName);
        loginLog.setLoginTime(DateUtil.getCurrentDate());
        loginLog.setEnableFlag("1");
        if (list1.size() <= 0) {
            loginLog.setStatus("0");
            loginLogMapper.insertSelective(loginLog);
            return 1;
        }
        // 判断密码是否正确
        UserExample example2 = new UserExample();
        example2.createCriteria().andUserNameEqualTo(userName).andUserPasswordEqualTo(userPassword).andEnableFlagEqualTo("1");
        List<User> list2 = userMapper.selectByExample(example2);
        if (list2.size() <= 0) {
            loginLog.setStatus("0");
            loginLogMapper.insertSelective(loginLog);
            return 2;
        }
        // 登录成功
        LoginUser loginUser = new LoginUser();
        loginUser.setUserId(list2.get(0).getUserId());
        loginUser.setUserName(list2.get(0).getUserName());
        loginUser.setUserPassword(list2.get(0).getUserPassword());
        HttpServletRequest request = ((ServletRequestAttributes) RequestContextHolder.getRequestAttributes()).getRequest();
        request.getSession().setAttribute(LOGIN_USER, loginUser);
        loginLog.setStatus("1");
        loginLogMapper.insertSelective(loginLog);
        return 3;
    }

    @Override
    public void logout(LoginUser loginUser) {
        // 修改登录日志表中的退出时间
        LoginLogExample example = new LoginLogExample();
        example.createCriteria()
                .andUserNameEqualTo(loginUser.getUserName())
                .andStatusEqualTo("1")
                .andEnableFlagEqualTo("1");
        example.setOrderByClause("id desc");
        List<LoginLog> loginLogs = loginLogMapper.selectByExample(example);
        if (loginLogs.size() > 0) {
            loginLogs.get(0).setLogoutTime(DateUtil.getCurrentDate());
            loginLogMapper.updateByPrimaryKeySelective(loginLogs.get(0));
        }
    }
}
