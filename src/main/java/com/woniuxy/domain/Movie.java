package com.woniuxy.domain;

import java.util.Date;

import lombok.Data;
@Data
public class Movie {
    private Integer movid;

    private String minfo;

    private String mrole;

    private String mdirector;

    private String mduration;

    private Date mshowtime;

    private String mprevue;

    private String mposter;

    private Double mprice;

   
}