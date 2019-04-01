package com.libraryWS.impl.manager;

import com.libraryWS.beans.User;
import com.libraryWS.contract.manager.UserManager;
import com.libraryWS.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("userManager")
public class UserManagerImpl implements UserManager {

    private UserRepository userRepository;

    @Override
    public User getUser(String email, String password) {
        return null;
    }

}
