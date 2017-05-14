package cn.myheibai.blog.service;

import cn.myheibai.blog.dao.ArticleDao;
import cn.myheibai.blog.dao.ArticleDaoImpl;
import cn.myheibai.blog.pojo.Article;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by lhr on 2017/4/20.
 */
public class ArticleServiceImpl implements ArticleService{
    ArticleDao articleDao = new ArticleDaoImpl();
    static Map map = new HashMap();
    static {
        map.put("static", "0");
        map.put("msg","操作成功！");
    }
    @Override
    public List<Article> getArticleList(String keyword, int pageNumber, int pageSize) {
        Map selectMap = new HashMap();
        if (pageNumber == 0){
            pageNumber = 1;
        }
        if (pageSize == 0){
            pageSize = 5;
        }
        int begin = (pageNumber - 1)*pageSize;
        int end = begin + pageSize -1;
        selectMap.put("keyword", keyword);
        selectMap.put("begin", begin);
        selectMap.put("end", end);
        return articleDao.getArticleList(selectMap);
    }

    @Override
    public Article findArticleById(int id) {
        return articleDao.findArticleById(id);
    }

    @Override
    public Map addArticle(Article article)  {
        articleDao.addArticle(article);
        return map;
    }

    @Override
    public Map deleteArticle(int id)  {
        articleDao.deleteArticle(id);
        return map;
    }

    @Override
    public Map updateArticle(Article article) {
        if (article.getId()==0){
            Map map1 = new HashMap();
            map1.put("status", "10000");
            map1.put("msg","参数错误！");
            return map1;
        }
        Article article1 = articleDao.findArticleById(Integer.parseInt(String.valueOf(article.getId())));
        String sql = " ";
        if (article.getArticle_title() != null){
            sql += " article_title='"+article.getArticle_title()+"',";
        }
        if (article.getArticle_text() != null){
            sql += " article_text='"+article.getArticle_text()+"',";
        }
        if (article.getArticle_picture() != null){
            sql += " article_picture='"+article.getArticle_picture()+"',";
        }
        if (article.getArticle_keyword() != null){
            sql += " article_keyword='"+article.getArticle_keyword()+"',";
        }
        if (article.getArticle_describe() != null){
            sql += " article_describe='"+article.getArticle_describe()+"',";
        }
        if (article.getArticle_time() != null){
            sql += " article_time='"+article.getArticle_time()+"',";
        }
        if (article.getArticle_status() != article1.getArticle_status() && article.getArticle_status() != null){
            sql += " article_status='"+article.getArticle_status()+"',";
        }
        if (article.getArticle_click() != article1.getArticle_click() && article.getArticle_click() != null){
            sql += "article_click='"+article.getArticle_click()+"',";
        }
        if (article.getArticle_commend() != article1.getArticle_commend() && article.getArticle_commend() != null){
            sql += "article_commend='"+article.getArticle_commend()+"',";
        }
        if (article.getArticle_praise() != article1.getArticle_praise() && article.getArticle_commend() != null){
            sql += "article_praise='"+article.getArticle_praise()+"',";
        }
        sql = sql.substring(0,sql.length()-1);
        articleDao.updateArticle(sql,Integer.parseInt(String.valueOf(article.getId())));
        return map;
    }

    @Override
    public List<Article> getCommendArticle(int location) {
//        if (location <= 0){
//            map.put("status","10001");
//            map.put("msg", "错误的推荐位置！");
//            return map;
//        }
        return articleDao.getCommendArticle(location);
    }

    public static void main(String[] agrs){
        ArticleService articleService = new ArticleServiceImpl();
        articleService.findArticleById(17);
    }
}
