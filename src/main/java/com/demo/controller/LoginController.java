package com.demo.controller;

import com.demo.common.model.BaseMessage;
import com.demo.model.LoginUser;
import com.demo.service.LoginService;
import org.apache.ibatis.annotations.Param;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import static com.demo.service.impl.LoginServiceImpl.LOGIN_USER;

@RestController
@RequestMapping("/login")
public class LoginController extends BaseController {

    private static final Logger logger = LoggerFactory.getLogger(LoginController.class);

    @Autowired
    LoginService loginService;

    /**
     * @author linwei
     * @date 2020/5/12
     * @time 15:18
     * @description  账号密码验证
     * @param userName
     * @param userPassword
     * @return com.demo.common.model.BaseMessage
     */
    @GetMapping("/login")
    public BaseMessage onLogin(@Param("userName") String userName, @Param("userPassword") String userPassword) {
        BaseMessage msg = BaseMessage.instance();
        try {
            // 账号密码验证
            Integer loginStatus = loginService.login(userName, userPassword);
            switch (loginStatus) {
                case 1:
                    logger.info("【账号密码验证模块】，该用户不存在！");
                    msg.setData("该用户不存在！");
                    break;
                case 2:
                    logger.info("【账号密码验证模块】，密码错误！");
                    msg.setData("密码错误！");
                    break;
                case 3:
                    logger.info("【账号密码验证模块】，登录成功！");
                    msg.setData("登录成功！");
                    break;
            }
        } catch (Exception e) {
            logger.info("操作处理抛出异常！",e);
            msg.setData("操作失败！");
        }
        return  msg;
    }

    /**
     * @author linwei
     * @date 2020/5/12
     * @time 19:09
     * @description  注销
     * @return java.lang.String
     */
    @GetMapping("/logout")
    public BaseMessage logout() {
        BaseMessage msg = BaseMessage.instance();
        try{
            // 注销
            LoginUser loginUser = getLoginUser();
            // 修改登录日志表中的退出时间
            loginService.logout(loginUser);
            // 清除session
            if(loginUser!=null){
                getSession().removeAttribute(LOGIN_USER);
                getSession().invalidate();
            }
            logger.info("用户:" + loginUser.getUserName()+"已注销");
            msg.setData("注销成功！");
        }catch (Exception e){
            logger.info("操作处理抛出异常！",e);
            msg.setData("操作失败！");
        }
        return  msg;
    }
}
