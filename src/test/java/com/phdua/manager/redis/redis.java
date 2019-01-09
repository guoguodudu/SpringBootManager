package com.phdua.manager.redis;

import com.phdua.manager.BaseTest;
import com.phdua.manager.service.user.IUserService;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class redis extends BaseTest{
    @Autowired
    private IUserService iUserService;

    @Autowired
    private RedisClient<String> client = null;

    @Test
    public void getUserList() throws Exception {
        System.out.println("true = " + iUserService.getUserList().get(0).toString());

        client.set("ll","PP",10 * 1000L);


        System.out.println("true = " + client.get("ll"));
    }

}
