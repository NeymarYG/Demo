package com.guan.pojo;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @author guan
 * @date 2020/2/11- 21:44
 */

//@Slf4j
@Data
@Table(name = "user")           //表名   一般加表名和@Id主键就可以了
public class User {

    //可以用log

//  @KeySql(useGeneratedKeys = true)        //主键回填
    @Id                                     //表的主键
    private int u_id;

//    @Column                         //实体类可以按照驼峰命名  u_username --→ uUsername
    private String u_username;

//    @Column(name = "u_password")      //也可以指定字段名 赋值
    private String u_password;
}



