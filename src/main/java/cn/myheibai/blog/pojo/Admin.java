package cn.myheibai.blog.pojo;


public class Admin {
  private Long id;
  private String admin_name;
  private String admin_password;
  private String admin_token;
  private Long admin_status;
  private String admin_ip;

  @Override
  public String toString() {
    return "Admin{" +
            "id=" + id +
            ", admin_name='" + admin_name + '\'' +
            ", admin_password='" + admin_password + '\'' +
            ", admin_token='" + admin_token + '\'' +
            ", admin_status=" + admin_status +
            ", admin_ip='" + admin_ip + '\'' +
            '}';
  }

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public String getAdmin_name() {
    return admin_name;
  }

  public void setAdmin_name(String admin_name) {
    this.admin_name = admin_name;
  }

  public String getAdmin_password() {
    return admin_password;
  }

  public void setAdmin_password(String admin_password) {
    this.admin_password = admin_password;
  }

  public String getAdmin_token() {
    return admin_token;
  }

  public void setAdmin_token(String admin_token) {
    this.admin_token = admin_token;
  }

  public Long getAdmin_status() {
    return admin_status;
  }

  public void setAdmin_status(Long admin_status) {
    this.admin_status = admin_status;
  }

  public String getAdmin_ip() {
    return admin_ip;
  }

  public void setAdmin_ip(String admin_ip) {
    this.admin_ip = admin_ip;
  }
}
