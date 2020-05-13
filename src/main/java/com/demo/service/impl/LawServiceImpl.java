package com.demo.service.impl;

import com.demo.model.Law;
import com.demo.service.LawService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("lawService")
public class LawServiceImpl implements LawService {

    /**
     * @param lawTitle
     * @param lawContent
     * @return java.lang.Integer
     * @author linwei
     * @date 2020/5/13
     * @time 9:26
     * @description 添加法规
     */
    @Override
    public Integer save(String lawTitle, String lawContent) {
        return null;
    }

    /**
     * @return java.util.List<com.demo.model.Law>
     * @author linwei
     * @date 2020/5/13
     * @time 9:27
     * @description 查询法规
     */
    @Override
    public List<Law> list() {
        return null;
    }
}
