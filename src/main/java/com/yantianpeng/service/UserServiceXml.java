package com.yantianpeng.service;

import com.yantianpeng.entity.UserEntity;
import com.yantianpeng.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.net.InetAddress;
import java.util.HashMap;
import java.util.Map;

@Service
public class UserServiceXml {

    @Autowired
    private UserMapper userMapper;

    /**
     * 根据用户名查找用户信息
     * @param userName
     * @return
     */
    public UserEntity findByName( String userName){
        UserEntity byName = userMapper.findByName(userName);
        return byName;
    }

    /**
     * 新增用户信息
     * @param userId 用户id
     * @param userName 用户姓名
     * @param userPwd  用户密码
     * @return
     */
    public Integer insertUser( Integer userId,String userName,String userPwd){
        return userMapper.insertUser(userId,userName,userPwd);
    }

    /**
     * 新增id主要用来测试参数的取值问题
     * @param Id
     * @return
     */
    public Integer insertUserByid(Integer Id){
        return userMapper.insertUserByid(Id);
    }

    /**
     * 根据id删除用户信息
     * @param id
     * @return
     */
    public Integer deleteUserById(Integer id){
        return userMapper.deleteuserbyid(id);
    }

    /**
     * 根据id更新用户直接传值用户信息(数据存放在map里面)
     * @param userEntity
     * @return
     */
    public Integer updaUserById(UserEntity userEntity){
        Map<String , Object> map =new HashMap<>();
        map.put("userId",userEntity.getUserId());
        map.put("userName",userEntity.getUserName());
        map.put("userPwd",userEntity.getUserPwd());
        return userMapper.updataUserById(map);
    }

    /**
     * 根据id更新用户资料 数据存放在实体里面
     * @param userEntity
     * @return
     */
    public Integer updateUserByIdEntity(UserEntity userEntity){
        return userMapper.updateUserByIdEntity(userEntity);
    }
}
