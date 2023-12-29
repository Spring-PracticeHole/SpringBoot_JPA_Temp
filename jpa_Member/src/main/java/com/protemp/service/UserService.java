package com.protemp.service;

import com.protemp.entity.User;
import org.springframework.security.crypto.password.PasswordEncoder;

public interface UserService {
    public User userInsert(User user);
    public PasswordEncoder passwordEncoder();
    public User getId(String id);
    public User userUpdate(User user);
    public int loginPro(String id);
}
