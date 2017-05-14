package cn.myheibai.blog.pojo;

public class Article {
  private Long id;
  private String article_title;
  private String article_text;
  private String article_picture;
  private Long article_status;
  private String article_keyword;
  private String article_describe;
  private java.sql.Timestamp article_time;
  private Long admin_id;
  private Long article_click;
  private Long article_commend;
  private Long article_praise;
  private String class_name;

  @Override
  public String toString() {
    return "Article{" +
            "id=" + id +
            ", article_title='" + article_title + '\'' +
            ", article_text='" + article_text + '\'' +
            ", article_picture='" + article_picture + '\'' +
            ", article_status=" + article_status +
            ", article_keyword='" + article_keyword + '\'' +
            ", article_describe='" + article_describe + '\'' +
            ", article_time=" + article_time +
            ", admin_id=" + admin_id +
            ", article_click=" + article_click +
            ", article_commend=" + article_commend +
            ", article_praise=" + article_praise +
            ", class_name='" + class_name + '\'' +
            '}';
  }

  public String getClass_name() {
    return class_name;
  }

  public void setClass_name(String class_name) {
    this.class_name = class_name;
  }

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public String getArticle_title() {
    return article_title;
  }

  public void setArticle_title(String article_title) {
    this.article_title = article_title;
  }

  public String getArticle_text() {
    return article_text;
  }

  public void setArticle_text(String article_text) {
    this.article_text = article_text;
  }

  public String getArticle_picture() {
    return article_picture;
  }

  public void setArticle_picture(String article_picture) {
    this.article_picture = article_picture;
  }

  public Long getArticle_status() {
    return article_status;
  }

  public void setArticle_status(Long article_status) {
    this.article_status = article_status;
  }

  public String getArticle_keyword() {
    return article_keyword;
  }

  public void setArticle_keyword(String article_keyword) {
    this.article_keyword = article_keyword;
  }

  public String getArticle_describe() {
    return article_describe;
  }

  public void setArticle_describe(String article_describe) {
    this.article_describe = article_describe;
  }

  public java.sql.Timestamp getArticle_time() {
    return article_time;
  }

  public void setArticle_time(java.sql.Timestamp article_time) {
    this.article_time = article_time;
  }

  public Long getAdmin_id() {
    return admin_id;
  }

  public void setAdmin_id(Long admin_id) {
    this.admin_id = admin_id;
  }

  public Long getArticle_click() {
    return article_click;
  }

  public void setArticle_click(Long article_click) {
    this.article_click = article_click;
  }

  public Long getArticle_commend() {
    return article_commend;
  }

  public void setArticle_commend(Long article_commend) {
    this.article_commend = article_commend;
  }

  public Long getArticle_praise() {
    return article_praise;
  }

  public void setArticle_praise(Long article_praise) {
    this.article_praise = article_praise;
  }
}
