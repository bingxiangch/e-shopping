package me.Bell.shopapi.service;

import me.Bell.shopapi.entity.Cart;
import me.Bell.shopapi.entity.ProductInOrder;
import me.Bell.shopapi.entity.User;

import java.util.Collection;

/**
 * Created By bingxiang on 3/10/2021.
 */
public interface CartService {
    Cart getCart(User user);

    void mergeLocalCart(Collection<ProductInOrder> productInOrders, User user);

    void delete(String itemId, User user);

    void checkout(User user);
}
