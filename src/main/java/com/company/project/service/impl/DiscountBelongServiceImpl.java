package com.company.project.service.impl;

import com.company.project.dao.DiscountBelongMapper;
import com.company.project.model.DiscountBelong;
import com.company.project.service.DiscountBelongService;
import com.company.project.core.AbstractService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;


/**
 * Created by CodeGenerator_@ljzeng on 2020/05/07.
 */
@Service
@Transactional
public class DiscountBelongServiceImpl extends AbstractService<DiscountBelong> implements DiscountBelongService {
    @Resource
    private DiscountBelongMapper discountBelongMapper;

}
