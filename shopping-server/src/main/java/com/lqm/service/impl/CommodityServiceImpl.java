package com.lqm.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.lqm.domain.Commodity;
import com.lqm.service.CommodityService;
import com.lqm.mapper.CommodityMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 *
 */
@Service
public class CommodityServiceImpl extends ServiceImpl<CommodityMapper, Commodity>
    implements CommodityService{

    @Autowired
    CommodityMapper commodityMapper;

    @Override
    public List<Commodity> selectListCommodity(QueryWrapper<Commodity> queryWrapper) {
        return commodityMapper.selectList(null);
    }

    @Override
    public Commodity selectById(Integer id) {
        return commodityMapper.selectById(id);
    }

    @Override
    public List<Commodity> getPageInfo(int pageIndex, int pageSize, QueryWrapper<Commodity> queryWrapper) {
        Page<Commodity> page=new Page<>(pageIndex,pageSize);
        Page<Commodity> result=commodityMapper.selectPage(page,queryWrapper);
        return result.getRecords();
    }

    @Override
    public Integer InsertCommodity(Commodity commodity) {
        return commodityMapper.addAll(commodity);
    }

    @Override
    public Integer deleteById(Integer id) {
        return commodityMapper.deleteById(id);
    }

    @Override
    public Integer updateAll(Commodity commodity) {
        return commodityMapper.updateAll(commodity);
    }

    @Override
    public List<Commodity> selectByCommodity(String commodity) {
        return commodityMapper.findListByCommodity(commodity);
    }


}




