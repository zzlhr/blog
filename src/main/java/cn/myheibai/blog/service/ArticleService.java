package cn.myheibai.blog.service;

import cn.myheibai.blog.pojo.Article;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

/**
 * Created by lhr on 2017/4/20.
 */
@Service
public interface ArticleService {
    List<Article> getArticleList(String keyword, int pageNumber, int pageSize);

    Article findArticleById(int id);

    Map addArticle(Article article);

    Map deleteArticle(int id);

    Map updateArticle(Article article) ;

    List<Article> getCommendArticle(int location);
}
