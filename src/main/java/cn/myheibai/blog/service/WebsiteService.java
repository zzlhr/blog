package cn.myheibai.blog.service;

import cn.myheibai.blog.pojo.Website;
import org.json.JSONObject;


/**
 * Created by lhr on 2017/4/26.
 */
public interface WebsiteService {

    Website getWebsite(long id);

    JSONObject updateWebsite(Website website);

    JSONObject insertWebsite(Website website);

    JSONObject deleteWebsite(long id);

}
