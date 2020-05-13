package com.demo.service.impl;

import com.demo.dao.TaskMapper;
import com.demo.dao.TaskUserMapper;
import com.demo.dao.UserMapper;
import com.demo.model.*;
import com.demo.service.TaskService;
import com.demo.util.DateUtil;
import org.apache.ibatis.annotations.ResultType;
import org.apache.poi.ss.formula.functions.T;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

@Service("taskService")
public class TaskServiceImpl implements TaskService {

    @Resource
    private TaskMapper taskMapper;

    @Resource
    private UserMapper userMapper;

    @Resource
    private TaskUserMapper taskUserMapper;

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
        TaskExample example = new TaskExample();
        example.createCriteria().andEnableFlagEqualTo("1");
        return taskMapper.selectByExample(example);
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
        UserExample example = new UserExample();
        example.createCriteria().andEnableFlagEqualTo("1");
        return userMapper.selectByExample(example);
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
        TaskUser taskUser = new TaskUser();
        taskUser.setId(null);
        taskUser.setUserId(userId);
        taskUser.setTaskId(taskId);
        taskUser.setDate(DateUtil.getCurrentDate());
        taskUser.setUrgency(urgency);
        taskUser.setEnableFlag("1");
        return taskUserMapper.insertSelective(taskUser);
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
        return taskUserMapper.listDistribute(date, userName, taskType);
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
        return taskUserMapper.listUserTask(userId, taskType);
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
    public Integer updateTaskStatus(Integer id, String taskStatus) {
        TaskUser taskUser = new TaskUser();
        taskUser.setId(id);
        taskUser.setTaskStatus(taskStatus);
        return taskUserMapper.updateByPrimaryKeySelective(taskUser);
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
    public Integer updateSubmitStatus(Integer id, String submitStatus) {
        TaskUser taskUser = new TaskUser();
        taskUser.setId(id);
        taskUser.setSubmitStatus(submitStatus);
        return taskUserMapper.updateByPrimaryKeySelective(taskUser);
    }
}
