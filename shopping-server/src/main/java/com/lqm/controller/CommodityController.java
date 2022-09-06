package com.lqm.controller;

import com.lqm.Utils.ResultUtils;
import com.lqm.api.Result;
import com.lqm.domain.Commodity;
import com.lqm.service.impl.CommodityServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("/api")
public class CommodityController {

    @Autowired
    CommodityServiceImpl commodityService;

    @GetMapping("/selectListCommodity")
    public Result<List<Commodity>> selectListCommodity(){
        return ResultUtils.success(commodityService.selectListCommodity(null));
    }

    @GetMapping("/selectById")
    public Result<Commodity> selectById(Integer id){
        return ResultUtils.success(commodityService.selectById(id));
    }

    @GetMapping("/PageDate")
    public List<Commodity> getPageInfo(int id){
        return commodityService.getPageInfo(id,8,null);
    }

    @PostMapping("/InsertCommodity")
    public Result<?> InsertCommodity(@RequestBody Commodity commodity){
        return ResultUtils.success(commodityService.InsertCommodity(commodity));
    }

    @GetMapping("/DeleteById")
    public Result<?> DeleteById(Integer id){
        return ResultUtils.success(commodityService.deleteById(id));
    }

    @PostMapping("/updateAll")
    public Result<?> updateAll(@RequestBody Commodity commodity){
        return ResultUtils.success(commodityService.updateAll(commodity));
    }

    @RequestMapping(value = "/selectCommodity")
    public Result<List<Commodity>> selectByCommodity(@RequestParam(value = "commodity") String commodity){
        return ResultUtils.success(commodityService.selectByCommodity(commodity));
    }
}

