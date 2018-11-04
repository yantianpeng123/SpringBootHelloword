package com.yantianpeng.error;

import org.springframework.web.bind.annotation.*;


/**

* @Description:    SpringBoot全局异常处理。

* @Author:        yantianpeng

* @CreateDate:     2018/11/3 下午3:14


*/
@ControllerAdvice
public class RestExceptionHandler {
    @ExceptionHandler(RuntimeException.class)//表示拦截异常的状态 拦截运行时异常
    @ResponseBody//返回json格式的数据
    @ResponseStatus//默认是500
    public ApiResult runtimeExceptionHandler(Exception ex){
        return ApiResultGenerator.errorResult(ex.getMessage(),ex);
    }


}
