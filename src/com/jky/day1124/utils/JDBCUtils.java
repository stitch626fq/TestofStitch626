package com.jky.day1124.utils;

import com.mchange.v2.c3p0.ComboPooledDataSource;

import java.sql.Connection;
import java.sql.SQLException;

/**
 * @version 1.0
 * @Description JDBC工具类 - 封装连接及关闭操作
 */
public class JDBCUtils {

    //C3P0数据源
    private static ComboPooledDataSource dataSource = new ComboPooledDataSource("mysql");

    public static ComboPooledDataSource getDataSource(){
        return dataSource;
    }

    //线程变量  key存储ThreadLocal  value存储Connection连接对象
    private static ThreadLocal<Connection> tl = new ThreadLocal<>();

    //获得连接的方法
    public static Connection getConn(){
        Connection connection = tl.get();
        try {
            if(connection==null || connection.isClosed()){
                connection = dataSource.getConnection();
                tl.set(connection);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return connection;
    }

    //归还连接的方法
    public static void close(){
        Connection connection = tl.get();
        if(connection!=null){
            try {
                connection.close();
                tl.remove();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}
