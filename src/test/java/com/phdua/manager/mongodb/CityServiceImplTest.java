package com.phdua.manager.mongodb;

import cn.afterturn.easypoi.excel.ExcelExportUtil;
import cn.afterturn.easypoi.excel.entity.ExportParams;
import com.phdua.manager.BaseTest;
import com.phdua.manager.exportandimport.domain.MsgClient;
import com.phdua.manager.mongodb.domain.City;
import com.phdua.manager.mongodb.domain.User;
import com.phdua.manager.mongodb.handler.CityHandler;
import com.phdua.manager.service.user.IUserService;
import com.phdua.manager.service.user.IUserTransactionalService;
import org.apache.poi.ss.usermodel.Workbook;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import reactor.core.publisher.Mono;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * 〈一句话功能简述〉<br>
 * 〈〉
 *
 * @author yinghuo
 * @create 11:03 2018/7/23
 * @since
 */

public class CityServiceImplTest extends BaseTest{


    @Autowired
    private CityHandler cityHandler;

    @Autowired
     private IUserTransactionalService iUserTransactionalService;

 /*   @Test
    public void getUserList() throws Exception {
        System.out.println("true = " + iUserService.getUserList().get(0).toString());
    }*/


    @Test
    public void insertUserList() throws Exception {
      //  System.out.println("insert true = " + iUserService.insertUser());

        User user=new User();

        user.setAge("12");
        user.setName("345");
        List<User> userList=new ArrayList<>();

        userList.add(user);
        userList.add(user);
            City city = new City();
            city.setCityName("123");
            city.setDescription("234");
            city.setId(101L);
            city.setProvinceId(104L);
            Mono<City> ll = cityHandler.save(city);
           ll.block();

        Mono<City> cityMono=cityHandler.findCityById(1L);
        System.out.println("cityHandler = " + cityMono.block().toString());
       // System.out.println("update true = " + iUserTransactionalService.updateInsertUser());
    }

   /* @Test
    public void insertUserList() throws Exception {
        System.out.println("insert true = " + iUserService.insertUser());
        System.out.println("update true = " + iUserService.updateUser());
    }*/




}