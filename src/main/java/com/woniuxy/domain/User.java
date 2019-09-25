package com.woniuxy.domain;

import java.util.Date;

import lombok.Data;
@Data
public class User {
    private Integer uid;

    private String username;

    private String upassword;

    private String usalt;

    private String umail;

    private String uphone;

    private String usex;

    private Date ubirthday;

    private Double ubalance;

    
}