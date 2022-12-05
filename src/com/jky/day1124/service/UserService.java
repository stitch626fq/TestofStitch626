package com.jky.day1124.service;

import com.jky.day1124.dao.UserDao;
import com.jky.day1124.entity.User;
import com.jky.day1124.utils.JDBCUtils;

import java.sql.SQLException;

public class UserService {
    public UserDao dao=new UserDao();
    //注册
    public boolean register(User user) {
        int i= 0;
        try {
            i = dao.insertUser(user);
            return i>0?true:false;
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            JDBCUtils.close();
        }
        return false;
    }

    public User login(String name, String pwd) {
        User user=null;
        try {
            user=dao.selectOne(name, pwd);
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            JDBCUtils.close();
        }
        return user;
    }
}
