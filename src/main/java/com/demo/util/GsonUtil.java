package com.demo.util;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import org.apache.commons.lang3.StringUtils;

import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author linyong
 * @date 2019/5/6
 * @time 18:31
 * @description json工具类
 */
public class GsonUtil {
    private static Gson gson = null;

    static {
        if (gson == null) {
            gson = new Gson();
        }
    }

    private GsonUtil() {
    }

    /**
     * 转成map的
     *
     * @param json
     * @return
     * @descripton 解决int数据类型变成double类型的现象
     */
    public static Map<String, String> toMap(String json) {
        Map map = new HashMap();
        if (StringUtils.isNotBlank(json)) {
            map = gson.fromJson(json, new TypeToken<Map<String, String>>() {
            }.getType());
        }
        return map;
    }

    /**
     * @param gsonString
     * @return void
     * @author Damon
     * @date 2019/6/29 10:16
     * @description 将前端通过URLENCODE加密的json转化为list
     */
    public static <T> List<Map<String, T>> gsonDecodeToListMaps(String gsonString) throws UnsupportedEncodingException {
        List<Map<String, T>> list = null;
        java.lang.reflect.Type type = new TypeToken<List<Map<String,String>>>() {}.getType();
        if (gson != null) {
            list = gson.fromJson(URLDecoder.decode(gsonString, "utf-8"), type);
        }
        return list;
    }

    /**
     * 将object对象转成json字符串
     *
     * @param object
     * @return
     */
    public static String gsonString(Object object) {
        String gsonString = null;
        if (gson != null) {
            gsonString = gson.toJson(object);
        }
        return gsonString;
    }

}
