package com.speed.cool.Service.serviceImpl;

import com.speed.cool.Dao1.UserRepository;
import com.speed.cool.Service.UserService;
import com.speed.cool.dto.User;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author ：wj
 * @date ：Created in 2019/9/17 14:59
 * @description：${description}
 * @modified By：
 * @version: version
 */
@Service
public class UserServiceImpl implements UserService {
    @Resource
    private UserRepository userRepository;

    @Override
    public User findByUserName(String userName) {
        return userRepository.findByUserName(userName);
    }
}
