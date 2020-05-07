package com.company.project.service.impl;

import com.company.project.dao.DiscountToMapper;
import com.company.project.model.DiscountTo;
import com.company.project.service.DiscountToService;
import com.company.project.core.AbstractService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;


/**
 * Created by CodeGenerator_@ljzeng on 2020/05/07.
 */
@Service
@Transactional
public class DiscountToServiceImpl extends AbstractService<DiscountTo> implements DiscountToService {
    @Resource
    private DiscountToMapper discountToMapper;

}
