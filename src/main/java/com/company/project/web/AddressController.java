package com.company.project.web;
import com.company.project.core.Result;
import com.company.project.core.ResultGenerator;
import com.company.project.model.Address;
import com.company.project.service.AddressService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

/**
* Created by CodeGenerator_@ljzeng on 2020/05/07.
*/
@RestController
@RequestMapping("/address")
public class AddressController {
    @Resource
    private AddressService addressService;

    @PostMapping("/add")
    public Result add(@RequestBody Address address) {
        addressService.save(address);
        return ResultGenerator.genSuccessResult(address);
    }

    @PostMapping("/delete")
    public Result delete(@RequestParam Integer id) {
        addressService.deleteById(id);
        return ResultGenerator.genSuccessResult();
    }

    @PostMapping("/update")
    public Result update(@RequestBody Address address) {
        addressService.update(address);
        return ResultGenerator.genSuccessResult(address);
    }

    @PostMapping("/detail")
    public Result detail(@RequestParam Integer id) {
        Address address = addressService.findById(id);
        return ResultGenerator.genSuccessResult(address);
    }

    @PostMapping("/list")
    public Result list(@RequestParam Integer uid) {
        List<Address> addressByUid = addressService.getAddressByUid(uid);
        return ResultGenerator.genSuccessResult(addressByUid);
    }
}
