package com.yantianpeng.error;

import java.util.List;

public final  class ApiResultGenerator {
    /**
     * 创建普通消息方法
     * @param flag
     * @param msg
     * @param result
     * @param rows
     * @param jumpUrl
     * @param
     * @return
     */
    public static ApiResult result(boolean flag,String msg,Object result,int rows,String jumpUrl,Throwable throwable){
        ApiResult apiResult = ApiResult.newInstance();
        apiResult.setFalg(flag);
        apiResult.setMsg(msg);
        apiResult.setResult(result);
        apiResult.setRows(rows);
        apiResult.setJumpUrl(jumpUrl);
       // apiResult.setTime(time);
        return apiResult;
    }

    /**
     * 返回成功的执行方法
     * @param result
     * @return
     */
    public static ApiResult succuessResult(Object result){
       //默认是0
        int rows =0;
        if(result instanceof List) rows = ((List) result).size();
        return  result(true," ",result,rows,null,null);
    }

    /**
     * 执行失败返回的试图方法
     * @param
     * @return
     */
    public static ApiResult errorResult(String msg,Throwable throwable){
        return result(false,msg,"",0,"",throwable);
    }
}
