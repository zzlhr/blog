package cn.myheibai.blog.dao;

import cn.myheibai.blog.pojo.Log;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * Created by lhr on 2017/5/8.
 */
public interface LogDao {
    @Insert("INSERT SET log values(null,${log.type},${log.valuye},${log.time},${log.ip},${log.admin}})")
    void insertLog(@Param("log") Log log);

    @Select("SELECT * FROM log LIMIT ${begin},${end}")
    List<Log> getLogList(@Param("begin") int begin, @Param("end") int end);
}
