package com.demo.service;

import com.demo.model.Task;
import com.demo.model.User;

import java.util.List;
import java.util.Map;

/**
 * @author linwei
 * @date 2020/5/14
 * @time 10:30
 * @description  任务实现
 * @return
 */
public interface TaskService {

    /**
     * @author linwei
     * @date 2020/5/13
     * @time 9:11
     * @description  查询系统任务
     * @param taskType
     * @return java.util.List<com.demo.model.Task>
     */
    List<Task> list(String taskType);

    /**
     * @author linwei
     * @date 2020/5/13
     * @time 9:12
     * @description  获取系统所有用户
     * @return java.util.List<com.demo.model.User>
     */
    List<User> listUser();

    /**
     * @author linwei
     * @date 2020/5/13
     * @time 9:13
     * @description  分配系统任务
     * @param userId
     * @param taskId
     * @param urgency
     * @return java.lang.Integer
     */
    Integer distribute(Integer userId, String taskId, String urgency);

    /**
     * @author linwei
     * @date 2020/5/13
     * @time 9:14
     * @description  查询已分配的系统任务
     * @param date
     * @param userName
     * @param taskType
     * @return java.util.List<java.util.Map<java.lang.String,java.lang.Object>>
     */
    List<Map<String, Object>> listDistribute(String date, String userName, String taskType);

    /**
     * @author linwei
     * @date 2020/5/13
     * @time 9:24
     * @description  查询用户工作任务
     * @param userId
     * @param taskType
     * @return java.util.List<java.util.Map<java.lang.String,java.lang.Object>>
     */
    List<Map<String, Object>> listUserTask(Integer userId, String taskType);

    /**
     * @author linwei
     * @date 2020/5/13
     * @time 9:24
     * @description  更新任务状态
     * @param id
     * @param taskStatus
     * @return java.lang.Integer
     */
    Integer updateTaskStatus(Integer id, String taskStatus);

    /**
     * @author linwei
     * @date 2020/5/13
     * @time 9:25
     * @description  更新提交状态
     * @param id
     * @param submitStatus
     * @return java.lang.Integer
     */
    Integer updateSubmitStatus(Integer id, String submitStatus);
}
