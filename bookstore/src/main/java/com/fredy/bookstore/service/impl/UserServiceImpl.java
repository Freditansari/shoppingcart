package com.fredy.bookstore.service.impl;

import com.fredy.bookstore.domain.User;
import com.fredy.bookstore.domain.security.UserRole;
import com.fredy.bookstore.repository.RoleRepository;
import com.fredy.bookstore.repository.UserRepository;
import com.fredy.bookstore.service.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.Set;

@Service
public class UserServiceImpl implements UserService {

    private static final Logger LOG = LoggerFactory.getLogger(UserService.class);
    @Autowired
    private UserRepository userRepository;

    @Autowired
    private RoleRepository roleRepository;

    @Transactional
    public User createUser(User user, Set<UserRole> userRoles){

        User localUser = userRepository.findByUserName(user.getUsername());

        if(localUser!= null){
            LOG.info("User {} already exists", user.getUserName());
        }else{
            for(UserRole ur:userRoles){
                roleRepository.save(ur.getRole());
            }

            user.getUserRoles().addAll(userRoles);
            localUser=userRepository.save(user);
        }
        return localUser;

    }
}
