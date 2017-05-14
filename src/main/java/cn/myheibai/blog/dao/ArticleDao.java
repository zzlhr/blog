package cn.myheibai.blog.dao;

import cn.myheibai.blog.pojo.Article;
import org.apache.ibatis.annotations.*;

import java.util.List;
import java.util.Map;

/**
 * Created by 23883 on 2017-04-19.
 */
public interface ArticleDao {
    @Select("select * from article_list where id = #{id}")
    Article findArticleById(int id);

//    List<Article> getArticleList(Map selectMap);
//    List<Article> getArticleList();

    @Insert("insert INTO article VALUES (#{article.id},#{article.article_title},#{article.article_text}," +
            "#{article.article_picture},#{article.article_status}," +
            "#{article.article_keyword}," +
            "#{article.article_describe},#{article.article_time},#{article.admin_id},#{article.article_click}," +
            "#{article.article_commend},#{article.article_praise})")
    @Options(useGeneratedKeys = true, keyProperty = "article.id")
//    @InsertProvider(type = Article.class, method = "addarticle")
    void addArticle(@Param("article") Article article);

    @Delete("DELETE FROM `article` WHERE `id`='${id}'")
    void deleteArticle(@Param("id") int id);

//    @UpdateProvider(type = SqlProvider.class, method = "updateArticle")
//    @Options(useGeneratedKeys = true, keyProperty = "article.id")
    @Update("update article set ${sql} where id=#{id}")
    void updateArticle(@Param("sql") String sql, @Param("id") int id);

    @Select("SELECT * FROM article_list where `article_title` LIKE '%${keyword}%' AND `article_status`='0' ORDER BY `id` DESC LIMIT ${begin},${end} ")
    List<Article> getArticleList(Map selectMap);

    @Select("SELECT id, article_title,class_name,article_time FROM article_list where article_commend=${location} ORDER BY `id` DESC LIMIT 1,5")
    List<Article> getCommendArticle(@Param("location") int location);
}
