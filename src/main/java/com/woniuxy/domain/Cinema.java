package com.woniuxy.domain;

import lombok.Data;



@Data       
public class Cinema {
    private Integer cid; 

    private String cname;

    private String clogo;

    private String ccoperight;

    private String caddress;   
   
    private String cfacility;

    private String cpicture;

    private Integer pid;
    
    private Integer startLine;
    
    private Integer row;

   private Integer movid;
   private Double mprice;
}