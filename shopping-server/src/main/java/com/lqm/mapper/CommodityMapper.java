package com.lqm.mapper;
import java.util.List;
import org.apache.ibatis.annotations.Param;

import com.lqm.domain.Commodity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

/**
 * @Entity com.lqm.domain.Commodity
 */
@Mapper
public interface CommodityMapper extends BaseMapper<Commodity> {

    Commodity selectById(@Param("id") Integer id);

    Integer addAll(Commodity commodity);

    Integer deleteById(@Param("id") Integer id);

    Integer updateAll(Commodity commodity);

    @Select("select * from commodity where commodity like concat('%',#{commodity},'%')")
    List<Commodity> findListByCommodity(@Param("commodity") String commodity);


}




