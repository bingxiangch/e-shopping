package me.Bell.shopapi.repository;

import me.Bell.shopapi.entity.ProductInOrder;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created By bingxiang on 3/14/2021.
 */
public interface ProductInOrderRepository extends JpaRepository<ProductInOrder, Long> {

}
