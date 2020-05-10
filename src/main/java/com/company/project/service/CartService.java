package com.company.project.service;
import com.company.project.model.Cart;
import com.company.project.core.Service;
import com.company.project.model.Product;

import java.util.List;


/**
 * Created by CodeGenerator_@ljzeng on 2020/05/07.
 */
public interface CartService extends Service<Cart> {
    List<Product> getUserCart(int uid);
    int deleteUserCart(int uid, int pid);

}
