package com.yantianpeng.controller;

import com.yantianpeng.entity.User1;
import com.yantianpeng.entity.UserEntity;
import com.yantianpeng.service.UserService;
import com.yantianpeng.service.UserServiceXml;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
/**

* @Description:    用户Controller层方法

* @Author:        yantianpeng

* @CreateDate:     2018/11/4 下午6:15


*/
@RestController
public class UserController {
    @Autowired
    private UserService userService;

    @Autowired
    private UserServiceXml userServiceXml;
//################################整合Spring-boot-jpa####################################################
    /**
     * 根据主键去查询
     * @param id
     * @return
     */
    @RequestMapping("/getUserJpa")
    public Map<String,Object> getUser(Integer id){
        Optional<User1> user = userService.getUser(id);
        Map<String,Object> result = new HashMap<>();
        result.put("user",user);
        return result;
    }

    /**
     * 查询全部用户
     * @return
     */
    @RequestMapping("/getUserAllJpa")
    public Map<String ,Object> getUserAll(){
        Map<String,Object> result = new HashMap<>();
        List<User1> userAll = userService.getUserAll();
        result.put("userList",userAll);
        return  result;
    }

    /**
     * 计算用户总数
     * @return
     */
    @RequestMapping("/UserCount")
    public Map<String ,Object> UserCount(){
        Map<String ,Object> result = new HashMap<>();
       long count = userService.UserCount();
       result.put("count",count);
       return result;
    }

    /**
     * 添加用户
     * @param user1
     */
    @RequestMapping("/SavaUserJpa")
    public Map<String,Object>  SavaUser(User1 user1){
        Map<String ,Object> result =new HashMap<>();
        User1 user11 = userService.SavaUser(user1);
        if(null!=user1){
            result.put("code","200");
            result.put("flag",true);
            result.put("msg"," 用户添加成功");
            return result;
        }else{
            result.put("code","500");
            result.put("flag",false);
            result.put("msg"," 用户添加失败");
            return result;
        }
    }

    /**
     * 根据id删除一个用户 并返回剩余的用户信息
     * @param id
     * @return
     */
    @RequestMapping("/deleteByIdRetAllUser")
    public Map<String ,Object>deleteByIdRetAllUser(Integer id){
        Map<String ,Object> result = new HashMap<>();
        userService.deleteUserById(id);
        List<User1> userAll = userService.getUserAll();
        result.put("userList",userAll);
        result.put("count",userAll.size());
        return result;
    }

    /**
     * 根据id更新用户 如果用户存在增做更新 用户不存在则做添加
     * @param user1
     * @return
     */
    @RequestMapping("/updateUserByid")
    public Map<String ,Object>updateUserByid(User1 user1){
        Map<String ,Object> result = new HashMap<>();
        User1 user11 = userService.UpdateUserById(user1);
        result.put("user",user11);
        return result;
    }

//    /**
//     * 根据ID查询一个用户
//     * @param id
//     * @return
//     */
//    @RequestMapping("/getOneByid")
//    public Map<String,Object>  getOneByid(Integer id){
//        User1 oneById = userService.getOneById(id);
//        Map<String,Object> result = new HashMap<>();
//        result.put("user",oneById);
//        return  result;
//    }
//################################下面的是整合MYbatis####################################################################
    /**
     * SpringBoot
     *整合Mybatis 根据用户名查找用户
     * @param userName
     * @return
     */
    @RequestMapping("/findUserByname")
    public UserEntity findUserByname(String userName){
        return userServiceXml.findByName(userName);
    }
    @RequestMapping("/insertUser")
    public Map<String,Object> insertUser(UserEntity userEntity){
        Map<String,Object> result = new HashMap<>();
        Integer count = userServiceXml.insertUser(userEntity.getUserId(), userEntity.getUserName(), userEntity.getUserPwd());
        if(count>0){
            result.put("code","200");
            result.put("msg","用户添加成功");
            result.put("flag",true);
        }else{
            result.put("code","500");
            result.put("msg","用户添加失败");
            result.put("flag",false);
        }
        return  result;
    }

    /**
     * 新增id主要用来测试参数的取值问题
     * @param id
     */
    @RequestMapping("/insertUserByid")
    public void insertUserByid(Integer id){
        Integer integer = userServiceXml.insertUserByid(id);
    }

    /**
     * 根据用户id删除用户
     * @param userId
     * @return
     */
    @RequestMapping("/deleteUserById")
    public Map<String,Object> deleteUserById(Integer userId){
        Map<String,Object> result = new HashMap<>();
        Integer count = userServiceXml.deleteUserById(userId);
        if(count>0){
            result.put("code","200");
            result.put("msg","用户删除成功");
            result.put("flag",true);
        }else{
            result.put("code","500");
            result.put("msg","用户删除失败");
            result.put("flag",false);
        }
        return  result;
    }
    @RequestMapping("/updateUserById")
    public Map<String,Object> updateUserById(UserEntity userEntity){
        Map<String,Object> result = new HashMap<>();
        Integer count = userServiceXml.updaUserById(userEntity);
        if(count>0){
            result.put("code","200");
            result.put("msg","用户更新成功");
            result.put("flag",true);
        }else{
            result.put("code","500");
            result.put("msg","用户更新失败");
            result.put("flag",false);
        }
        return  result;
    }

    /**
     * 根据用户id更新用户信息(数据存放在实体里面)
     * @param userEntity
     * @return
     */
    @RequestMapping("/updateUserByIdEntity")
    public Map<String,Object> updateUserByIdEntity(UserEntity userEntity){
        Map<String,Object> result = new HashMap<>();
        Integer count = userServiceXml.updateUserByIdEntity(userEntity);
        if(count>0){
            result.put("code","200");
            result.put("msg","用户更新成功(使用方法二)");
            result.put("flag",true);
        }else{
            result.put("code","500");
            result.put("msg","用户更新失败(使用方法二)");
            result.put("flag",false);
        }
        return result;
    }
}
