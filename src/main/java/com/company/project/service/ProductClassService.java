package com.company.project.service;
import com.company.project.model.Product;
import com.company.project.model.ProductClass;
import com.company.project.core.Service;

import java.util.List;


/**
 * Created by CodeGenerator_@ljzeng on 2020/05/07.
 */
public interface ProductClassService extends Service<ProductClass> {
    List<Product> getProductByClass(int pcid);

}
