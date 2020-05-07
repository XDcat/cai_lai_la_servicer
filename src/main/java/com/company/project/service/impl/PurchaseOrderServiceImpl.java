package com.company.project.service.impl;

import com.company.project.dao.PurchaseOrderMapper;
import com.company.project.model.PurchaseOrder;
import com.company.project.service.PurchaseOrderService;
import com.company.project.core.AbstractService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;


/**
 * Created by CodeGenerator_@ljzeng on 2020/05/07.
 */
@Service
@Transactional
public class PurchaseOrderServiceImpl extends AbstractService<PurchaseOrder> implements PurchaseOrderService {
    @Resource
    private PurchaseOrderMapper purchaseOrderMapper;

}
