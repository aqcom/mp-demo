package com.itheima.sh;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.itheima.sh.mapper.UserMapper;
import com.itheima.sh.pojo.User;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

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


//    新增
/*    @Test
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
    }*/
//    修改数据
  /*  @Test
    void testUpdateById() {
        User user = User.builder()
                .age(12)
                .email("******@qq.com")
                .name("瘪三")
                .user_name("4512354")
                .password("14532")
                .build();
        int count = userMapper.updateById(user);
        System.out.println("count = " + count);
    }*/

   /* @Test
    void deleteByMap() {
        Map<String, Object> map = new HashMap<>();

//delete from tb_user where user_name = ? and age = ?
        map.put("user_name","itcast");
        map.put("age","18");

        userMapper.deleteByMap(map);
    }*/

    //使用QueryWrapper条件查询
/*    @Test
    void testWrapper1() {
        QueryWrapper<User> wrapper = new QueryWrapper<>();
        wrapper.like("user_name","伤")//模糊查询
                .eq("password","123456")//等于
                .in("age",19,25,29)//条件
                .orderByDesc("age","id");//降序，ASC是升序
        List<User> users = userMapper.selectList(wrapper);
        System.err.println("users = " + users);
    }*/

    //查询用户名为"lisi"或者年龄大于23的用户
/*    @Test
    void testWrapper2() {
        QueryWrapper<User> wrapper = new QueryWrapper<>();

        wrapper.eq("user_name","lisi")
                .or()
                .gt("age",23);
        List<User> users = userMapper.selectList(wrapper);
        System.out.println("users = " + users);
    }*/
}