package com.lqm.service;

import com.lqm.domain.Shoppingcart;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;

/**
 *
 */
public interface ShoppingcartService extends IService<Shoppingcart> {

    List<Shoppingcart> selectAllShoppingCart();

    Integer InsertShoppingCart(Shoppingcart shoppingcart);

    Integer deleteShoppingCart(Integer sid);

    Long selectCount();


}
