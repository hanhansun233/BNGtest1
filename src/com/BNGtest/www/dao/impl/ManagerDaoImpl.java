package com.BNGtest.www.dao.impl;

import com.BNGtest.www.dao.BaseDao;
import com.BNGtest.www.dao.ManagerDao;
import com.BNGtest.www.po.Manager;
import com.BNGtest.www.util.JDBCUtil;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class ManagerDaoImpl extends BaseDao implements ManagerDao {
    @Override
    public Manager queryManagerByIdAndPwd(String id, String passWord) {
        Manager manager = new Manager();
        Connection conn = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        String sql = "select * from t_manager where id=? and password=?";
        try {
            rs = query(conn,ps,rs,sql,id,passWord);
            manager = getManager(rs);
        } catch (Exception e) {
            e.printStackTrace();
        }finally {
            JDBCUtil.closeOnlyPAndR(ps,rs);
            JDBCUtil.closeConnection(conn);
        }
        return manager;
    }

    @Override
    public Manager queryManagerById(String managerId) {
        Manager manager = new Manager();
        Connection conn = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        String sql = "select * from t_manager where id=?";
        try {
            rs = query(conn,ps,rs,sql,managerId);
            manager = getManager(rs);
        } catch (Exception e) {
            e.printStackTrace();
        }finally {
            JDBCUtil.closeOnlyPAndR(ps,rs);
            JDBCUtil.closeConnection(conn);
        }
        return manager;
    }

    private Manager getManager(ResultSet rs) throws Exception{
        Manager manager = null;
        while (rs.next()){
            manager = new Manager(rs.getString("id"),rs.getString("password"),rs.getString("name"),rs.getString("sex"),rs.getInt("age"),rs.getString("email"));
        }
        return manager;
    }


}
