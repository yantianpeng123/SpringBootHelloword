package com.yantianpeng.controller;

import com.yantianpeng.entity.UserEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
public class IndexController {

    @RequestMapping("/getList")
    public List getList(){
        List list =new ArrayList();
        list.add(1);
        list.add("zhangdan");
        list.add("wanngwu");
        return list;
    }
    @RequestMapping("/getAllUser")
    public List<UserEntity> listUser(){
        List<UserEntity> list = new ArrayList<>();
        UserEntity userEntity = new UserEntity();
        userEntity.setUserName("曹永芳");
        userEntity.setUserId(1);
        userEntity.setUserPwd("12345678");
        UserEntity userEntity1 =new UserEntity();
        userEntity1.setUserPwd("12345678");
        userEntity1.setUserName("闫天蓬");
        userEntity1.setUserId(2);
        list.add(userEntity);
        list.add(userEntity1);
        Map<String ,Object> listMap =new HashMap<>();
        listMap.put("data",list);
        listMap.put("type",1);
        return list;
    }
    @RequestMapping("/getAllUserMap")
    public Map<String,Object> getAllUserMap(){
        Map<String ,Object> listMap =new HashMap<>();
        List<UserEntity> list = new ArrayList<>();
        UserEntity userEntity = new UserEntity();
        userEntity.setUserName("曹永芳");
        userEntity.setUserId(1);
        userEntity.setUserPwd("12345678");
        UserEntity userEntity1 =new UserEntity();
        userEntity1.setUserPwd("12345678");
        userEntity1.setUserName("闫天蓬");
        userEntity1.setUserId(2);
        list.add(userEntity);
        list.add(userEntity1);
        listMap.put("data",list);
        listMap.put("type",1);
        return listMap;
    }
}
