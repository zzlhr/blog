package cn.myheibai;

import cn.myheibai.blog.pojo.*;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.mapping.Environment;
import org.apache.ibatis.session.Configuration;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.apache.ibatis.transaction.TransactionFactory;
import org.apache.ibatis.transaction.jdbc.JdbcTransactionFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import javax.sql.DataSource;
import java.io.IOException;
import java.io.Reader;

/**
 * Created by 23883 on 2017-04-19.
 */
public class MyBaitsHelper {
    private static SqlSessionFactory sqlSessionFactory;
    private static SqlSession session;
    static{
        String resource = "applicationContext.xml";
        Reader reader = null;
        try {
            reader = Resources.getResourceAsReader(resource);
        } catch (IOException e) {
            e.printStackTrace();
        }
        sqlSessionFactory = new SqlSessionFactoryBuilder().build(reader);
    }
    public static SqlSession getSession(){
        session = sqlSessionFactory.openSession();
        return session;
    }
}
