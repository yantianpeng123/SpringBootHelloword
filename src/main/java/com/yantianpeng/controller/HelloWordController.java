package com.yantianpeng.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;
/**

* @Description:    SpringBoot提供对外接口返回json数据以及Springboot的启动

* @Author:        yantianpeng

* @CreateDate:     2018/11/3 上午11:03


*/
@RestController//表示接口全部返回json数据。
public class HelloWordController {

    @RequestMapping("/index")
    public String index(){
        return "sueescc";
    }

    @RequestMapping("/getMap")
    public Map<String,Object> getMap(){
        HashMap<String, Object> hashMap = new HashMap<>();
        hashMap.put("errorCode","200");
        hashMap.put("errorMsg","成功。。。");
        return hashMap;
    }


}
