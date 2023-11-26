package com.itheima.test;

import com.itheima.beans.OtherBean;
import com.itheima.beans.XxxBean;
import com.itheima.dao.PersonDao;
import com.itheima.dao.UserDao;
import com.itheima.service.UserService;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import javax.xml.crypto.Data;
import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.text.SimpleDateFormat;

/**
 * @author hhm
 * @version 1.0
 */
public class ApplicationContextTest {
    public static void main(String[] args) throws Exception {


        ClassPathXmlApplicationContext applicationContext=new ClassPathXmlApplicationContext("applicationContext.xml");
        UserService userService = applicationContext.getBean(UserService.class);
        userService.show();

//        UserDao userDao = (UserDao) applicationContext.getBean("userDao");
//        userDao.show();
//        OtherBean otherBean = applicationContext.getBean(OtherBean.class);
//        XxxBean xxxBean = applicationContext.getBean(XxxBean.class);
//        System.out.println(otherBean);
//        System.out.println(xxxBean);

//        SqlSession sqlSession = sqlSessionFactory.openSession();
//        System.out.println(sqlSession);

        //============================================================================
//        //静态工厂方法方式
//        InputStream in = Resources.getResourceAsStream("mybatis-config.xml");
//        //无参构造实例化
//        SqlSessionFactoryBuilder builder = new SqlSessionFactoryBuilder();
//        //实例工厂方法
//        SqlSessionFactory sqlSessionFactory = builder.build(in);

//        SimpleDateFormat simpleDateFormat=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
//        Data date=simpleDateFormat.parse("2023-08-27 12:00:00");

//        //第一步加载驱动
//        Class.forName("com.mysql.jdbc.Driver");//静态工厂方式
//        //第二步获得connection
//        Connection connection = DriverManager.getConnection("", "", "");



//        DruidDataSource dataSourse=new DruidDataSource();
//        dataSourse.setDriverClassName();//驱动名称
//        dataSourse.setUrl();//数据库地址
//        dataSourse.setUserName();//数据库用户名
//        dataSourse.setPassword();//数据库密码

        


    }
}
