package com.phdua.manager.service.impl.user;

import com.phdua.manager.ApplicationTests;
import com.phdua.manager.BaseTest;
import com.phdua.manager.mapper.UserMapper;
import com.phdua.manager.service.user.IUserService;
import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import tk.mybatis.mapper.common.Mapper;

import static org.junit.Assert.*;

/**
 * 〈一句话功能简述〉<br>
 * 〈〉
 *
 * @author yinghuo
 * @create 11:03 2018/7/23
 * @since
 */

public class UserServiceImplTest extends BaseTest{
    @Autowired
    private IUserService iUserService;



    @Test
    public void getUserList() throws Exception {
        System.out.println("true = " + iUserService.getUserList().get(0).toString());
    }

}