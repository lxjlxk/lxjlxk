package com.suse.demo.service;

import com.suse.demo.entity.PaperModule;

import java.util.List;

public interface PaperModuleService {

    List<PaperModule> selectBypaperModul(String moduleSubject);

    int deleteBymoduleId(Integer moduleId);

    int moduleAdd(PaperModule paperModule);

    PaperModule selectModuleBymoduleId(Integer moduleId);

    int moduleUpdate(PaperModule paperModule);

    List<PaperModule> selectBySubject(String paperId);
}
