package com.demo.service.impl;

import com.demo.model.Task;
import com.demo.model.User;
import com.demo.service.TaskService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service("taskService")
public class TaskServiceImpl implements TaskService {

    /**
     * @param taskType
     * @return java.util.List<com.demo.model.Task>
     * @author linwei
     * @date 2020/5/13
     * @time 9:11
     * @description 查询系统任务
     */
    @Override
    public List<Task> list(String taskType) {
        return null;
    }

    /**
     * @return java.util.List<com.demo.model.User>
     * @author linwei
     * @date 2020/5/13
     * @time 9:12
     * @description 获取系统所有用户
     */
    @Override
    public List<User> listUser() {
        return null;
    }

    /**
     * @param userId
     * @param taskId
     * @param urgency
     * @return java.lang.Integer
     * @author linwei
     * @date 2020/5/13
     * @time 9:13
     * @description 分配系统任务
     */
    @Override
    public Integer distribute(Integer userId, String taskId, String urgency) {
        return null;
    }

    /**
     * @param date
     * @param userName
     * @param taskType
     * @return java.util.List<java.util.Map < java.lang.String, java.lang.Object>>
     * @author linwei
     * @date 2020/5/13
     * @time 9:14
     * @description 查询已分配的系统任务
     */
    @Override
    public List<Map<String, Object>> listDistribute(String date, String userName, String taskType) {
        return null;
    }

    /**
     * @param userId
     * @param taskType
     * @return java.util.List<java.util.Map < java.lang.String, java.lang.Object>>
     * @author linwei
     * @date 2020/5/13
     * @time 9:24
     * @description 查询用户工作任务
     */
    @Override
    public List<Map<String, Object>> listUserTask(Integer userId, String taskType) {
        return null;
    }

    /**
     * @param id
     * @param taskStatus
     * @return java.lang.Integer
     * @author linwei
     * @date 2020/5/13
     * @time 9:24
     * @description 更新任务状态
     */
    @Override
    public Integer updateTaskStatus(Integer id, Integer taskStatus) {
        return null;
    }

    /**
     * @param id
     * @param submitStatus
     * @return java.lang.Integer
     * @author linwei
     * @date 2020/5/13
     * @time 9:25
     * @description 更新提交状态
     */
    @Override
    public Integer updateSubmitStatus(Integer id, Integer submitStatus) {
        return null;
    }
}
