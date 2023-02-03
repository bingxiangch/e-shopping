package me.Bell.shopapi.service;


import me.Bell.shopapi.entity.User;

import java.util.Collection;

/**
 * Created By bingxiang on 3/13/2021.
 */
public interface UserService {
    User findOne(String email);

    Collection<User> findByRole(String role);

    User save(User user);

    User update(User user);
}
