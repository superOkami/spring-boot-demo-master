package com.speed.cool.Service;

import com.speed.cool.model.LoginResult;

/**
 * @author ：wj
 * @date ：Created in 2019/9/17 14:58
 * @description：${description}
 * @modified By：
 * @version: $version$
 */
public interface LoginService {
    LoginResult login(String userName, String password);

    void logout();
}
