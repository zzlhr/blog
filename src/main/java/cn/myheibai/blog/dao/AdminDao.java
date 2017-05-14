package cn.myheibai.blog.dao;

import cn.myheibai.blog.pojo.Admin;
import org.apache.ibatis.annotations.*;

import java.util.List;

/**
 * Created by lhr on 2017/4/21.
 */
public interface AdminDao {
    @Select("SELECT * FROM admin WHERE id=${id}")
    Admin findAdminById(@Param("id") int id);

    @Select("SELECT * FROM admin")
    List<Admin> getAdminList();

    @Insert("INSERT INTO admin VALUES(#{admin.id},#{admin.admin_name},#{admin.admin_password},#{admin.admin_token}," +
            "#{admin.admin_status},#{admin.admin_ip})")
    void addAdmin(@Param("admin") Admin admin);

    @Delete("DELETE FROM admin WHERE id=${id}")
    void deleteAdmin(@Param("id") int id);

    @Update("UPDATE admin SET id=#{admin.id},admin_name=#{admin.admin_name}," +
            "admin_password=#{admin.admin_password},admin_token=#{admin.admin_token}," +
            "admin_status=#{admin.admin_status},admin_ip=#{admin.admin_ip} WHERE id=#{admin.id}")
    void updateAdmin(@Param("admin") Admin admin);

}
