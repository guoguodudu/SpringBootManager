package com.phdua.manager.service.impl.user;


import com.phdua.manager.BaseTest;
import com.rabbitmq.client.Channel;
import com.rabbitmq.client.Connection;
import com.rabbitmq.client.ConnectionFactory;
import org.junit.Test;
import org.springframework.util.StringUtils;

import java.util.Date;
import java.util.UUID;

/**
 * 〈一句话功能简述〉<br>
 * 〈〉
 *
 * @author yinghuo
 * @create 10:38 2018/7/25
 * @since
 */
public class MQ extends BaseTest {

    @Test
    public void mqtest()  {
        StringBuffer code=new StringBuffer();
        code.append("P").append(Math.abs(UUID.randomUUID().getMostSignificantBits()));
        System.out.println("code = " + code);
    }


}
