package com.learning.ssm_swagger.dao.user;

import com.learning.ssm_swagger.entity.user.User;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface UserMapper {

    @Select("select * from user where id = #{id}")
    User get(int id);

    @Select("select * from user")
    List<User> getAll();

    @Insert("insert into user " +
            "(id, name, password, age) " +
            "values " +
            "(#{id}, #{name}, #{password}, #{age})")
    void add(User user);

    @Update("update user set " +
            "name = #{name}, password = #{password}, age = #{age} " +
            "where id = #{id}")
    void update(User user);

    @Delete("delete from user where id = #{id}")
    void delete(int id);

    @Select("SELECT * FROM user WHERE name = #{name} AND password = #{password} LIMIT 1")
    User getUserByNameAndPwd(String name, String password);
}
