package com.company.project.service;
import com.company.project.model.Address;
import com.company.project.core.Service;

import java.util.List;


/**
 * Created by CodeGenerator_@ljzeng on 2020/05/07.
 */
public interface AddressService extends Service<Address> {
    public List<Address> getAddressByUid(Integer uid);
}
