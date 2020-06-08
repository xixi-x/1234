package com.jtt.controller;

import com.alibaba.fastjson.JSONObject;
import com.jtt.bean.TblCompany;
import com.jtt.bean.TblUserRecord;
import com.jtt.returnJson.ReturnObject;
import com.jtt.service.EstateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@CrossOrigin(origins = "*",methods ={},allowedHeaders = "*",allowCredentials = "true")
public class EstateController {
    @Autowired
    private EstateService estateService;
    @RequestMapping("/estateCompany")
    public String selectCompany(){
        System.out.println("selectCompany");
        List<TblCompany> companies=estateService.selectCompany();
        return JSONObject.toJSONString(new ReturnObject(companies));
    }
}
