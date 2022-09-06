package com.lqm.controller;

import com.lqm.Utils.ResultUtils;
import com.lqm.api.Result;
import com.lqm.domain.Commodity;
import com.lqm.domain.User;
import com.lqm.service.impl.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("/api")
public class UserController {

    @Autowired
    UserServiceImpl userService;

    @GetMapping("/login")
    public Result<?> selectByUsernameAndPassword(String username, String password){
        return ResultUtils.success(userService.selectByUsernameAndPassword(username,password));
    }

    @GetMapping("/pageUser")
    public Result<List<User>> pageUser(Integer id){
        return ResultUtils.success(userService.getPageInfo(id,5,null));
    }

    @PostMapping("/InsertUser")
    public Result<?> InsertUser(@RequestBody User user){
        return ResultUtils.success(userService.InsertUser(user));
    }

    @GetMapping("/deleteById")
    public Result<?> deleteById(Integer id){
        return ResultUtils.success(userService.deleteById(id));
    }

    @PostMapping("/updateUser")
    public Result<?> updateUser(@RequestBody User user){ return ResultUtils.success(userService.updateAll(user)); }

    @GetMapping("/selectByIdUser")
    public Result<?> selectById(Integer id){ return ResultUtils.success(userService.selectById(id)); }

    @GetMapping("/selectByUsername")
    public Result<User> selectByUsername(String username){ return ResultUtils.success(userService.selectByUsername(username)); }

    @GetMapping("/selectByEmial")
    public Result<User> selectByEmial(String emial){ return ResultUtils.success(userService.selectByEmial(emial)); }
}
