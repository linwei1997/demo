package com.demo.controller;

import com.demo.common.model.BaseMessage;
import com.demo.service.EquipmentService;
import org.apache.ibatis.annotations.Param;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.xml.ws.Action;

@RestController
@RequestMapping("/equipment")
public class EquipmentController extends BaseController {

    private static final Logger logger = LoggerFactory.getLogger(EquipmentController.class);

    @Autowired
    private EquipmentService equipmentService;

    /**
     * @author linwei
     * @date 2020/5/13
     * @time 9:10
     * @description  添加设备
     * @param userId
     * @param equipmentName
     * @param equipmentStatus
     * @param equipmentAddress
     * @param equipmentCompany
     * @return com.demo.common.model.BaseMessage
     */
    @GetMapping("/save")
    public BaseMessage save(@Param("userId") Integer userId,
                            @Param("equipmentName") String equipmentName,
                            @Param("equipmentStatus") String equipmentStatus,
                            @Param("equipmentAddress") String equipmentAddress,
                            @Param("equipmentCompany") String equipmentCompany) {
        BaseMessage msg = BaseMessage.instance();
        try {
            // 添加设备
            if(null == getLoginUser()){
                logger.info("【设备添加模块】，登录信息已失效！");
                msg.setData("登录信息已失效！");
            }
            Integer saveFlag = equipmentService.save(userId, equipmentName, equipmentStatus, equipmentAddress, equipmentCompany);
            if (saveFlag > 0) {
                logger.info("【设备添加模块】，添加成功！");
                msg.setData("添加成功");
            } else {
                logger.info("【设备添加模块】，添加失败！");
                msg.setData("添加失败");
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
     * @time 9:10
     * @description  查询设备
     * @param userName
     * @param equipmentName
     * @return com.demo.common.model.BaseMessage
     */
    @GetMapping("/list")
    public BaseMessage list(@Param("userName") String userName, @Param("equipmentName") String equipmentName) {
        BaseMessage msg = BaseMessage.instance();
        try {
            // 查询设备
            if(null == getLoginUser()){
                logger.info("【设备查询模块】，登录信息已失效！");
                msg.setData("登录信息已失效！");
            }
            logger.info("【设备查询模块】，查询成功！");
            msg.setData(equipmentService.list(userName, equipmentName));
        } catch (Exception e) {
            logger.info("操作处理抛出异常！",e);
            msg.setData("操作失败！");
        }
        return msg;
    }

    /**
     * @author linwei
     * @date 2020/5/13
     * @time 9:10
     * @description  检验设备
     * @param equipmentId
     * @param checkTitle
     * @param checkContent
     * @param checkStatus
     * @return com.demo.common.model.BaseMessage
     */
    @GetMapping("/check")
    public BaseMessage check(@Param("equipmentId") Integer equipmentId,
                             @Param("checkTitle") String checkTitle,
                             @Param("checkContent") String checkContent,
                             @Param("checkStatus") String checkStatus) {
        BaseMessage msg = BaseMessage.instance();
        try {
            //  检验设备
            if(null == getLoginUser()){
                logger.info("【设备检验模块】，登录信息已失效！");
                msg.setData("登录信息已失效！");
            }
            Integer checkFlag = equipmentService.check(equipmentId, checkTitle, checkContent, checkStatus);
            if (checkFlag > 0) {
                logger.info("【设备检验模块】，检验成功！");
                msg.setData("检验成功！");
            } else {
                logger.info("【设备检验模块】，检验失败！");
                msg.setData("检验失败！");
            }
        } catch (Exception e) {
            logger.info("操作处理抛出异常！",e);
            msg.setData("操作失败！");
        }
        return msg;
    }

}
