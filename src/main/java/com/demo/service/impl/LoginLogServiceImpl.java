package com.demo.service.impl;

import com.demo.dao.LoginLogMapper;
import com.demo.model.LoginLog;
import com.demo.model.LoginLogExample;
import com.demo.service.LoginLogService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author linwei
 * @date 2020/5/14
 * @time 10:28
 * @description  登录日志实现类
 * @return
 */
@Service("loginLogService")
public class LoginLogServiceImpl implements LoginLogService {

    @Resource
    private LoginLogMapper loginLogMapper;

    /**
     * @return java.util.List<com.demo.model.LoginLog>
     * @author linwei
     * @date 2020/5/12
     * @time 19:26
     * @description 查询登录日志
     */
    @Override
    public List<LoginLog> list() {
        LoginLogExample example = new LoginLogExample();
        example.createCriteria().andEnableFlagEqualTo("1");
        return loginLogMapper.selectByExample(example);
    }
}
