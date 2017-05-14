package cn.myheibai.blog.dao;

import cn.myheibai.blog.pojo.ArticleComment;
import org.apache.ibatis.annotations.*;

import java.util.List;

/**
 * Created by 23883 on 2017-04-23.
 */
public interface ArticleCommentDao {
    @Insert("INSERT INTO article_comment VALUES(null,#{articlecomment.article_id},#{articlecomment.email}," +
            "#{articlecomment.name},#{articlecomment.time}," +
            "#{articlecomment.text},#{articlecomment.ip})")
    void addArticlComment(@Param("articlecomment") ArticleComment articleComment);

    @Delete("DELETE FROM article_comment WHERE id=${id}")
    void deleteArticlComment(@Param("id") long id);

    @Update("UPDATE article_comment SET text=#{articlecomment.text},ip=#{articlecomment.ip},time=#{articlecomment.time} " +
            "where id=#{articlecomment.id}")
    void updateArticleComment(@Param("articlecomment") ArticleComment articleComment);

    @Select("SELECT * FROM article_comment WHERE article_id=${id}")
    List<ArticleComment> findArticleCommentByArticleId(@Param("id") long id);

}
