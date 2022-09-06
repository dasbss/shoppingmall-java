package com.lqm.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.lqm.domain.Comment;
import com.lqm.mapper.CommodityMapper;
import com.lqm.service.CommentService;
import com.lqm.mapper.CommentMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

/**
 *
 */
@Service
public class CommentServiceImpl extends ServiceImpl<CommentMapper, Comment>
    implements CommentService {

    @Autowired
    CommentMapper commentMapper;


    @Override
    public List<Comment> selectAllComment() {
        return commentMapper.selectList(null);
    }

    @Override
    public Integer insertComment(Comment comment) {
        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date date = new Date();
        comment.setCtime(df.format(date));
        return commentMapper.addAll(comment);
    }


    public List<Comment> getPageInfo(int pageIndex, int pageSize, QueryWrapper<Comment> queryWrapper) {
        Page<Comment> page = new Page<>(pageIndex, pageSize);
        Page<Comment> result = commentMapper.selectPage(page, queryWrapper);
        return result.getRecords();
    }

    @Override
    public List<Comment> selectByCusername(String cusername) {
        return commentMapper.selectByCusername(cusername);
    }

    @Override
    public Comment selectByCid(Integer cid) {
        return commentMapper.selectByCid(cid);
    }

    @Override
    public List<Comment> findListComment(String cinfo) {
        return commentMapper.findListComment(cinfo);
    }

    @Override
    public Integer deleteByCid(Integer cid) {
        return commentMapper.deleteByCid(cid);
    }

}




