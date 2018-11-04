package com.yantianpeng.entity;

import lombok.Data;

import javax.persistence.*;


/**

* @Description:    用户实体类

* @Author:        yantianpeng

* @CreateDate:     2018/11/4 下午6:14


*/
@Data
@Entity(name = "user1")
public class User1 {
    /**
     * 主键用户id
     */
    @Id
    @GeneratedValue
    private Integer id;
    /**
     * 用户姓名
     */
    @Column
    private String name;
    /**
     * 用户密码
     */
    @Column
    private String pwd;
}
