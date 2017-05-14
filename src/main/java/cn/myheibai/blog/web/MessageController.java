package cn.myheibai.blog.web;


import cn.myheibai.blog.pojo.Message;
import cn.myheibai.blog.service.MessageService;
import cn.myheibai.blog.service.MessageServiceImpl;
import cn.myheibai.blog.util.ServerUtil;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by lhr on 2017/5/12.
 */

@RestController
@RequestMapping("/message")
public class MessageController {
    Map map = new HashMap();
    @RequestMapping(value = "/sendmessage", method = RequestMethod.POST)
    public Map sendMessage(@RequestParam("name")String name,@RequestParam("link")String link,
                           @RequestParam("fid")long fid,@RequestParam("value")String value,
                           HttpServletRequest req){
        MessageService messageService = new MessageServiceImpl(req);
        Message message = new Message();
        message.setMessage_name(name);
        message.setMessage_time(new java.sql.Timestamp(new Date().getTime()));
        message.setMessage_fid(fid);
        message.setMessage_ip(ServerUtil.getLocalIp(req));
        message.setMessage_value(value);
        message.setMessage_link(link);
        message.setMessage_replaynum((long) 0);
        System.out.println(ServerUtil.getLocalIp(req));
        messageService.addMessage(message);
        map.put("status",0);
        map.put("msg","操作成功！");
        return map;
    }
}
