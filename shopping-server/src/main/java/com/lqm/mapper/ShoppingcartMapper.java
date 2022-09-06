package com.lqm.mapper;
import com.baomidou.mybatisplus.core.conditions.Wrapper;
import org.apache.ibatis.annotations.Param;

import com.lqm.domain.Shoppingcart;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * @Entity com.lqm.domain.Shoppingcart
 */
@Mapper
public interface ShoppingcartMapper extends BaseMapper<Shoppingcart> {

    Integer addAll(Shoppingcart shoppingcart);

    Integer deleteBySid(@Param("sid") Integer sid);





}




