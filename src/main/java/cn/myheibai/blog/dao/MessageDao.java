package cn.myheibai.blog.dao;

import cn.myheibai.blog.pojo.Message;
import org.apache.ibatis.annotations.*;

import java.util.List;

/**
 * Created by 23883 on 2017-04-23.
 */
public interface MessageDao {
    @Insert("INSERT INTO `message` VALUES (null,#{message.message_name},#{message.message_time}," +
            "#{message.message_value},#{message.message_fid},#{message.message_replaynum},#{message.message_ip})")
    void addMessage(@Param("message") Message message);


    @Update("UPDATE message SET message_name=#{message.message_name},message_time=#{message.message_time}," +
            "message_value=#{message.message_value},message_fid=#{message.message_fid},message_replaynum=#{message.message_replaynum}," +
            "message_ip=#{message.message_ip} WHERE id=#{message.id}")
    void updateMessage(@Param("message") Message message);

    @Delete("DELETE FROM message WHERE id=#{id}")
    void deleteMessage(@Param("id") long id);

    @Select("SELECT * FROM message WHERE message_fid=0 ORDER BY id DESC LIMIT #{begin},#{end}")
    List<Message> findMessage(@Param("begin") int begin, @Param("end") int end);

    @Select("SELECT * FROM message WHERE message_fid=${fid} ORDER BY id DESC LIMIT ${begin},${end}")
    List<Message> findReMessage(@Param("fid") int fid, @Param("begin")int begin,@Param("end")int end);
}
