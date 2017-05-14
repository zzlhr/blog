package cn.myheibai.blog.dao;

import cn.myheibai.blog.pojo.Article;

/**
 * Created by lhr on 2017/4/20.
 */
public class SqlProvider {
    public String updateArticle(Article article){
        System.out.print(article);
        String sql = "UPDATE `article` SET ";
        if (article.getArticle_text()!=null || article.getArticle_text().equals("'null'")){
            sql+=" article_text=#{a.article_text,jdbcType=VARCHAR} ";
        }
        if (article.getArticle_title()!=null || article.getArticle_title().equals("'null'")){
            sql+=" article_title=#{a.article_title,jdbcType=VARCHAR}";
        }
        if (article.getArticle_picture()!=null || article.getArticle_picture().equals("'null'")){
            sql+=" article_picture=#{a.article_picture,jdbcType=VARCHAR}";
        }
        if (article.getArticle_keyword()!=null || article.getArticle_keyword().equals("'null'")){
            sql+=" article_keyword=#{a.article_keyword,jdbcType=VARCHAR}";

        }
        if (article.getArticle_describe()!=null || article.getArticle_describe().equals("'null'")){
            sql+=" article_describe=#{a.article_describe,jdbcType=VARCHAR}";

        }
        if (article.getArticle_time()!=null){
            sql+=" article_time=#{a.article_time,jdbcType=TIMESTAMP}";

        }
        if (article.getAdmin_id()!=null || article.getAdmin_id().equals("'null'")){
            sql+=" admin_id=#{a.admin_id,jdbcType=INT}";
        }
        sql += " where id=#{a.id,jdbcType=INT}";
        return sql;
    }
}
