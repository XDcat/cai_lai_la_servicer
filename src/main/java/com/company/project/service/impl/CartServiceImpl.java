package com.company.project.service.impl;

import com.company.project.dao.CartMapper;
import com.company.project.model.Cart;
import com.company.project.model.Product;
import com.company.project.service.CartService;
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
public class CartServiceImpl extends AbstractService<Cart> implements CartService {
    @Resource
    private CartMapper cartMapper;

    @Override
    public List<Product> getUserCart(int uid) {
        return cartMapper.getUserCart(uid);
    }

    @Override
    public int deleteUserCart(int uid, int pid) {
        return cartMapper.deleteUserSomeCart(uid, pid);
    }
}
