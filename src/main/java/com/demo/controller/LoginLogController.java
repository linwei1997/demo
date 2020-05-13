package com.demo.controller;

import com.demo.common.model.BaseMessage;
import com.demo.model.LoginLog;
import com.demo.service.LoginLogService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/loginLog")
public class LoginLogController extends BaseController {

    private static final Logger logger = LoggerFactory.getLogger(LoginLogController.class);
    
    @Autowired
    LoginLogService loginLogService;
    
    /**
     * @author linwei
     * @date 2020/5/12
     * @time 19:26
     * @description  查询登录日志
     * @return java.util.List<com.demo.model.LoginLog>
     */
    @GetMapping("/list")
    public BaseMessage list() {
        BaseMessage msg = BaseMessage.instance();
        try {
            // 查询登录日志
            if(null == getLoginUser()){
                logger.info("【登录日志查询模块】，登录信息已失效！");
                msg.setData("登录信息已失效！");
                return msg;
            }
            logger.info("【登录日志查询模块】，查询成功！");
            msg.setData(loginLogService.list());
        } catch (Exception e) {
            logger.info("操作处理抛出异常！",e);
            msg.setData("操作失败！");
        }
        return msg;
    }
}
