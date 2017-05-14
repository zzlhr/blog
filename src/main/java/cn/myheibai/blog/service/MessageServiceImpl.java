package cn.myheibai.blog.service;

import cn.myheibai.blog.dao.MessageDao;
import cn.myheibai.blog.dao.MessageDaoImpl;
import cn.myheibai.blog.pojo.Message;
import cn.myheibai.blog.pojo.Ser;
import cn.myheibai.blog.util.JSONUtil;
import org.json.JSONException;
import org.json.JSONObject;

import javax.servlet.http.HttpServletRequest;
import java.lang.reflect.InvocationTargetException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by lhr on 2017/5/8.
 */
public class MessageServiceImpl extends Ser implements MessageService {
    HttpServletRequest httpServletRequest;
    JSONObject jsonObject = new JSONObject();
    public MessageServiceImpl(HttpServletRequest httpServletRequest){
        this.httpServletRequest = httpServletRequest;
        try {
            this.jsonObject.put("msg","操作成功！");
            this.jsonObject.put("status","0");
        } catch (JSONException e) {
            e.printStackTrace();
        }

    }
    MessageDao messageDao = new MessageDaoImpl();
    @Override
    public JSONObject addMessage(Message message) {
        try {
            messageDao.addMessage(message);
            jsonObject.put("status","0");
            jsonObject.put("msg",Error0);
            return jsonObject;
        }catch (Exception e){
            insertLog("添加留言失败",httpServletRequest.getContextPath(),1,0);
            try {
                jsonObject.put("status","10003");
                jsonObject.put("msg",Error10003);
            } catch (JSONException e1) {
                e1.printStackTrace();
            }
            return jsonObject;
        }
    }

    @Override
    public JSONObject updateMessage(Message message) {
        messageDao.updateMessage(message);
        return jsonObject;
    }

    @Override
    public JSONObject deleteMessage(long id) {
        messageDao.deleteMessage(id);
        return jsonObject;
    }

    @Override
    public List findMessage(int begin, int end) throws JSONException {
        List<Message> messages = messageDao.findMessage(begin,end);
        List<Map> list = new ArrayList<>();
        for (int i  = 0; i<messages.size();i++){
            Message message = messages.get(i);
            Map map = new HashMap();
            try {
                map = JSONUtil.objectToMap(message);
                List<Message> remessage = messageDao.findReMessage(Math.toIntExact(message.getId()),0,5);
                map.put("remessage",remessageString(remessage));
            } catch (NoSuchMethodException e) {
                e.printStackTrace();
            } catch (InvocationTargetException e) {
                e.printStackTrace();
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            }
            list.add(map);
        }
        return list;
    }

    @Override
    public List<Message> findReMessage(int fid, int begin, int end) {
        return messageDao.findReMessage(fid,begin,end);
    }
    public List<Map> messageToMap(List<Message> messages) throws NoSuchMethodException, IllegalAccessException, InvocationTargetException {
        List<Map> list = new ArrayList<>();
        for (Message message :messages){
            list.add(JSONUtil.objectToMap(message));
        }
        return list;
    }

    public static String remessageString(List<Message> messages){
        String model = "<ul class=\"list-group\">\n" +
                "           <li class=\"list-group-item\"><label class=\"bg-danger\">#{name}</label>\n" +
                "                于 <span>#{time}</span> 回复：<span>#{value}</span>\n" +
                "           </li>\n" +
                "       </ul>";
        String value = "";
        SimpleDateFormat dateformat=new SimpleDateFormat("yyyy-MM-dd HH:mm");
        for (Message message : messages){
            value += model.replace("#{name}",message.getMessage_name())
                    .replace("#{time}",dateformat.format(message.getMessage_time())+"")
                    .replace("#{value}",message.getMessage_value());
        }
        System.out.println(value);
        return value;
    }
}
