package com.lqm.service;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.lqm.domain.Commodity;
import com.lqm.domain.User;
import com.baomidou.mybatisplus.extension.service.IService;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 *
 */
public interface UserService extends IService<User> {

    /**
     * 根据 username,password 登录
     * @param username
     * @param password
     * @return User
     */
   User selectByUsernameAndPassword(String username, String password);

    /**
     * 分页查询
     * @param pageIndex
     * @param pageSize
     * @param queryWrapper
     * @return List<User>
     */
    List<User> getPageInfo(int pageIndex, int pageSize, QueryWrapper<User> queryWrapper);

    /**
     * 新增用户
     * @param user
     * @return Integer
     */
    Integer InsertUser(User user);

    /**
     * 删除用户
     * @param id
     * @return Integer
     */
    Integer deleteById(Integer id);

    /**
     * 修改用户
     * @param user
     * @return Integer
     */
    Integer updateAll(User user);

    /**
     * 通过ID查询
     * @param id
     * @return User
     */
    User selectById(Integer id);

    /**
     * 通过Username查询
     * @param username
     * @return List<User>
     */
    List<User> selectByUsername(String username);

    /**
    * 通过Emial查询
    * @param emial
    * @return List<User>
    */
    List<User> selectByEmial(String emial);

}
