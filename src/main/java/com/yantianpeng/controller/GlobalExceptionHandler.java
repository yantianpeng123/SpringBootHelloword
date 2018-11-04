package com.yantianpeng.controller;

import com.yantianpeng.error.ApiResult;
import com.yantianpeng.error.ApiResultGenerator;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.Map;

/**

* @Description:    全局捕获异常

* @Author:        yantianpeng

* @CreateDate:     2018/11/3 上午11:54


//*/
@ControllerAdvice//类似于aop切面
public class GlobalExceptionHandler {

//    @ExceptionHandler(RuntimeException.class)//表示拦截异常的状态 拦截运行时异常
//    @ResponseBody//返回json格式的数据
//    public Map<String ,Object> resultMap500(){
//         Map<String ,Object> reaultMap = new HashMap<>();
//        reaultMap.put("errorCode","500");
//        reaultMap.put("errorMsg","系统错误");
//        return reaultMap;
//    }
//    @ExceptionHandler(RuntimeException.class)//表示拦截异常的状态 拦截运行时异常
//    @ResponseBody//返回json格式的数据
//    public ApiResult runtimeExceptionHandler(Exception ex){
//    return ApiResultGenerator.errorResult(ex.getMessage(),ex);
//    }
}
