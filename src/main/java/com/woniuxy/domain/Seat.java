package com.woniuxy.domain;

import java.io.Serializable;
import java.util.List;

import lombok.Data;

@Data
public class Seat implements Serializable{
    private Integer sid;

    private Object rid;

    private Object sstate;

    private String srow;

    private String scolumn;
    

    
}