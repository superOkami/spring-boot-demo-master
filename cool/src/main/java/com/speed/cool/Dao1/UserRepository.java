package com.speed.cool.Dao1;

import com.speed.cool.dto.User;
import org.springframework.stereotype.Repository;

/**
 * @author ：wj
 * @date ：Created in 2019/9/17 14:56
 * @description：${description}
 * @modified By：
 * @version: $version$
 */
@Repository
//public interface UserRepository extends JpaRepository<User,Integer> {
public interface UserRepository {
    User findByUserName(String userName);
}
