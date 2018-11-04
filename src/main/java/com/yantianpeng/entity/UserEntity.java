package com.yantianpeng.entity;

import lombok.Data;
/**

* @Description:    用户实体类

* @Author:        yantianpeng

* @CreateDate:     2018/11/4 下午6:16


*/
@Data
public class UserEntity {

    /**
     * 用户姓名
     */
    private String userName;
    /**
     * 用户密码
     */
    private String userPwd;
    /**
     * 用户id
     */
    private Integer userId;
    /**
     * 性别 1表示男生 0表示女生
     */
    private Integer sex;
}
