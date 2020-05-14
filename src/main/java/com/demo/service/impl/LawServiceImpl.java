package com.demo.service.impl;

import com.demo.dao.LawMapper;
import com.demo.model.Law;
import com.demo.model.LawExample;
import com.demo.service.LawService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author linwei
 * @date 2020/5/14
 * @time 10:28
 * @description  法规实现类
 * @return
 */
@Service("lawService")
public class LawServiceImpl implements LawService {

    @Resource
    private LawMapper lawMapper;

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
        Law law = new Law();
        law.setId(null);
        law.setLawTitle(lawTitle);
        law.setLawContent(lawContent);
        law.setEnableFlag("1");
        return lawMapper.insertSelective(law);
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
        LawExample example = new LawExample();
        example.createCriteria().andEnableFlagEqualTo("1");
        return lawMapper.selectByExample(example);
    }
}
