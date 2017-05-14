package cn.myheibai.blog.pojo;

import cn.myheibai.blog.service.LogService;
import cn.myheibai.blog.service.LogServiceImpl;

import java.sql.Timestamp;

/**
 * Created by lhr on 2017/5/8.
 */
public class Ser {
    public String Error0 = "操作成功！";
    public String Error10000 = "参数错误！";
    public String Error10001 = "未知错误，已上报管理员！";
    public String Error10002 = "服务器异常！";
    public String Error10003 = "操作失败！";

    public static void insertLog(String value, String ip, int type, long admin){
        LogService logService = new LogServiceImpl();
        Log log = new Log();
        log.setValue(value);
        log.setAdmin(admin);
        log.setIp(ip);
        log.setTime(new Timestamp(new java.util.Date().getTime()));
        log.setType((long) type);
        logService.insertLog(log);
    }
}
