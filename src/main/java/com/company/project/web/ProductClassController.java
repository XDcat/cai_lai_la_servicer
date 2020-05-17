package com.company.project.web;
import com.company.project.core.Result;
import com.company.project.core.ResultGenerator;
import com.company.project.model.Product;
import com.company.project.model.ProductClass;
import com.company.project.service.ProductClassService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

/**
* Created by CodeGenerator_@ljzeng on 2020/05/07.
*/
@RestController
@RequestMapping("/product/class")
public class ProductClassController {
    @Resource
    private ProductClassService productClassService;

    @PostMapping("/add")
    public Result add(ProductClass productClass) {
        productClassService.save(productClass);
        return ResultGenerator.genSuccessResult();
    }

    @PostMapping("/delete")
    public Result delete(@RequestParam Integer id) {
        productClassService.deleteById(id);
        return ResultGenerator.genSuccessResult();
    }

    @PostMapping("/update")
    public Result update(ProductClass productClass) {
        productClassService.update(productClass);
        return ResultGenerator.genSuccessResult();
    }

    @PostMapping("/detail")
    public Result detail(@RequestParam Integer id) {
        ProductClass productClass = productClassService.findById(id);
        return ResultGenerator.genSuccessResult(productClass);
    }

    @PostMapping("/list")
    public Result list(@RequestParam(defaultValue = "0") Integer page, @RequestParam(defaultValue = "0") Integer size) {
        List<ProductClass> list = productClassService.findAll();
        return ResultGenerator.genSuccessResult(list);
    }
    @PostMapping("/product")
    public Result getProductByClass(@RequestParam Integer pcid){
        List<Product> productByClass = productClassService.getProductByClass(pcid);
        return ResultGenerator.genSuccessResult(productByClass);
    }

}
