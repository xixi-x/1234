package com.jtt.service;

import com.jtt.bean.TblUserRecord;
import com.jtt.mapper.base.TblUserRecordMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LoginService {
    @Autowired
    private TblUserRecordMapper tblUserRecordMapper;
    public TblUserRecord login(String username,String password){
        return tblUserRecordMapper.login(username,password);
    }
}
