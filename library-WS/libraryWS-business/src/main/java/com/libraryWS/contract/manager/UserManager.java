package com.libraryWS.contract.manager;

import com.libraryWS.beans.User;

public interface UserManager {

    public User getUser(String email, String password);
}
