package com.music.app.service.user;

import com.music.app.model.User;
import com.music.app.service.IGeneralService;
import org.springframework.security.core.userdetails.UserDetailsService;

public interface IUserService extends IGeneralService<User>, UserDetailsService {
    User findUserByUsername(String username);
}
