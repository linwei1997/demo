package com.demo.model;

public class Equipment {
    private Integer id;

    private Integer userId;

    private String equipmentName;

    private String equipmentStatus;

    private String equipmentAddress;

    private String equipmentCompany;

    private String enableFlag;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getEquipmentName() {
        return equipmentName;
    }

    public void setEquipmentName(String equipmentName) {
        this.equipmentName = equipmentName == null ? null : equipmentName.trim();
    }

    public String getEquipmentStatus() {
        return equipmentStatus;
    }

    public void setEquipmentStatus(String equipmentStatus) {
        this.equipmentStatus = equipmentStatus == null ? null : equipmentStatus.trim();
    }

    public String getEquipmentAddress() {
        return equipmentAddress;
    }

    public void setEquipmentAddress(String equipmentAddress) {
        this.equipmentAddress = equipmentAddress == null ? null : equipmentAddress.trim();
    }

    public String getEquipmentCompany() {
        return equipmentCompany;
    }

    public void setEquipmentCompany(String equipmentCompany) {
        this.equipmentCompany = equipmentCompany == null ? null : equipmentCompany.trim();
    }

    public String getEnableFlag() {
        return enableFlag;
    }

    public void setEnableFlag(String enableFlag) {
        this.enableFlag = enableFlag == null ? null : enableFlag.trim();
    }
}