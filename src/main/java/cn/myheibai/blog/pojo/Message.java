package cn.myheibai.blog.pojo;

public class Message {
  private Long id;
  private String message_name;
  private java.sql.Timestamp message_time;
  private String message_value;
  private Long message_fid;
  private Long message_replaynum;
  private String message_ip;

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public String getMessage_name() {
    return message_name;
  }

  public void setMessage_name(String message_name) {
    this.message_name = message_name;
  }

  public java.sql.Timestamp getMessage_time() {
    return message_time;
  }

  public void setMessage_time(java.sql.Timestamp message_time) {
    this.message_time = message_time;
  }

  public String getMessage_value() {
    return message_value;
  }

  public void setMessage_value(String message_value) {
    this.message_value = message_value;
  }

  public Long getMessage_fid() {
    return message_fid;
  }

  public void setMessage_fid(Long message_fid) {
    this.message_fid = message_fid;
  }

  public Long getMessage_replaynum() {
    return message_replaynum;
  }

  public void setMessage_replaynum(Long message_replaynum) {
    this.message_replaynum = message_replaynum;
  }

  public String getMessage_ip() {
    return message_ip;
  }

  public void setMessage_ip(String message_ip) {
    this.message_ip = message_ip;
  }
}
