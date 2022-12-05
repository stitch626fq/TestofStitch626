package com.jky.day1124.listener;


import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;
import javax.servlet.http.HttpSessionAttributeListener;
import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;
import javax.servlet.http.HttpSessionBindingEvent;
import java.sql.SQLException;

/**
 * 如何定义一个监听器
 * 1.新建Java类 implements 监听器
 * 2.使用@WebListener()注解
 */
@WebListener()
public class MyServletContextListener implements ServletContextListener {
    // Public constructor is required by servlet spec
    public MyServletContextListener() {
        System.out.println("MyServletContextListener 实例化");
    }

    // -------------------------------------------------------
    // ServletContextListener implementation
    // -------------------------------------------------------
    public void contextInitialized(ServletContextEvent event) {
      /* This method is called when the servlet context is
         initialized(when the Web application is deployed).
         You can initialize servlet context related data here.
      */
        System.out.println("容器启动 - 上下文对象创建");
    }


    public void contextDestroyed(ServletContextEvent event) {
      /* This method is invoked when the Servlet Context
         (the Web application) is undeployed or
         Application Server shuts down.
      */
        System.out.println("容器关闭 - 上下文对象销毁");
    }
}

