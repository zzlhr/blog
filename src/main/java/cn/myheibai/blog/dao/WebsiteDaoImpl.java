package cn.myheibai.blog.dao;

import cn.myheibai.MyBaitsHelper;
import cn.myheibai.blog.pojo.Website;
import org.apache.ibatis.session.SqlSession;

/**
 * Created by lhr on 2017/4/26.
 */
public class WebsiteDaoImpl implements WebsiteDao {
    SqlSession session;
    private WebsiteDao websiteDao;
    public WebsiteDaoImpl(){
        session = MyBaitsHelper.getSession();
        websiteDao = session.getMapper(WebsiteDao.class);
    }
    @Override
    public Website getWebsiteDao(long id) {
        return websiteDao.getWebsiteDao(id);
    }

    @Override
    public void insertWebsite(Website website) {
        websiteDao.insertWebsite(website);
    }

    @Override
    public void deleteWebsite(long id) {
        websiteDao.deleteWebsite(id);
    }

    @Override
    public void updateWebsite(Website website) {
        websiteDao.updateWebsite(website);
    }
}
