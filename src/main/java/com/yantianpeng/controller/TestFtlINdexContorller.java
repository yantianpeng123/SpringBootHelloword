package com.yantianpeng.controller;

import com.yantianpeng.entity.UserEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@Controller
public class TestFtlINdexContorller {

    @RequestMapping("/TestFtlINdexContorller")
    public String index(){
        System.out.println("==================>>>测试TestFtl模板引擎");
        return "test";
    }

    @RequestMapping("/testUserName")
    public String testUserName(Map<String,Object> result){
        result.put("name","曹永芳");
        result.put("sex",0);
        return "testUserName";
    }
    @RequestMapping("/testList")
    public String testList(Map<String ,Object> result){
        System.out.println("Test");
        List<UserEntity> list = new ArrayList<>();
        UserEntity userEntity =new UserEntity();
        userEntity.setUserId(1);
        userEntity.setUserName("曹永芳");
        userEntity.setUserPwd("12345678");
        userEntity.setSex(1);
        list.add(userEntity);
        UserEntity userEntity1 =new UserEntity();
        userEntity1.setUserId(2);
        userEntity1.setUserName("闫天蓬");
        userEntity1.setUserPwd("1234567");
        userEntity1.setSex(0);
        list.add(userEntity1);
        UserEntity userEntity2 =new UserEntity();
        userEntity2.setSex(2);
        userEntity2.setUserPwd("123456678");
        userEntity2.setUserName("Testelse");
        userEntity2.setUserId(3);
        list.add(userEntity2);
        result.put("userList",list);
        return "index";
    }

}
