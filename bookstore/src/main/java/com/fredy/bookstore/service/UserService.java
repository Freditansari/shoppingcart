package com.fredy.bookstore.service;

import com.fredy.bookstore.domain.User;
import com.fredy.bookstore.domain.security.UserRole;

import java.util.Set;

public interface UserService {

    User createUser(User user, Set<UserRole> userRoles);
}
