package com.yantianpeng.mapper;

import com.yantianpeng.entity.UserEntity;
import org.apache.ibatis.annotations.*;

import java.util.Map;

public interface UserMapper {

    /**
     * 根据姓名查找一个用户
     * @param userName
     * @return
     */
    @Select("select id as userId,name as userName,pwd as userPwd from user2 where name=#{userName}")
    UserEntity findByName(@Param("userName") String userName);

    /**
     * 新增一个用户
     * @param userId 用户id
     * @param userName 用户姓名
     * @param userPwd 用户密码
     * @return
     */
    @Insert("insert into user1 (id,name,pwd) values(#{userId},#{userName},#{userPwd})")
    Integer insertUser(@Param("userId") Integer userId,  @Param("userName")String userName,@Param("userPwd") String userPwd);

    /**
     * 新增id主要用来测试参数的问题
     * @param id
     * @return
     */
    @Insert("insert into user1 (id) values(#{id})")
    Integer insertUserByid(@Param("id") Integer id);

    /**
     * 根据id删除用户
     * @param userId
     * @return
     */
    @Delete("delete from user1 where  id=#{userId}")
    Integer deleteuserbyid(@Param("userId") Integer userId);

    /**
     * 根据id更新用户信息(数据存放在map里面)
     * @return
     */
    @Update("update user1 set name=#{userName},pwd=#{userPwd} where id=#{userId}")
    Integer updataUserById(Map map);

    /**
     * 根据用户id更新用户信息(数据存放在实体里面)
     * @param userEntity
     * @return
     */
    @Update("update user1 set name=#{userName},pwd=#{userPwd} where id=#{userId}")
    Integer updateUserByIdEntity(UserEntity userEntity);
}
