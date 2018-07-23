package com.phdua.manager.domain;

import lombok.Data;

import javax.annotation.sql.DataSourceDefinition;
import javax.persistence.*;
import java.io.Serializable;

@Data
@Table(name = "sys_user")
public class User implements Serializable{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    /**
     * 用户名称
     */
    private String name;

    /**
     * 头标
     */
    private String icon;

    /**
     * 用户邮箱
     */
    private String email;

    /**
     * 登录名
     */
    private String login;

    /**
     * 密码
     */
    private String password;

    /**
     * 密码盐
     */
    private String salt;

    /**
     * 用户状态 0: disabled, 1:enabled, 其他
     */
    private Integer state;

    /**
     * 是否删除
     */
    @Column(name = "is_delete")
    private Boolean isDelete;

    @Override
    public String toString()
    {
        return "id:"+id+"  name:"+name;
    }
   }