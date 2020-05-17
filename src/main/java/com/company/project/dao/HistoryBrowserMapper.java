package com.company.project.dao;

import com.company.project.core.Mapper;
import com.company.project.model.HistoryBrowser;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface HistoryBrowserMapper extends Mapper<HistoryBrowser> {
    @Select("select history_browser.* from history_browser where uid =#{uid}")
    List<HistoryBrowser> getUserHistoryBrowser(int uid);
}