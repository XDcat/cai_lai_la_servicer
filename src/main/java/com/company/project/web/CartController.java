package com.company.project.web;
import com.company.project.core.Result;
import com.company.project.core.ResultGenerator;
import com.company.project.model.Cart;
import com.company.project.model.Product;
import com.company.project.service.CartService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

/**
* Created by CodeGenerator_@ljzeng on 2020/05/07.
*/
@RestController
@RequestMapping("/cart")
public class CartController {
    @Resource
    private CartService cartService;

    @PostMapping("/add")
    public Result add(@RequestBody Cart cart) {
        cartService.save(cart);
        return ResultGenerator.genSuccessResult(cart);
    }

    @PostMapping("/delete")
    public Result delete(@RequestParam Integer id) {
        cartService.deleteById(id);
        return ResultGenerator.genSuccessResult();
    }

    @PostMapping("/update")
    public Result update(Cart cart) {
        cartService.update(cart);
        return ResultGenerator.genSuccessResult();
    }

    @PostMapping("/detail")
    public Result detail(@RequestParam Integer id) {
        Cart cart = cartService.findById(id);
        return ResultGenerator.genSuccessResult(cart);
    }

    @PostMapping("/list")
    public Result list(@RequestParam Integer uid) {
        List<Product> userCart = cartService.getUserCart(uid);
        return ResultGenerator.genSuccessResult(userCart);
    }

    @PostMapping("/deleteCart")
    public Result deleteUserSomeCart(@RequestParam("uid") int uid, @RequestParam("pid") int pid){
        int res = cartService.deleteUserCart(uid, pid);
        return ResultGenerator.genSuccessResult(res);
    }
}
