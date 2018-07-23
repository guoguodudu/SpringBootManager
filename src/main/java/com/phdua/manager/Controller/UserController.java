package com.phdua.manager.Controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 〈一句话功能简述〉<br>
 * 〈〉
 *
 * @author yinghuo
 * @create 9:16 2018/7/23
 * @since
 */
@RestController
@RequestMapping("/user/")
public class UserController {

    @RequestMapping("test")
    public  String UserTest(){
        return "123";
    }
}
