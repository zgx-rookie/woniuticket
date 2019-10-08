package com.woniuxy.domain;

import java.util.List;

import lombok.Data;

@Data
public class Room {
    private Integer rid;

    private Integer cid;

    private String rname;

    private Integer rcount;
    
    private List<Seat> seats;

    private Integer startLine;
}