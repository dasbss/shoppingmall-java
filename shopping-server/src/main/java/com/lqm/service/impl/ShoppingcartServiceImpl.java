package com.lqm.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.lqm.domain.Shoppingcart;
import com.lqm.service.ShoppingcartService;
import com.lqm.mapper.ShoppingcartMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 *
 */
@Service
public class ShoppingcartServiceImpl extends ServiceImpl<ShoppingcartMapper, Shoppingcart>
    implements ShoppingcartService{

    @Autowired
    ShoppingcartMapper shoppingcartMapper;

    @Override
    public List<Shoppingcart> selectAllShoppingCart() {
        return shoppingcartMapper.selectList(null);
    }

    @Override
    public Integer InsertShoppingCart(Shoppingcart shoppingcart) {
        return shoppingcartMapper.addAll(shoppingcart);
    }

    @Override
    public Integer deleteShoppingCart(Integer sid) {
        return shoppingcartMapper.deleteBySid(sid);
    }

    @Override
    public Long selectCount() {
        return shoppingcartMapper.selectCount(null);
    }


}




