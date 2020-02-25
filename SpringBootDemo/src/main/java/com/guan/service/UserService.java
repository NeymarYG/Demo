package com.guan.service;

import com.guan.mapper.UserMapper;
import com.guan.pojo.User;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;

/**
 * @author guan
 * @date 2020/2/12- 22:36
 */
@Service
public class UserService {

    @Resource
    private UserMapper userMapper;

    //根据id查询用户
    public User queryById(int id) {
        return userMapper.selectByPrimaryKey(id);
    }

    //新增用户
    @Transactional                              //事物  需要jdbc的依赖
    public void saveUser(User user) {                 //这里进行了多个数据库操作,只要有一个不成功就回滚,成功就提交
        System.out.println("新增用户...小小娟");

        //选择性新增; 如果属性为空则该属性不会出现在inserts属性上
        userMapper.insertSelective(user);
    }
}
