package cn.myheibai.blog.service;

import cn.myheibai.blog.dao.WebsiteDao;
import cn.myheibai.blog.dao.WebsiteDaoImpl;
import cn.myheibai.blog.pojo.Website;
import org.json.JSONObject;

/**
 * Created by lhr on 2017/4/26.
 */
public class WebsiteServiceImpl implements WebsiteService {
    WebsiteDao websiteDao = new WebsiteDaoImpl();
    @Override
    public Website getWebsite(long id) {
        return websiteDao.getWebsiteDao(id);
    }

    @Override
    public JSONObject updateWebsite(Website website) {
        try {
            websiteDao.updateWebsite(website);
        }catch (Exception e){

        }
        return null;
    }

    @Override
    public JSONObject insertWebsite(Website website) {
        return null;
    }

    @Override
    public JSONObject deleteWebsite(long id) {
        return null;
    }
}
