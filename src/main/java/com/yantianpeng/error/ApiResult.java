package com.yantianpeng.error;

import lombok.Data;

/**

* @Description:    统一返回ApiResult实体

* @Author:        yantianpeng

* @CreateDate:     2018/11/3 下午3:15


*/
@Data
public class ApiResult {
    /**
     * 私有化构造函数
     */
    private ApiResult(){

    }

    /**
     *
     * @return
     */
    public static ApiResult newInstance(){
        return  new ApiResult();
    }

    /**
     *  消息提示
     */
    private String msg;
    /**
     * 状态信息默认是true
     */
    private boolean falg = true;

    /**
     * 返回结构
     */
    private Object result;
    /**
     * 查询出的结构总数
     */
    private int rows;
    /**
     * 需要跳转的路径
     */
    private String jumpUrl;
    /**
     * 接口发生的异常时间 默认是毫秒
     */
    private long time;
}
