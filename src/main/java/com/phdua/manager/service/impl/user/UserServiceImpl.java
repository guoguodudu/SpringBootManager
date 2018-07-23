package com.phdua.manager.service.impl.user;

import com.phdua.manager.domain.User;
import com.phdua.manager.mapper.UserMapper;
import com.phdua.manager.service.user.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 〈一句话功能简述〉<br>
 * 〈〉
 *
 * @author yinghuo
 * @create 10:56 2018/7/23
 * @since
 */
@Service
public class UserServiceImpl implements IUserService {
    @Autowired
    private UserMapper userMapper;
    @Override
    public List<User> getUserList() {
        return userMapper.selectAll();
    }
}
