package com.company.project.web;
import com.company.project.core.Result;
import com.company.project.core.ResultGenerator;
import com.company.project.model.HistoryBrowser;
import com.company.project.service.HistoryBrowserService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import javafx.application.HostServices;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

/**
* Created by CodeGenerator_@ljzeng on 2020/05/07.
*/
@RestController
@RequestMapping("/history/browser")
public class HistoryBrowserController {
    @Resource
    private HistoryBrowserService historyBrowserService;

    @PostMapping("/add")
    public Result add(@RequestBody HistoryBrowser historyBrowser) {
        historyBrowserService.save(historyBrowser);
        return ResultGenerator.genSuccessResult(historyBrowser);
    }

    @PostMapping("/delete")
    public Result delete(@RequestParam Integer id) {
        historyBrowserService.deleteById(id);
        return ResultGenerator.genSuccessResult();
    }

    @PostMapping("/update")
    public Result update(HistoryBrowser historyBrowser) {
        historyBrowserService.update(historyBrowser);
        return ResultGenerator.genSuccessResult();
    }

    @PostMapping("/detail")
    public Result detail(@RequestParam Integer id) {
        HistoryBrowser historyBrowser = historyBrowserService.findById(id);
        return ResultGenerator.genSuccessResult(historyBrowser);
    }

    @PostMapping("/list")
    public Result list(@RequestParam Integer uid) {
        List<HistoryBrowser> HistoryBrowser = historyBrowserService.getUserHistoryBrowser(uid);
        return ResultGenerator.genSuccessResult(HistoryBrowser);
    }
}
