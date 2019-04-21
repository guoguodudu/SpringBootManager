package com.phdua.manager.service.impl.user;

import com.phdua.manager.designpattern.filter.Criteria;
import com.phdua.manager.domain.User;
import com.phdua.manager.mapper.UserMapper;
import com.phdua.manager.service.user.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import tk.mybatis.mapper.entity.Example;

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

    @Override
    @Transactional(propagation = Propagation.NESTED)
    public Boolean insertUser() {

        Example example = new Example(User.class);
        Example.Criteria criteria= example.createCriteria();

        User user =new User();
        user.setEmail("");
        user.setName("123");
        userMapper.insertSelective(user);
        return true;
    }

    @Override
    @Transactional(propagation = Propagation.NESTED)
    public Boolean updateUser() {


        User user =new User();
        user.setId(36L);
        user.setName("87965768");
        user.setIcon("2q34");
        user.setEmail("2w34234");
        userMapper.updateByPrimaryKeySelective(user);
        if (true) {
            throw new RuntimeException("save 抛异常了");
        }

        return true;
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRED)
    public Boolean updateInsertUser() {

        insertUser();



        try {
            updateUser();
        } catch (Exception e) {
            System.out.println("方法回滚");
        }

        return true;
    }
}
