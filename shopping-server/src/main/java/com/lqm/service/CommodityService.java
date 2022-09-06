package com.lqm.service;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.lqm.domain.Commodity;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;

/**
 *
 */
public interface CommodityService extends IService<Commodity> {

    /**
     * 查询全部
     * @param queryWrapper
     * @return List<Commodity>
     */
    List<Commodity> selectListCommodity(QueryWrapper<Commodity> queryWrapper);

    /**
     * 根据ID查询
     * @param id
     * @return Commodity
     */
    Commodity selectById(Integer id);

    /**
     * 分页查询
     * @param pageIndex
     * @param pageSize
     * @param queryWrapper
     * @return List<Commodity>
     */
    List<Commodity> getPageInfo(int pageIndex, int pageSize, QueryWrapper<Commodity> queryWrapper);

    /**
     * 新增商品
     * @param commodity
     * @return Integer
     */
    Integer InsertCommodity(Commodity commodity);

    /**
     * 删除商品 (根据ID)
     * @param id
     * @return Integer
     */
    Integer deleteById(Integer id);

    /**
     * 修改商品 (根据ID)
     * @param commodity
     * @return Integer
     */
    Integer updateAll(Commodity commodity);

    /**
     * 模糊查询 (commodity)
     * @param commodity
     * @return List<Commodity>
     */
    List<Commodity> selectByCommodity(String commodity);



}
