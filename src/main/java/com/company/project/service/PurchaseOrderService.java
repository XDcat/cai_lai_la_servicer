package com.company.project.service;
import com.company.project.model.PurchaseOrder;
import com.company.project.core.Service;

import java.util.List;


/**
 * Created by CodeGenerator_@ljzeng on 2020/05/07.
 */
public interface PurchaseOrderService extends Service<PurchaseOrder> {
    List<PurchaseOrder> getUserOrder(int uid);
    int deleteOrder(int oid);
}
