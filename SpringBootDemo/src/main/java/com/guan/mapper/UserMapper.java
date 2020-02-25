package com.guan.mapper;

import com.guan.pojo.User;
import tk.mybatis.mapper.common.Mapper;

/**
 * @author guan
 * @date 2020/2/13- 15:54
 */
public interface UserMapper extends Mapper<User> {
                                    //继承通用mapper接口, 可以指定实体泛型
}
