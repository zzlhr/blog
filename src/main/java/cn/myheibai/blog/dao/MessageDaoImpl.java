package cn.myheibai.blog.dao;

import cn.myheibai.MyBaitsHelper;
import cn.myheibai.blog.pojo.Message;
import org.apache.ibatis.session.SqlSession;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by 23883 on 2017-04-23.
 */
public class MessageDaoImpl implements MessageDao {
    SqlSession session;
    private MessageDao messageDao;
    public MessageDaoImpl(){
        session = MyBaitsHelper.getSession();
        messageDao = session.getMapper(MessageDao.class);
    }
    @Override
    public void addMessage(Message message) {
        messageDao.addMessage(message);
        session.commit();
    }

    @Override
    public void updateMessage(Message message) {
        messageDao.updateMessage(message);
        session.commit();
    }

    @Override
    public void deleteMessage(long id) {
        messageDao.deleteMessage(id);
        session.commit();
    }

    @Override
    public List<Message> findMessage(int pageNumber, int pageSize) {
        return messageDao.findMessage(pageNumber,pageSize);
    }

    @Override
    public List<Message> findReMessage(int fid, int begin, int end) {
        List<Message> list = new ArrayList<>();
        if (fid == 0){
            return list;
        }
        System.out.println("fid:"+fid);
        return messageDao.findReMessage(fid,begin,end);
    }


    public static void main(String[] args){
//        MessageDao messageDao = new MessageDaoImpl();
//        Message message = new Message();
//        message.setId((long) 33);
//        message.setMessage_ip("127.0.0.2");
//        message.setMessage_name("test");
//        message.setMessage_time(new java.sql.Timestamp(new Date().getTime()));
//        message.setMessage_value("测试");
//        messageDao.findMessage(1,5);
    }
}
