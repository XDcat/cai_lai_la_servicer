package com.company.project.service.impl;

import com.company.project.dao.DiscountMapper;
import com.company.project.model.Discount;
import com.company.project.service.DiscountService;
import com.company.project.core.AbstractService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;


/**
 * Created by CodeGenerator_@ljzeng on 2020/05/07.
 */
@Service
@Transactional
public class DiscountServiceImpl extends AbstractService<Discount> implements DiscountService {
    @Resource
    private DiscountMapper discountMapper;

}
