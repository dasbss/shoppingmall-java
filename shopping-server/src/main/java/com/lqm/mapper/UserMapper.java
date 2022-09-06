package com.lqm.mapper;
import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.lqm.domain.User;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

/**
 * @Entity com.lqm.domain.User
 */
@Mapper
public interface UserMapper extends BaseMapper<User> {

    User selectByUsernameAndPassword(@Param("username") String username, @Param("password") String password);

    Integer addAll(User user);

    Integer deleteById(@Param("id") Integer id);

    Integer updateAll(User user);

    User selectById(@Param("id") Integer id);

    @Select("select * from user where username like concat('%',#{username},'%')")
    List<User> selectByUsername(@Param("username") String username);

    @Select("select * from user where emial like concat('%',#{emial},'%')")
    List<User> selectByEmialUsers(@Param("emial") String emial);


}




