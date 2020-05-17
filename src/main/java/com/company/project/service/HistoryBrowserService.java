package com.company.project.service;
import com.company.project.model.HistoryBrowser;
import com.company.project.core.Service;

import java.util.List;


/**
 * Created by CodeGenerator_@ljzeng on 2020/05/07.
 */
public interface HistoryBrowserService extends Service<HistoryBrowser> {
    List<HistoryBrowser> getUserHistoryBrowser(int uid);
}
