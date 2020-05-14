package com.demo.service.impl;

import com.demo.dao.CheckMapper;
import com.demo.dao.EquipmentMapper;
import com.demo.model.Check;
import com.demo.model.CheckExample;
import com.demo.model.Equipment;
import com.demo.service.EquipmentService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

/**
 * @author linwei
 * @date 2020/5/14
 * @time 10:27
 * @description  设备实现类
 * @return
 */
@Service("equipmentService")
public class EquipmentServiceImpl implements EquipmentService {

    @Resource
    private EquipmentMapper equipmentMapper;

    @Resource
    private CheckMapper checkMapper;

    /**
     * @param userId
     * @param equipmentName
     * @param equipmentStatus
     * @param equipmentAddress
     * @param equipmentCompany
     * @return java.lang.Integer
     * @author linwei
     * @date 2020/5/13
     * @time 9:25
     * @description 添加设备
     */
    @Override
    public Integer save(Integer userId, String equipmentName, String equipmentStatus, String equipmentAddress, String equipmentCompany) {
        Equipment equipment = new Equipment();
        equipment.setId(null);
        equipment.setUserId(userId);
        equipment.setEquipmentName(equipmentName);
        equipment.setEquipmentStatus(equipmentStatus);
        equipment.setEquipmentAddress(equipmentAddress);
        equipment.setEquipmentCompany(equipmentCompany);
        return equipmentMapper.insertSelective(equipment);
    }

    /**
     * @param userName
     * @param equipmentName
     * @return java.util.List<java.util.Map < java.lang.String, java.lang.Object>>
     * @author linwei
     * @date 2020/5/13
     * @time 9:26
     * @description 查询设备
     */
    @Override
    public List<Map<String, Object>> list(String userName, String equipmentName) {
        return equipmentMapper.list(userName, equipmentName);
    }

    /**
     * @param equipmentId
     * @param checkTitle
     * @param checkContent
     * @param checkStatus
     * @return java.lang.Integer
     * @author linwei
     * @date 2020/5/13
     * @time 9:26
     * @description 检验设备
     */
    @Override
    public Integer check(Integer equipmentId, String checkTitle, String checkContent, String checkStatus) {
        Check check = new Check();
        check.setId(null);
        check.setEquipmentId(equipmentId);
        check.setCheckTitle(checkTitle);
        check.setCheckContent(checkContent);
        check.setCheckStatus(checkStatus);
        check.setEnableFlag("1");
        // 获取检验次序
        CheckExample example = new CheckExample();
        example.createCriteria().andEquipmentIdEqualTo(equipmentId).andEnableFlagEqualTo("1");
        example.setOrderByClause("id desc");
        List<Check> checks = checkMapper.selectByExample(example);
        if (checks.size() > 0) {
            check.setCheckOrder(String.valueOf(checks.size() + 1));
        } else {
            check.setCheckOrder("1");
        }
        return checkMapper.insertSelective(check);
    }
}
