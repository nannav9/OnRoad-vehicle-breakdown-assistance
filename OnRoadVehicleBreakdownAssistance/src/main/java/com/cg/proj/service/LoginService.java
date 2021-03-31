package com.cg.proj.service;

import com.cg.proj.entity.Userlogin;
import com.cg.proj.exceptions.LoginException;

public interface LoginService {
    public Userlogin doLogin(String userId, String password)throws LoginException;
    public String encryptUser(Userlogin user);
    
}
