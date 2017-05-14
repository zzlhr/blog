package cn.myheibai.blog.service;

import cn.myheibai.blog.dao.LogDao;
import cn.myheibai.blog.dao.LogDaoImpl;
import cn.myheibai.blog.pojo.Ser;
import cn.myheibai.blog.pojo.Log;
import java.util.List;

/**
 * Created by lhr on 2017/5/8.
 */
public class LogServiceImpl extends Ser implements LogService {
    LogDao logDao = new LogDaoImpl();
    @Override
    public void insertLog(Log log) {
        logDao.insertLog(log);
    }

    @Override
    public List<Log> getLogList(int pageNumber, int pageSize) {
        return logDao.getLogList((pageNumber-1)*pageSize,pageNumber*pageSize);
    }
}
