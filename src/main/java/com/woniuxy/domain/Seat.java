package com.woniuxy.domain;

import java.io.Serializable;

import lombok.Data;

@Data
public class Seat implements Serializable {
    private Integer sid;

    private Integer rid;

    private String sstate;

    private String srow;

    private String scolumn;

 
}