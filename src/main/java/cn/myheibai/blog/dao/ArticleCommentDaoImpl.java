package cn.myheibai.blog.dao;


import cn.myheibai.MyBaitsHelper;
import cn.myheibai.blog.pojo.ArticleComment;
import org.apache.ibatis.session.SqlSession;

import java.sql.Timestamp;
import java.util.Date;
import java.util.List;

/**
 * Created by 23883 on 2017-04-23.
 */
public class ArticleCommentDaoImpl implements ArticleCommentDao {
    SqlSession session;
    private ArticleCommentDao articleCommentDao;
    public ArticleCommentDaoImpl(){
        session = MyBaitsHelper.getSession();
        articleCommentDao = session.getMapper(ArticleCommentDao.class);
    }

    @Override
    public void addArticlComment(ArticleComment articleComment) {
        articleCommentDao.addArticlComment(articleComment);
        session.commit();
    }

    @Override
    public void deleteArticlComment(long id) {
        articleCommentDao.deleteArticlComment(id);
        session.commit();
    }

    @Override
    public void updateArticleComment(ArticleComment articleComment) {
        articleCommentDao.updateArticleComment(articleComment);
        session.commit();
    }

    @Override
    public List<ArticleComment> findArticleCommentByArticleId(long id) {
        return articleCommentDao.findArticleCommentByArticleId(id);
    }
    public static void main(String[] args){
        ArticleCommentDao articleCommentDao = new ArticleCommentDaoImpl();
//        System.out.println(articleCommentDao.findArticleCommentByArticleId(18));
//        ArticleComment articleComment = new ArticleComment();
//        articleComment.setId((long) 11);
//        articleComment.setArticle_id((long) 18);
//        articleComment.setEmail("2388399752@qq.com");
//        articleComment.setIp("127.0.0.1");
//        articleComment.setName("heibai");
//        articleComment.setText("数据搞错了");
//        articleComment.setTime(new java.sql.Timestamp(new Date().getTime()));
//        articleCommentDao.updateArticleComment(articleComment);
//        articleCommentDao.deleteArticlComment(11);
    }
}
