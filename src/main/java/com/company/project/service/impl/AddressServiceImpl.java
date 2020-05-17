package com.company.project.service.impl;

import com.company.project.dao.AddressMapper;
import com.company.project.model.Address;
import com.company.project.service.AddressService;
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
public class AddressServiceImpl extends AbstractService<Address> implements AddressService {
    @Resource
    private AddressMapper addressMapper;

    @Override
    public List<Address> getAddressByUid(Integer uid) {
        return addressMapper.getAddreddByUid(uid);
    }
}
