package com.woniuxy.domain;

import java.util.Date;

import lombok.Data;
@Data
public class Orders {
    private Integer oid;

    private Integer movid;

    private Integer uid;

    private Date opaytime;

    private Double opaymoney;

    private String ostate;

   
}