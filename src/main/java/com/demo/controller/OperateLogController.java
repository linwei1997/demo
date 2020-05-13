package com.demo.controller;

import com.demo.common.model.BaseMessage;
import com.demo.service.OperateLogService;
import com.fasterxml.jackson.databind.ser.Serializers;
import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/operateLog")
public class OperateLogController extends BaseController {

    private static final Logger logger = LoggerFactory.getLogger(OperateLogController.class);

    @Autowired
    OperateLogService operateLogService;

    /**
     * @author linwei
     * @date 2020/5/12
     * @time 19:35
     * @description  查询系统操作
     * @return java.lang.String
     */
    @GetMapping("/list")
    public BaseMessage list() {
        BaseMessage msg = BaseMessage.instance();
        try {
            // 查询系统操作
            if(null == getLoginUser()){
                logger.info("【系统操作查询模块】，登录信息已失效！");
                msg.setData("登录信息已失效！");
            }
            logger.info("【系统操作查询模块】，查询成功！");
            msg.setData(operateLogService.list());
        } catch (Exception e) {
            logger.info("操作处理抛出异常！",e);
            msg.setData("操作失败！");
        }
        return msg;
    }
}
