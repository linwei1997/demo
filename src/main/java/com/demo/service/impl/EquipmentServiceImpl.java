package com.demo.service.impl;

import com.demo.service.EquipmentService;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service("equipmentService")
public class EquipmentServiceImpl implements EquipmentService {

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
        return null;
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
        return null;
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
        return null;
    }
}
