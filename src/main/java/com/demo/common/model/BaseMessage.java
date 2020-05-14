package com.demo.common.model;

import java.util.List;
import java.util.Map;

/**
 * @author linwei
 * @date 2020/5/14
 * @time 10:24
 * @description  返回参数
 * @return
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
