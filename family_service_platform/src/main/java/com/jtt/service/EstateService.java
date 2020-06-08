package com.jtt.service;

import com.jtt.bean.TblCompany;
import com.jtt.mapper.base.TblCompanyMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EstateService {
    @Autowired
    //tblCompanyMapper报错，可以在TblCompanyMapper类上添加组件，这样springboot就能扫描到了
    private TblCompanyMapper tblCompanyMapper;
    public List<TblCompany> selectCompany(){
        List<TblCompany> companies=tblCompanyMapper.selectCompany();
        return companies;
    }
}
