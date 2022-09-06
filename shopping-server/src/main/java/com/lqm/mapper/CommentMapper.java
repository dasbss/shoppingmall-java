package com.lqm.mapper;
import com.lqm.domain.Commodity;
import org.apache.ibatis.annotations.Param;
import java.util.List;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.lqm.domain.Comment;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

/**
 * @Entity com.lqm.domain.Comment
 */
@Mapper
public interface CommentMapper extends BaseMapper<Comment> {

    Integer addAll(Comment comment);

    Page selectPage(Page<Comment> page);

    List<Comment> selectByCusername(@Param("cusername") String cusername);

    Comment selectByCid(@Param("cid") Integer cid);

    Integer deleteByCid(@Param("cid") Integer cid);

    @Select("select * from comment where cinfo like concat('%',#{cinfo},'%')")
    List<Comment> findListComment(@Param("cinfo") String cinfo);


}




