package me.Bell.shopapi.service;

import me.Bell.shopapi.entity.ProductInOrder;
import me.Bell.shopapi.entity.User;

/**
 * Created By bingxiang on 1/3/2022.
 */
public interface ProductInOrderService {
    void update(String itemId, Integer quantity, User user);
    ProductInOrder findOne(String itemId, User user);
}
