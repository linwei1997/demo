package com.demo.controller;

import com.demo.common.model.BaseMessage;
import com.demo.service.TaskService;
import org.apache.ibatis.annotations.Param;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/task")
public class TaskController extends BaseController{

    private static final Logger logger = LoggerFactory.getLogger(TaskController.class);

    @Autowired
    TaskService taskService;

    /**
     * @author linwei
     * @date 2020/5/13
     * @time 9:07
     * @description  查询系统任务
     * @param taskType 
     * @return com.demo.common.model.BaseMessage
     */
    @GetMapping("/list")
    public BaseMessage list(@Param("taskType") String taskType) {
        BaseMessage msg = BaseMessage.instance();
        try {
            // 查询系统任务
            if(null == getLoginUser()){
                logger.info("【系统任务查询模块】，登录信息已失效！");
                msg.setData("登录信息已失效！");
            }
            logger.info("【系统任务查询模块】，查询成功！");
            msg.setData(taskService.list(taskType));
        } catch (Exception e) {
            logger.info("操作处理抛出异常！",e);
            msg.setData("操作失败！");
        }
        return msg;
    }

    /**
     * @author linwei
     * @date 2020/5/13
     * @time 9:09
     * @description  获取系统所有用户
     * @return com.demo.common.model.BaseMessage
     */
    @GetMapping("/user/list")
    public BaseMessage listUser() {
        BaseMessage msg = BaseMessage.instance();
        try {
            // 获取系统所有用户
            if(null == getLoginUser()){
                logger.info("【系统所有用户获取模块】，登录信息已失效！");
                msg.setData("登录信息已失效！");
            }
            logger.info("【系统所有用户获取模块】，查询成功！");
            msg.setData(taskService.listUser());
        } catch (Exception e) {
            logger.info("操作处理抛出异常！",e);
            msg.setData("操作失败！");
        }
        return msg;
    }

    /**
     * @author linwei
     * @date 2020/5/13
     * @time 9:09
     * @description  分配系统任务
     * @param userId 
     * @param taskId 
     * @param urgency
     * @return com.demo.common.model.BaseMessage
     */
    @GetMapping("/distribute")
    public BaseMessage distribute(@Param("userId") Integer userId, @Param("taskId") String taskId, @Param("urgency") String urgency) {
        BaseMessage msg = BaseMessage.instance();
        try {
            // 分配系统任务
            if(null == getLoginUser()){
                logger.info("【系统任务分配模块】，登录信息已失效！");
                msg.setData("登录信息已失效！");
            }
            Integer distributeFlag = taskService.distribute(userId, taskId, urgency);
            if (distributeFlag > 0) {
                logger.info("【系统任务分配模块】，分配成功！");
                msg.setData("分配成功！");
            } else {
                logger.info("【系统任务分配模块】，分配失败！");
                msg.setData("分配失败！");
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
     * @time 9:09
     * @description  查询已分配的系统任务
     * @param date
     * @param userName
     * @param taskType
     * @return com.demo.common.model.BaseMessage
     */
    @GetMapping("/distribute/list")
    public BaseMessage listDistribute(@Param("date") String date, @Param("userName") String userName, @Param("taskType") String taskType) {
        BaseMessage msg = BaseMessage.instance();
        try {
            // 查询已分配的系统任务
            if(null == getLoginUser()){
                logger.info("【已分配的系统任务查询模块】，登录信息已失效！");
                msg.setData("登录信息已失效！");
            }
            logger.info("【已分配的系统任务查询模块】，查询成功！");
            msg.setData(taskService.listDistribute(date, userName, taskType));
        } catch (Exception e) {
            logger.info("操作处理抛出异常！",e);
            msg.setData("操作失败！");
        }
        return msg;
    }

    /**
     * @author linwei
     * @date 2020/5/13
     * @time 9:09
     * @description  查询用户工作任务
     * @param taskType
     * @return com.demo.common.model.BaseMessage
     */
    @GetMapping("/userTask/list")
    public BaseMessage listUserTask(@Param("taskType") String taskType) {
        BaseMessage msg = BaseMessage.instance();
        try {
            // 查询用户工作任务
            if(null == getLoginUser()){
                logger.info("【用户工作任务查询模块】，登录信息已失效！");
                msg.setData("登录信息已失效！");
            }
            logger.info("【用户工作任务查询模块】，查询成功！");
            msg.setData(taskService.listUserTask(getLoginUser().getUserId(), taskType));
        } catch (Exception e) {
            logger.info("操作处理抛出异常！",e);
            msg.setData("操作失败！");
        }
        return msg;
    }

    /**
     * @author linwei
     * @date 2020/5/13
     * @time 9:09
     * @description  更新任务状态
     * @param id
     * @param taskStatus
     * @return com.demo.common.model.BaseMessage
     */
    @GetMapping("/taskStatus/update")
    public BaseMessage updateTaskStatus(@Param("id") Integer id, @Param("taskStatus") String taskStatus) {
        BaseMessage msg = BaseMessage.instance();
        try {
            // 更新任务状态
            if(null == getLoginUser()){
                logger.info("【任务状态更新模块】，登录信息已失效！");
                msg.setData("登录信息已失效！");
            }
            Integer updateFlag = taskService.updateTaskStatus(id, taskStatus);
            if (updateFlag > 0) {
                logger.info("【任务状态更新模块】，更新成功！");
                msg.setData("更新成功！");
            } else {
                logger.info("【任务状态更新模块】，更新失败！");
                msg.setData("更新失败！");
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
     * @time 9:09
     * @description  更新提交状态
     * @param id
     * @param submitStatus
     * @return com.demo.common.model.BaseMessage
     */
    @GetMapping("/submitStatus/update")
    public BaseMessage updateSubmitStatus(@Param("id") Integer id, @Param("submitStatus") String submitStatus) {
        BaseMessage msg = BaseMessage.instance();
        try {
            // 更新提交状态
            if(null == getLoginUser()){
                logger.info("【提交状态更新模块】，登录信息已失效！");
                msg.setData("登录信息已失效！");
            }
            Integer updateFlag = taskService.updateSubmitStatus(id, submitStatus);
            if (updateFlag > 0) {
                logger.info("【提交状态更新模块】，更新成功！");
                msg.setData("更新成功！");
            } else {
                logger.info("【提交状态更新模块】，更新失败！");
                msg.setData("更新失败！");
            }
        } catch (Exception e) {
            logger.info("操作处理抛出异常！",e);
            msg.setData("操作失败！");
        }
        return msg;
    }
}
