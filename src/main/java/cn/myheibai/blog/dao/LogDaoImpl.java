package cn.myheibai.blog.dao;

import cn.myheibai.MyBaitsHelper;
import cn.myheibai.blog.pojo.Log;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.SqlSession;

import java.util.List;

/**
 * Created by lhr on 2017/5/8.
 */
public class LogDaoImpl implements LogDao {
    SqlSession session;
    private LogDao logDao;
    public LogDaoImpl(){
        session = MyBaitsHelper.getSession();
        logDao = session.getMapper(LogDao.class);
    }
    @Override
    public void insertLog(@Param("log") Log log) {
        logDao.insertLog(log);
    }

    @Override
    public List<Log> getLogList(@Param("begin") int begin, @Param("end") int end) {
        return logDao.getLogList(begin,end);
    }
}
