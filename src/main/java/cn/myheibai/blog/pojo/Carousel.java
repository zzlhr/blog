package cn.myheibai.blog.pojo;

public class Carousel {
  private Long id;
  private String carousel_title;
  private String carousel_filename;
  private String carousel_url;
  private String carousel_describe;
  private Long carousel_compositor;

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public String getCarousel_title() {
    return carousel_title;
  }

  public void setCarousel_title(String carousel_title) {
    this.carousel_title = carousel_title;
  }

  public String getCarousel_filename() {
    return carousel_filename;
  }

  public void setCarousel_filename(String carousel_filename) {
    this.carousel_filename = carousel_filename;
  }

  public String getCarousel_url() {
    return carousel_url;
  }

  public void setCarousel_url(String carousel_url) {
    this.carousel_url = carousel_url;
  }

  public String getCarousel_describe() {
    return carousel_describe;
  }

  public void setCarousel_describe(String carousel_describe) {
    this.carousel_describe = carousel_describe;
  }

  public Long getCarousel_compositor() {
    return carousel_compositor;
  }

  public void setCarousel_compositor(Long carousel_compositor) {
    this.carousel_compositor = carousel_compositor;
  }
}
