package com.itheima.sh.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.itheima.sh.pojo.User;
import com.itheima.sh.service.UserService;
import com.itheima.sh.mapper.UserMapper;
import org.springframework.stereotype.Service;

/**
* @author olouca
* @description 针对表【tb_user】的数据库操作Service实现
* @createDate 2023-02-19 18:01:02
*/
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User>
    implements UserService{

}




