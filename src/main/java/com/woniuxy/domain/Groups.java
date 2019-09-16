package com.woniuxy.domain;

import java.io.Serializable;

import lombok.Data;

@Data
public class Groups implements Serializable{
    private Integer gid;

    private String gname;

    private String ginfo;

    private Integer pid;

}