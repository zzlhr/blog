package cn.myheibai.blog.dao;

import cn.myheibai.blog.pojo.Website;
import org.apache.ibatis.annotations.*;

/**
 * Created by lhr on 2017/4/26.
 */
public interface WebsiteDao {

    @Select("SELECT * FROM website WHERE id=${id}")
    Website getWebsiteDao(@Param("id") long id);

    @Insert("INSERT INTO website VALUES(null,${website.website_title},${website.website_logo}," +
            "${website.website_realmname},${website.website_keyword},${website.website_describe}," +
            "${website.website_tel},${website.website_qq},${website.website_email}," +
            "${website.website_address},${website.website_bottom},${website.website_status}," +
            "${website.website_aboutme})")
    void insertWebsite(@Param("website") Website website);

    @Delete("DELETE FROM website WHERE id=${id}")
    void deleteWebsite(@Param("id") long id);

    @Update("UPDATA website SET website_title=${website.website_title},website_logo=${website.website_logo},website_realmname=${website.website_realmname}," +
            "website_keyword=${website.website_keyword},website_describe=${website.website_describe},website_tel=${website.website_tel}," +
            "website_qq=${website.website_qq},website_email=${website.website_email},website_address=${website.website_address}," +
            "website_bottom=${website.website_bottom},website_status=${website.website_status},website_aboutme=${website.website_aboutme}" +
            " WHERE id = ${website.id}")
    void updateWebsite(@Param("website") Website website);

}
