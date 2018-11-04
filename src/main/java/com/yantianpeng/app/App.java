package com.yantianpeng.app;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

/**

* @Description:    SpringBoot项目启动类

* @Author:        yantianpeng

* @CreateDate:     2018/11/4 下午11:08


*/
@EnableAutoConfiguration
@ComponentScan("com.yantianpeng")//SpringBoot扫描包
@EnableJpaRepositories("com.yantianpeng.dao")//整合jpa扫描包
@EntityScan("com.yantianpeng.entity")//实体扫描包整合jpa的时候需要添加，另外在实体类里面必须使用@Entity注解
@MapperScan(basePackages = {"com.yantianpeng.mapper"})//整合Mybatis扫描包 扫描dao层接口
public class App {

    public static void main(String[] args) {
        SpringApplication.run(App.class,args);
    }
}
