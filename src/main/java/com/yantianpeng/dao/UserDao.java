package com.yantianpeng.dao;

import com.yantianpeng.entity.User1;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**

* @Description:    dao层接口实现JpaRepository
 * 里面包含一些增删改查的接口

* @Author:        yantianpeng

* @CreateDate:     2018/11/4 下午1:45


*/
@Repository
public interface UserDao extends JpaRepository<User1,Integer> {
}
