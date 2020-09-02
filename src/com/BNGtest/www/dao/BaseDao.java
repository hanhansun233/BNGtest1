package com.BNGtest.www.dao;

import com.BNGtest.www.util.JDBCUtil;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * 创建一个通用方法接口实现类。
 * @author sunhaohang
 * @date 2020/5/22
 */
public abstract class BaseDao {

    /**
     * 通用删除,修改,添加
     *
     * @param sql    sql语句
     * @param params 传进来的参数
     * @return 影响的对象数量
     */
    public int update(String sql, Object... params) {
        int num = 0;
        Connection conn = null;
        PreparedStatement ps = null;
        try {
            conn = JDBCUtil.getConnection();
            ps = conn.prepareStatement(sql);
            if (params != null){
                for (int i = 0; i < params.length; i++) {
                    ps.setObject(i + 1, params[i]);
                }
                num = ps.executeUpdate();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            JDBCUtil.closeOnlyP(ps);
            JDBCUtil.closeConnection(conn);
        }
        return num;
    }

    /**
     * 通用查询
     *
     * @param sql sql语句
     * @return 影响的对象数量
     */
    public ResultSet query(Connection conn, PreparedStatement ps, ResultSet rs, String sql, Object... params) throws Exception {
        conn = JDBCUtil.getConnection();
        ps = conn.prepareStatement(sql);
        if (params != null) {
            for (int i = 0; i < params.length; i++) {
                ps.setObject(i + 1, params[i]);
            }
        }
        rs = ps.executeQuery();
        return rs;
    }
}
