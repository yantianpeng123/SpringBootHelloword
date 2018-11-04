package com.yantianpeng.service;

import com.yantianpeng.dao.UserDao;
import com.yantianpeng.entity.User1;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
/**

* @Description:    用户Service层方法

* @Author:        yantianpeng

* @CreateDate:     2018/11/4 下午6:14


*/
@Service
public class UserService {

    @Autowired
    private UserDao userDao;

    /**
     * 根据主键进行查询
     * @param id
     * @return
     */
   public Optional<User1> getUser(Integer id){
       Optional<User1> user1 = userDao.findById(id);
       return user1;
   }

    /**
     * 查询全部用户
     * @return
     */
   public List<User1> getUserAll(){
       return userDao.findAll();
   }

    /**
     * 查询用户总数
     * @return
     */
     public Long UserCount(){
        return userDao.count();
     }

    /**
     * 添加用户
     * @param user1
     * @return
     */

     public User1 SavaUser(User1 user1){
         User1 save = userDao.save(user1);
         return save;
     }

    /**
     * 根据Id删除一个用户
     * @param id
     */
     public void deleteUserById(Integer id){
         userDao.deleteById(id);
     }

    /**
     * 更新一个用户如果id存在的话则执行更新id不存在则执行新增
     * @param user1
     * @return
     */
     public User1 UpdateUserById(User1 user1){
         return userDao.save(user1);
     }

//    /**
//     * 根据ID得到一个用户
//     * @param id
//     * @return
//     */
//     public User1 getOneById(Integer id){
//         User1 one = userDao.getOne(id);
//         return one;
//     }
}
