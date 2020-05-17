package com.company.project.service.impl;

import com.company.project.dao.ProductClassMapper;
import com.company.project.model.Product;
import com.company.project.model.ProductClass;
import com.company.project.service.ProductClassService;
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
public class ProductClassServiceImpl extends AbstractService<ProductClass> implements ProductClassService {
    @Resource
    private ProductClassMapper productClassMapper;

    @Override
    public List<Product> getProductByClass(int pcid) {
        return productClassMapper.getProductByClass(pcid);
    }
}
