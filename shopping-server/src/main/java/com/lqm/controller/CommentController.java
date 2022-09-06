package com.lqm.controller;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.lqm.Utils.ResultUtils;
import com.lqm.api.Result;
import com.lqm.domain.Comment;
import com.lqm.domain.Commodity;
import com.lqm.domain.User;
import com.lqm.service.CommentService;
import com.lqm.service.impl.CommentServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("/api")
public class CommentController {

    @Autowired
    CommentServiceImpl commentService;

    @GetMapping("/selectAllComment")
    public Result<List<Comment>> selectAllComment(){
        return ResultUtils.success(commentService.selectAllComment());
    }

    @PostMapping("/insertComment")
    public Result<?> insertComment(@RequestBody Comment comment){
        return ResultUtils.success(commentService.insertComment(comment));
    }

    @GetMapping("/PageSelectData")
    public List<Comment> getPageInfo(int cid){
        return commentService.getPageInfo(cid,5,null);
    }

    @GetMapping("/selectByCusername")
    public Result<List<Comment>> selectByCusername(String cusername){
        return ResultUtils.success(commentService.selectByCusername(cusername));
    }

    @GetMapping("/selectByCid")
    public Result<Comment> selectByCid(Integer cid){
        return ResultUtils.success(commentService.selectByCid(cid));
    }
    
    @GetMapping("/selectByCinfo")
    public Result<List<Comment>> selectByCinfo(String cinfo){
        return ResultUtils.success(commentService.findListComment(cinfo));
    }

    @GetMapping("/deleteByCid")
    public Result<?> deleteById(Integer cid){
        return ResultUtils.success(commentService.deleteByCid(cid));
    }
}
