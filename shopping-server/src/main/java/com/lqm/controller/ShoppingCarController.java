package com.lqm.controller;

import com.lqm.Utils.ResultUtils;
import com.lqm.api.Result;
import com.lqm.domain.Shoppingcart;
import com.lqm.service.impl.ShoppingcartServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("/api")
public class ShoppingCarController {

    @Autowired
    ShoppingcartServiceImpl shoppingcartService;

    @GetMapping("/selectCount")
    public Result<?> selectCount(){
        return ResultUtils.success(shoppingcartService.selectCount());
    }

    @GetMapping("/SelectShoppingCart")
    public Result<List<Shoppingcart>> SelectShoppingCart(){
        return ResultUtils.success(shoppingcartService.selectAllShoppingCart());
    }

    @PostMapping("/InertShoppingCart")
    public Result<?> ShoppingCarController(@RequestBody  Shoppingcart shoppingcart){
        return ResultUtils.success(shoppingcartService.InsertShoppingCart(shoppingcart));
    }

    @GetMapping("/deleteShoppingCartBysId")
    public Result<?> deleteShoppingCartBysId(Integer sid){
        return ResultUtils.success(shoppingcartService.deleteShoppingCart(sid));
    }
}
