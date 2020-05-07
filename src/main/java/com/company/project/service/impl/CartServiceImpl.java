package com.company.project.service.impl;

import com.company.project.dao.CartMapper;
import com.company.project.model.Cart;
import com.company.project.service.CartService;
import com.company.project.core.AbstractService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;


/**
 * Created by CodeGenerator_@ljzeng on 2020/05/07.
 */
@Service
@Transactional
public class CartServiceImpl extends AbstractService<Cart> implements CartService {
    @Resource
    private CartMapper cartMapper;

}
