package cn.myheibai.blog.pojo;

public class ArticlComment {
  private Long id;
  private Long article_id;
  private String email;
  private String name;
  private java.sql.Timestamp time;
  private String text;
  private String ip;

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public Long getArticle_id() {
    return article_id;
  }

  public void setArticle_id(Long article_id) {
    this.article_id = article_id;
  }

  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public java.sql.Timestamp getTime() {
    return time;
  }

  public void setTime(java.sql.Timestamp time) {
    this.time = time;
  }

  public String getText() {
    return text;
  }

  public void setText(String text) {
    this.text = text;
  }

  public String getIp() {
    return ip;
  }

  public void setIp(String ip) {
    this.ip = ip;
  }
}
