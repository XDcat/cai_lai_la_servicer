package com.company.project.service.impl;

import com.company.project.dao.GenderMapper;
import com.company.project.model.Gender;
import com.company.project.service.GenderService;
import com.company.project.core.AbstractService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;


/**
 * Created by CodeGenerator_@ljzeng on 2020/05/07.
 */
@Service
@Transactional
public class GenderServiceImpl extends AbstractService<Gender> implements GenderService {
    @Resource
    private GenderMapper genderMapper;

}
