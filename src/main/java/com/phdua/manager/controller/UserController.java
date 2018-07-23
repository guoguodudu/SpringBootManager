package com.phdua.manager.controller;

import com.phdua.manager.service.user.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
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

    @Autowired
    private IUserService iUserService;
    @RequestMapping("test")
    public  String UserTest(){
        return iUserService.getUserList().toString();
    }
}
