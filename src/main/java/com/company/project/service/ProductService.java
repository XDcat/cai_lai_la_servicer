package com.company.project.service;
import com.company.project.model.Product;
import com.company.project.core.Service;

import java.util.List;


/**
 * Created by CodeGenerator_@ljzeng on 2020/05/07.
 */
public interface ProductService extends Service<Product> {
    List<Product> filterProduct(String v, int minPrice, int maxPrice);

}
