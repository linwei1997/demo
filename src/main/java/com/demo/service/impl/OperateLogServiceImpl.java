package com.demo.service.impl;

import com.demo.dao.OperateLogMapper;
import com.demo.model.OperateLog;
import com.demo.model.OperateLogExample;
import com.demo.service.OperateLogService;
import com.demo.util.DateUtil;
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

    /**
     * @param operateType
     * @param userId
     * @return void
     * @author linwei
     * @date 2020/5/14
     * @time 10:13
     * @description  往操作记录表中插入数据
     */
    @Override
    public void insertOperateLog(String operateType, Integer userId) {
        OperateLog operateLog = new OperateLog();
        operateLog.setId(null);
        operateLog.setUserId(userId);
        operateLog.setOperateType(operateType);
        operateLog.setOperateTime(DateUtil.getCurrentDate());
        switch (operateType) {
            case "1":
                operateLog.setOperateName("登录信息查询");
                break;
            case "2":
                operateLog.setOperateName("操作信息查询");
                break;
            case "3":
                operateLog.setOperateName("工作任务查询");
                break;
            case "4":
                operateLog.setOperateName("派工查询");
                break;
            case "5":
                operateLog.setOperateName("设备查询");
                break;
            case "6":
                operateLog.setOperateName("法规查询");
                break;
        }
        operateLogMapper.insertSelective(operateLog);
    }
}
