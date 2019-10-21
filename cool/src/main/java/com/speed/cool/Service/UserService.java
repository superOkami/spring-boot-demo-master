package com.speed.cool.Service;

import com.speed.cool.dto.User;

/**
 * @author ：wj
 * @date ：Created in 2019/9/17 14:58
 * @description：${description}
 * @modified By：
 * @version: $version$
 */
public interface UserService {
    User findByUserName(String userName);
}
