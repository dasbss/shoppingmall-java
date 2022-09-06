package com.lqm.service;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.lqm.domain.Comment;
import com.baomidou.mybatisplus.extension.service.IService;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 *
 */
public interface CommentService extends IService<Comment> {

  /**
   * 查询全部
   * @return List<Comment>
   */
  List<Comment> selectAllComment();

  /**
   * 新增评论
   * @param comment
   * @return Integer
   */
  Integer insertComment(Comment comment);

  /**
   * 分页查询
   * @param pageIndex
   * @param pageSize
   * @param queryWrapper
   * @return List<Comment>
   */
  List<Comment> getPageInfo(int pageIndex, int pageSize, QueryWrapper<Comment> queryWrapper);

  /**
   * 查询 (根据 cuername)
   * @param cusername
   * @return List<Comment>
   */
  List<Comment> selectByCusername(String cusername);

  /**
   * 查询 (根据 cid)
   * @param cid
   * @return Comment
   */
  Comment selectByCid(Integer cid);

  /**
   * 模糊查询 (根据 cinfo)
   * @param cinfo
   * @return  List<Comment>
   */
  List<Comment> findListComment(String cinfo);

  /**
   * 删除评论
   * @param cid
   * @return Integer
   */
  Integer deleteByCid(Integer cid);

}
