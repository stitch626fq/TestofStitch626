package com.jky.day1124.dao;

import com.jky.day1124.entity.User;

import java.util.Date;
import java.sql.SQLException;
import java.util.List;

public class UserDao extends BaseDao<User> {

    //插入信息
    public int insertUser(User user) throws SQLException{
        String sql="insert into t_user values(null,?,?,?,?,?,?,?,default)";
        Date birthday=user.getBirthday();
        Date now=new Date();
        int age=now.getYear()-birthday.getYear();
        int i=this.update(sql,user.getName(),user.getPwd(),user.getGender(),user.getBirthday(),age+1,user.getEmail(),user.getPhoto());
        return i;
    }

    //通过姓名和密码查询用户信息
    public User selectOne(String name,String pwd) throws SQLException{
        String sql="select * from t_user where name=? and pwd=?";
        User user=this.getBean(sql,User.class,name,pwd);
        return user;
    }

    //查询所有用户信息
    public List<User> selectAll() throws SQLException {
        String sql = "select * from t_user";
        List<User> list = this.getBeanList(sql, User.class);
        return list;
    }
}
