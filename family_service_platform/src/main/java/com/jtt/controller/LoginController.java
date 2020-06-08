package com.jtt.controller;

import com.alibaba.fastjson.JSONObject;
import com.jtt.bean.TblUserRecord;
import com.jtt.returnJson.Perminssions;
import com.jtt.returnJson.Permission;
import com.jtt.returnJson.ReturnObject;
import com.jtt.returnJson.UserInfo;
import com.jtt.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import javax.servlet.http.HttpSession;
import java.util.ArrayList;
import java.util.List;

@RestController
@CrossOrigin(origins = "*",methods ={},allowedHeaders = "*",allowCredentials = "true")
public class LoginController {
    /**
     * 此方法，浏览器请求成功，但是后端控制台打印null-----null，接收不到用户名和密码
     * */
//    @RequestMapping("/auth/login")
//    public String login( String username,String password){
//        System.out.println("login");
//        System.out.println(username+"-----"+password);
//        return "success";
//    }
    /**
     * 解决方法一(success)：后端控制台打印{password=bfb6e3c9912e182559bb714ebcda36f6, username=admin}
     * */
//    @RequestMapping("/auth/login")
//    public String login(@RequestBody Map<String,Object> map){
//        System.out.println("login");
//        System.out.println(map);
//        return "success";
//    }
    /**
     * 解决方法二（失败）：后端控制台报错,找不到Required String parameter 'username' is not present
     * */
//    @RequestMapping("/auth/login")
//    public String login(@RequestParam("username") String username,@RequestParam("password") String password){
//        System.out.println("login");
//        System.out.println(username+"---"+password);
//        return "success";
//    }
    /**
     * 解决方法三（成功）：
     * 前端添加     1.const QS = requier ('qs')
     *             2.const params = QS.stringify(loginParams)
     *             3.install qs,再启动
     * qs:处理参数的工具
     * 后端控制台打印admin---57c5a9eea786cd47ee17d720420493fa
     * */
//    @RequestMapping("/auth/login")
//    public String login(@RequestParam("username")String username,@RequestParam("password")String password){
//        System.out.println("login");
//        System.out.println(username+"---"+password);
//        return "success";
//    }

    @RequestMapping("/auth/2step-code")
    public boolean step_code2(){
        System.out.println("此请求是前端框架带的默认请求，可以不做任何处理，也可以在前端将其删除");
        System.out.println("2step_code");
        return true;
    }

    /**
     * 编写登陆逻辑
     * */
    @Autowired
    private  LoginService loginService;
    @RequestMapping("/auth/login")
    public String login(@RequestParam("username") String username, @RequestParam("password") String password, HttpSession session){
        System.out.println("login");
        //期望接收的返回值是TblUserRecord,所以当前对象返回值设置为TblUserRecord
        TblUserRecord tblUserRecord=loginService.login(username,password);
        tblUserRecord.setToken(tblUserRecord.getUserName());
        //将用户数据写到session中
        session.setAttribute("userRecord",tblUserRecord);
        System.out.println(session.getId());
        ReturnObject resultObject=new ReturnObject(tblUserRecord);
        return JSONObject.toJSONString(resultObject);
    }
    @RequestMapping("/user/info")
    public String getInfo(HttpSession session){
        //获取用户信息
        TblUserRecord tblUserRecord= (TblUserRecord) session.getAttribute("userRecord");
        //通过属性把值都拿出来，然后把值设置到当前对象里面,获取对应用户需要账务的功能模块
        //拼接成字符串数组
        String[] split = tblUserRecord.getTblRole().getRolePrivileges().split("-");
        //创建总体集合对象,拼接需要返回的数据对象的格式
        Perminssions perminssions=new Perminssions();
        //创建具体集合,向权限集合对象中添加具体的权限
        List<Permission> perminssionList=new ArrayList<>();
        System.out.println(session.getId());
        for (String s : split) {
            perminssionList.add(new Permission(s));
        }
        //设置返回值的result
        perminssions.setPermissions(perminssionList);
        UserInfo userInfo=new UserInfo(tblUserRecord.getUserName(),perminssions);
        return JSONObject.toJSONString(new ReturnObject(userInfo));
    }
    @RequestMapping("/auth/logout")
    public JSONObject logout(HttpSession session){
        System.out.println("退出登录");
        //清空session
        session.invalidate();
        //返回什么已经不重要了，执行退出就已经退出了。
        return JSONObject.parseObject(JSONObject.toJSONString(new ReturnObject(null)));
    }

    //这种方法也可以，返回值不重要
//    @RequestMapping("/auth/logout")
//    public void logout(HttpSession session){
//        System.out.println("退出登录");
//        //清空session
//        session.invalidate();
//    }

}




