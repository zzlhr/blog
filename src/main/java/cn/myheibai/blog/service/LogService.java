package cn.myheibai.blog.service;

import cn.myheibai.blog.pojo.Log;
import java.util.List;

/**
 * Created by lhr on 2017/5/8.
 */
public interface LogService {
    void insertLog(Log log);

    List<Log> getLogList(int pageNumber, int pageSize);
}
