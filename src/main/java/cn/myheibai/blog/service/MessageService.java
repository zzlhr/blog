package cn.myheibai.blog.service;

import cn.myheibai.blog.pojo.Message;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.List;

/**
 * Created by lhr on 2017/5/8.
 */
public interface MessageService {
    JSONObject addMessage(Message message);
    JSONObject updateMessage(Message message);
    JSONObject deleteMessage(long id);
    List findMessage(int begin, int end) throws JSONException;
    List<Message> findReMessage(int fid, int begin, int end);
}

