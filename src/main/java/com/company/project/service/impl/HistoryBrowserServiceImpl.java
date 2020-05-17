package com.company.project.service.impl;

import com.company.project.dao.HistoryBrowserMapper;
import com.company.project.model.HistoryBrowser;
import com.company.project.service.HistoryBrowserService;
import com.company.project.core.AbstractService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;


/**
 * Created by CodeGenerator_@ljzeng on 2020/05/07.
 */
@Service
@Transactional
public class HistoryBrowserServiceImpl extends AbstractService<HistoryBrowser> implements HistoryBrowserService {
    @Resource
    private HistoryBrowserMapper historyBrowserMapper;

    public List<HistoryBrowser> getUserHistoryBrowser(int uid){ return historyBrowserMapper.getUserHistoryBrowser(uid);}
}
