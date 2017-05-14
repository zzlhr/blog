package cn.myheibai.blog.dao;

import cn.myheibai.MyBaitsHelper;
import cn.myheibai.blog.pojo.Admin;
import org.apache.ibatis.session.SqlSession;

import java.util.List;

/**
 * Created by lhr on 2017/4/21.
 */
public class AdminDaoImpl implements AdminDao {
    SqlSession session;
    private AdminDao adminDao;
    public AdminDaoImpl(){
        session = MyBaitsHelper.getSession();
        adminDao = session.getMapper(AdminDao.class);
    }
    @Override
    public Admin findAdminById(int id) {
        return adminDao.findAdminById(id);
    }

    @Override
    public List<Admin> getAdminList() {
        return adminDao.getAdminList();
    }

    @Override
    public void addAdmin(Admin admin) {
        adminDao.addAdmin(admin);
        session.commit();
    }


    @Override
    public void deleteAdmin(int id) {
        adminDao.deleteAdmin(id);
        session.commit();
    }

    @Override
    public void updateAdmin(Admin admin) {
        adminDao.updateAdmin(admin);
        session.commit();
    }

//    public static void main(String[] args){
//        AdminDao admin = new AdminDaoImpl();
//        Admin a = new Admin();
//        a.setId((long) 10000);
//        a.setAdmin_name("admin");
//        a.setAdmin_password("123456");
//        admin.updateAdmin(a);
//    }
}
