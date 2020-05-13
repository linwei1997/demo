package com.demo.service;

import java.util.List;
import java.util.Map;

public interface EquipmentService {

    /**
     * @author linwei
     * @date 2020/5/13
     * @time 9:25
     * @description  添加设备
     * @param userId
     * @param equipmentName
     * @param equipmentStatus
     * @param equipmentAddress
     * @param equipmentCompany
     * @return java.lang.Integer
     */
    Integer save(Integer userId, String equipmentName, String equipmentStatus, String equipmentAddress, String equipmentCompany);

    /**
     * @author linwei
     * @date 2020/5/13
     * @time 9:26
     * @description  查询设备
     * @param userName
     * @param equipmentName
     * @return java.util.List<java.util.Map<java.lang.String,java.lang.Object>>
     */
    List<Map<String, Object>> list(String userName, String equipmentName);

    /**
     * @author linwei
     * @date 2020/5/13
     * @time 9:26
     * @description  检验设备
     * @param equipmentId
     * @param checkTitle
     * @param checkContent
     * @param checkStatus
     * @return java.lang.Integer
     */
    Integer check(Integer equipmentId, String checkTitle, String checkContent, String checkStatus);
}
