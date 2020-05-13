package com.demo.common.model;

import java.util.List;
import java.util.Map;

/**
 * 项目名称：framework
 * 类描述：
 * 创建人：QiuYu
 * 创建时间：2017/12/12 15:55
 * 修改人：
 * 修改时间：
 * 修改备注：
 */
public class BaseMessage {
    private Object data;

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    /**
     * @author QiuYu
     * @date 2017/12/12
     * @time 16:03
     * @description 实例化基础消息对象
     * @return base message object
     */
    public static BaseMessage instance(){
        try {
            return BaseMessage.class.newInstance();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
        return new BaseMessage();
    }
}
