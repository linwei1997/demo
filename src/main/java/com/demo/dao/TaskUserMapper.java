package com.demo.dao;

import com.demo.model.TaskUser;
import com.demo.model.TaskUserExample;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

public interface TaskUserMapper {
    long countByExample(TaskUserExample example);

    int deleteByExample(TaskUserExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(TaskUser record);

    int insertSelective(TaskUser record);

    List<TaskUser> selectByExample(TaskUserExample example);

    TaskUser selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") TaskUser record, @Param("example") TaskUserExample example);

    int updateByExample(@Param("record") TaskUser record, @Param("example") TaskUserExample example);

    int updateByPrimaryKeySelective(TaskUser record);

    int updateByPrimaryKey(TaskUser record);

    /**
     * @author linwei
     * @date 2020/5/13
     * @time 15:10
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
     * @time 18:03
     * @description  查询用户工作任务
     * @param userId
     * @param taskType
     * @return java.util.List<java.util.Map<java.lang.String,java.lang.Object>>
     */
    List<Map<String, Object>> listUserTask(Integer userId, String taskType);
}