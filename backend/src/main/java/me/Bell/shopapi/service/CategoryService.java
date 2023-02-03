package me.Bell.shopapi.service;

import me.Bell.shopapi.entity.ProductCategory;

import java.util.List;

/**
 * Created By bingxiang on 3/10/2021.
 */
public interface CategoryService {

    List<ProductCategory> findAll();

    ProductCategory findByCategoryType(Integer categoryType);

    List<ProductCategory> findByCategoryTypeIn(List<Integer> categoryTypeList);

    ProductCategory save(ProductCategory productCategory);


}
