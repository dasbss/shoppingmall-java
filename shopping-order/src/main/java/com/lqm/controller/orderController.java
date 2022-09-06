package com.lqm.controller;


import com.lqm.api.Result;
import com.lqm.domain.Commodity;
import com.lqm.domain.Shoppingcart;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("/order")
public class orderController {

    @Autowired
    RestTemplate restTemplate;

    @RequestMapping("/haha")
    public String love(){
        String msg=restTemplate.getForObject("http://userservice/api/wowo",String.class);
        return "Hello"+msg;
    }

    @GetMapping("/orderSelectListCommodity")
    public Result<List<Commodity>> selectListCommodity(){
        return restTemplate.getForObject("http://userservice/api/selectListCommodity", Result.class);
    }

    @GetMapping("/orderSelectAllComment")
    public Result<List<Commodity>> selectAllComment(){
        return restTemplate.getForObject("http://userservice/api/selectAllComment",Result.class);
    }

    @GetMapping("/orderSelectShoppingCart")
    public Result<List<Shoppingcart>> selectShoppingCart(){
        return restTemplate.getForObject("http://userservice/api/SelectShoppingCart",Result.class);
    }
}

