package com.demo.service;

import com.demo.model.Law;

import java.util.List;

/**
 * @author linwei
 * @date 2020/5/14
 * @time 10:27
 * @description  法规实现
 * @return
 */
public interface LawService {

    /**
     * @author linwei
     * @date 2020/5/13
     * @time 9:26
     * @description  添加法规
     * @param lawTitle
     * @param lawContent
     * @return java.lang.Integer
     */
    Integer save(String lawTitle, String lawContent);

    /**
     * @author linwei
     * @date 2020/5/13
     * @time 9:27
     * @description  查询法规
     * @return java.util.List<com.demo.model.Law>
     */
    List<Law> list();
}
