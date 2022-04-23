package com.suse.demo.service;

import com.suse.demo.entity.PaperModule;
import com.suse.demo.entity.PaperModuleExample;
import com.suse.demo.mapper.PaperModuleMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PaperModuleServiceImpl implements PaperModuleService {
    @Autowired
    PaperModuleMapper paperModuleMapper;

    @Override
    public List<PaperModule> selectBypaperModul(String moduleSubject) {
        PaperModuleExample example=new PaperModuleExample();
        example.createCriteria().andModuleSubjectEqualTo(moduleSubject);
        List<PaperModule> paperModules=paperModuleMapper.selectByExample(example);
        return paperModules;
    }

    @Override
    public int deleteBymoduleId(Integer moduleId) {
        return paperModuleMapper.deleteByPrimaryKey(moduleId);
    }

    @Override
    public int moduleAdd(PaperModule paperModule) {
        return paperModuleMapper.insert(paperModule);
    }

    @Override
    public PaperModule selectModuleBymoduleId(Integer moduleId) {
        return paperModuleMapper.selectByPrimaryKey(moduleId);
    }

    @Override
    public int moduleUpdate(PaperModule paperModule) {
        return paperModuleMapper.updateByPrimaryKey(paperModule);
    }

    @Override
    public List<PaperModule> selectBySubject(String paperId) {
        PaperModuleExample example=new PaperModuleExample();
        example.createCriteria().andModuleSubjectEqualTo(paperId);
        List<PaperModule> paperModuleList=paperModuleMapper.selectByExample(example);
        return paperModuleList;
    }
}
