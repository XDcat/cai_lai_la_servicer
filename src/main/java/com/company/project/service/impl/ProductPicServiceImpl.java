package com.company.project.service.impl;

import com.company.project.dao.ProductPicMapper;
import com.company.project.model.ProductPic;
import com.company.project.service.ProductPicService;
import com.company.project.core.AbstractService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;


/**
 * Created by CodeGenerator_@ljzeng on 2020/05/07.
 */
@Service
@Transactional
public class ProductPicServiceImpl extends AbstractService<ProductPic> implements ProductPicService {
    @Resource
    private ProductPicMapper productPicMapper;

}
