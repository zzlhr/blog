package cn.myheibai.blog.dao;

import cn.myheibai.MyBaitsHelper;
import cn.myheibai.blog.pojo.Article;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.SqlSession;

import java.util.List;
import java.util.Map;

/**
 * Created by 23883 on 2017-04-19.
 */
public class ArticleDaoImpl implements ArticleDao{
    SqlSession session;
    private ArticleDao articleDao;
    public ArticleDaoImpl(){
        session = MyBaitsHelper.getSession();
        articleDao = session.getMapper(ArticleDao.class);
    }

    @Override
    public Article findArticleById(int id) {
        return articleDao.findArticleById(id);
    }

    @Override
    public void addArticle(Article article) {
        articleDao.addArticle(article);
        session.commit();
    }

    @Override
    public void deleteArticle(int articleId) {
        articleDao.deleteArticle(articleId);
        session.commit();
    }

    @Override
    public void updateArticle(@Param("sql") String sql, @Param("id") int id) {
        articleDao.updateArticle(sql,id);
        session.commit();
    }


    @Override
    public List<Article> getArticleList(Map selectMap) {
        return articleDao.getArticleList(selectMap);
    }

    @Override
    public List<Article> getCommendArticle(int location) {
        return articleDao.getCommendArticle(location);
    }

//    @Override
//    public List<Article> getArticleList(Map selectMap) {
//        return articleDao.getArticleList(selectMap);
//    }


}
