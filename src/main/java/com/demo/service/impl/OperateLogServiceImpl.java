package com.demo.service.impl;

import com.demo.dao.OperateLogMapper;
import com.demo.model.OperateLog;
import com.demo.model.OperateLogExample;
import com.demo.service.OperateLogService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service("operateLogService")
public class OperateLogServiceImpl implements OperateLogService {

    @Resource
    private OperateLogMapper operateLogMapper;

    /**
     * @return java.util.List<com.demo.model.OperateLog>
     * @author linwei
     * @date 2020/5/12
     * @time 19:56
     * @description 查询系统操作
     */
    @Override
    public List<OperateLog> list() {
        OperateLogExample example = new OperateLogExample();
        example.createCriteria().andEnableFlagEqualTo("1");
        return operateLogMapper.selectByExample(example);
    }
}
