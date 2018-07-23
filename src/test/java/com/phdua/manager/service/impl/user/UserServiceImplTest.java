package com.phdua.manager.service.impl.user;

import cn.afterturn.easypoi.excel.ExcelExportUtil;
import cn.afterturn.easypoi.excel.entity.ExportParams;
import com.phdua.manager.BaseTest;
import com.phdua.manager.domain.MsgClient;
import com.phdua.manager.service.user.IUserService;
import org.apache.poi.ss.usermodel.Workbook;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

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

public class UserServiceImplTest extends BaseTest{
    @Autowired
    private IUserService iUserService;



    @Test
    public void getUserList() throws Exception {
        System.out.println("true = " + iUserService.getUserList().get(0).toString());
    }

    @Test
    public void export() throws IOException {
        List<MsgClient> list = new ArrayList<MsgClient>();
        Workbook workbook = null;
        Date start = new Date();
        ExportParams params = new ExportParams("大数据测试", "测试");
        for (int i = 0; i < 10000000; i++) {  //一百万数据量
            MsgClient client = new MsgClient();
            client.setBirthday(new Date());
            client.setName("小明" + i);
            client.setId("1"+i);
            list.add(client);
            client.setRemark("测试" + i);
            MsgClientGroup group = new MsgClientGroup();
            group.setGroupName("测试" + i);
            client.setGroup(group);
            list.add(client);
            if(list.size() == 10000){
                workbook = ExcelExportUtil.exportBigExcel(params, MsgClient.class, list);
                list.clear();
            }
        }
        ExcelExportUtil.closeExportBigExcel();
        System.out.println(new Date().getTime() - start.getTime());
        File savefile = new File("D:/excel/");
        if (!savefile.exists()) {
            savefile.mkdirs();
        }
        FileOutputStream fos = new FileOutputStream("D:/excel/ExcelExportBigData.bigDataExport.xlsx");
        workbook.write(fos);
        fos.close();
    }

    @Test
    public void  export2() throws IOException {
        List<MsgClient> list = new ArrayList<MsgClient>();
        Workbook workbook = null;
        ExportParams params = new ExportParams("大数据测试", "测试");
        for (int i = 0; i < 10000000; i++) {  //一百万数据量
            MsgClient client = new MsgClient();
            client.setBirthday(new Date());
            client.setName("小明" + i);
            client.setId("1"+i);
            list.add(client);
            list.add(client);
        }
        workbook = ExcelExportUtil.exportExcel(params,MsgClient.class,list);
        File savefile = new File("D:/excel/");
        if (!savefile.exists()) {
            savefile.mkdirs();
        }
        FileOutputStream fos = new FileOutputStream("D:/excel/ExcelExportBigData.bigDataExport.xlsx");
        workbook.write(fos);
        fos.close();

    }


}