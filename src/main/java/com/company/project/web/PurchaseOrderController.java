package com.company.project.web;
import com.company.project.core.Result;
import com.company.project.core.ResultGenerator;
import com.company.project.model.PurchaseOrder;
import com.company.project.service.PurchaseOrderService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

/**
* Created by CodeGenerator_@ljzeng on 2020/05/07.
*/
@RestController
@RequestMapping("/purchase/order")
public class PurchaseOrderController {
    @Resource
    private PurchaseOrderService purchaseOrderService;

    @PostMapping("/add")
    public Result add(@RequestBody PurchaseOrder purchaseOrder) {
        purchaseOrderService.save(purchaseOrder);
        return ResultGenerator.genSuccessResult(purchaseOrder);
    }

    @PostMapping("/delete")
    public Result delete(@RequestParam Integer id) {
        purchaseOrderService.deleteById(id);
        return ResultGenerator.genSuccessResult();
    }

    @PostMapping("/update")
    public Result update(PurchaseOrder purchaseOrder) {
        purchaseOrderService.update(purchaseOrder);
        return ResultGenerator.genSuccessResult();
    }

    @PostMapping("/detail")
    public Result detail(@RequestParam Integer oid) {
        PurchaseOrder purchaseOrder = purchaseOrderService.findById(oid);
        return ResultGenerator.genSuccessResult(purchaseOrder);
    }

    @PostMapping("/list")
    public Result list(@RequestParam Integer uid) {
        List<PurchaseOrder> UserOrder = purchaseOrderService.getUserOrder(uid);
        return ResultGenerator.genSuccessResult(UserOrder);
    }

    @PostMapping("/deleteOrder")
    public Result deleteOrder(@RequestParam Integer oid){
        int res = purchaseOrderService.deleteOrder(oid);
        return ResultGenerator.genSuccessResult(res);
    }
}
