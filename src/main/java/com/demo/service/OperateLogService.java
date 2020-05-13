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
}
