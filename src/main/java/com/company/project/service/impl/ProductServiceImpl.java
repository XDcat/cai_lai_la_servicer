package com.company.project.service.impl;

import com.company.project.dao.ProductMapper;
import com.company.project.model.Product;
import com.company.project.service.ProductService;
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
public class ProductServiceImpl extends AbstractService<Product> implements ProductService {
    @Resource
    private ProductMapper productMapper;


    @Override
    public List<Product> filterProduct(String v, int minPrice, int maxPrice) {
        return productMapper.filterProduct(v, minPrice, maxPrice);
    }
}
