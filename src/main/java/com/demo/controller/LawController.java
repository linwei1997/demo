package com.demo.controller;

import com.demo.common.model.BaseMessage;
import com.demo.service.LawService;
import org.apache.ibatis.annotations.Param;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/law")
public class LawController extends BaseController {

    private static final Logger logger = LoggerFactory.getLogger(LawController.class);

    @Autowired
    LawService lawService;

    /**
     * @author linwei
     * @date 2020/5/13
     * @time 9:10
     * @description  添加法规
     * @param lawTitle
     * @param lawContent
     * @return com.demo.common.model.BaseMessage
     */
    @GetMapping("/save")
    public BaseMessage save(@Param("lawTitle") String lawTitle, @Param("lawContent") String lawContent) {
        BaseMessage msg = BaseMessage.instance();
        try {
            // 添加法规
            if(null == getLoginUser()){
                logger.info("【法规添加模块】，登录信息已失效！");
                msg.setData("登录信息已失效！");
            }
            Integer saveFlag = lawService.save(lawTitle, lawContent);
            if (saveFlag > 0) {
                logger.info("【法规添加模块】，添加成功！");
                msg.setData("添加成功！");
            } else {
                logger.info("【法规添加模块】，添加失败！");
                msg.setData("添加失败！");
            }
        } catch (Exception e) {
            logger.info("操作处理抛出异常！",e);
            msg.setData("操作失败！");
        }
        return msg;
    }

    /**
     * @author linwei
     * @date 2020/5/13
     * @time 9:11
     * @description  查询法规
     * @return com.demo.common.model.BaseMessage
     */
    @GetMapping("/list")
    public BaseMessage list() {
        BaseMessage msg = BaseMessage.instance();
        try {
            // 查询法规
            if(null == getLoginUser()){
                logger.info("【法规查询模块】，登录信息已失效！");
                msg.setData("登录信息已失效！");
            }
            logger.info("【法规查询模块】，查询成功！");
            msg.setData(lawService.list());
        } catch (Exception e) {
            logger.info("操作处理抛出异常！",e);
            msg.setData("操作失败！");
        }
        return msg;
    }

}
