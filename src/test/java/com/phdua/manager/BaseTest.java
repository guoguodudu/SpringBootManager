package com.phdua.manager;

import org.junit.After;
import org.junit.Before;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.context.web.WebAppConfiguration;

/**
 * 〈一句话功能简述〉<br>
 * 〈〉
 *
 * @author yinghuo
 * @create 11:44 2018/7/23
 * @since
 */
@RunWith(SpringRunner.class)
@SpringBootTest
@WebAppConfiguration
public class BaseTest {

    @Before
    public void init() {
        System.out.println("开始测试-----------------");
    }
    @After
    public void after() {
        System.out.println("结束测试-----------------");
    }
}
