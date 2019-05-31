package com.phdua.manager.mongodb.domain;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

/**
 * 城市实体类
 *
 */
@Data
@Document(collection = "City")
public class City {

    /**
     * 城市编号
     */
    @Id
    private Long id;

    /**
     * 省份编号
     */
    private Long provinceId;

    /**
     * 城市名称
     */
    private String cityName;

    /**
     * 描述
     */
    private String description;

    private List<User> users;


}
