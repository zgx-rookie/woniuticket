package com.woniuxy.domain;
/**
 * 田普旭123
 */
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

    private String username;
    
    private String minfo;
}