package com.itheima.sh;

import com.itheima.sh.mapper.UserMapper;
import com.itheima.sh.pojo.User;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class UserMapperTest {
    @Autowired
    private UserMapper userMapper;


//    根据id查用户
    @Test
    public void testSelectById() {
        User user = userMapper.selectById(5L);
        System.err.println("user = " + user);
    }

    @Test
    void testInsert() {

        User user = User.builder()
                .age(22)
                .email("1591435@qq.com")
                .name("阿巴阿巴")
                .user_name("olouca")
                .password("123456")
                .build();
        int result = userMapper.insert(user);
        System.err.println("result = " + result);
    }

    @Test
    void name() {
    }
}