package com.demo.service;

import com.demo.model.OperateLog;

import java.util.List;

public interface OperateLogService {

    /**
     * @author linwei
     * @date 2020/5/12
     * @time 19:56
     * @description  查询系统操作
     * @return java.util.List<com.demo.model.OperateLog>
     */
    List<OperateLog> list();

    /**
     * @author linwei
     * @date 2020/5/14
     * @time 10:13
     * @description  往操作记录表中插入数据
     * @param operateType
     * @param userId
     * @return void
     */
    void insertOperateLog(String operateType, Integer userId);
}
