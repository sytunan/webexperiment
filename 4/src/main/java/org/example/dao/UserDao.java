package org.example.dao;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.example.domain.User;

public interface UserDao {

    @Select("select * from user where username = #{username}")
    public User validate(@Param("username")String username);
}
