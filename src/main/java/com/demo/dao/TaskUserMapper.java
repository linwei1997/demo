package com.demo.dao;

import com.demo.model.TaskUser;
import com.demo.model.TaskUserExample;
import java.util.List;
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
}