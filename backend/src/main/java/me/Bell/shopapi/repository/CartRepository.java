package me.Bell.shopapi.repository;

import me.Bell.shopapi.entity.Cart;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Created By bingxiang on 1/2/2022.
 */

public interface CartRepository extends JpaRepository<Cart, Integer> {
}
