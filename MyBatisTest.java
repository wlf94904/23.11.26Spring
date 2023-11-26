package com.itheima.test;

import com.itheima.mapper.UserMapper;
import com.itheima.pojo.User;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

/**
 * @author hhm
 * @version 1.0
 */
public class MyBatisTest {
    public static void main(String[] args) throws Exception {
        //加载配置文件
        InputStream in = Resources.getResourceAsStream("mybatis.config.xml");
        //创建SqlSessionFactoryBuilder
        SqlSessionFactoryBuilder builder = new SqlSessionFactoryBuilder();
        //用builder去build
        SqlSessionFactory sqlSessionFactory = builder.build(in);
        SqlSession sqlSession = sqlSessionFactory.openSession();
        //获取UserMapper
        UserMapper mapper = sqlSession.getMapper(UserMapper.class);
        //上面得到了一个mapper，然后mapper去进行操作
        List<User> all = mapper.findAll();
        for (User user : all) {
            System.out.println(user);
        }


    }
}
