package com.woniuxy.domain;

import java.util.Date;

import lombok.Data;
@Data
public class Ticket {
    private Integer tid;

    private Integer uid;

    private Integer movid;

    private Integer cid;

    private Integer rid;

    private Integer oid;

    private Integer srow;

    private Integer scolumn;

    private Double tprice;

    private Date treservetime;

    private Date tlosetime;

    private String tstate;

    
}