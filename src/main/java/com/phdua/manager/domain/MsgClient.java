package com.phdua.manager.domain;

import cn.afterturn.easypoi.excel.annotation.Excel;
import lombok.Data;

import java.util.Date;

/**
 * 〈一句话功能简述〉<br>
 * 〈〉
 *
 * @author yinghuo
 * @create 19:15 2018/7/23
 * @since
 */
@Data
public class MsgClient {
    @Excel(name = "总数", width = 35)
    private String id;
    @Excel(name = "总数", width = 35)
    private Date birthday;
    @Excel(name = "总数", width = 35)
    private String name;
    @Excel(name = "总数", width = 35)
    private  String remark;
}
