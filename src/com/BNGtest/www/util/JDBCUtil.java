package com.BNGtest.www.util;

import com.BNGtest.www.util.pool.ConnectionPool;
import com.BNGtest.www.util.pool.PoolConfig;

import java.io.InputStream;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

/**
 * JDBC工具类
 * @author sunhaohang
 * @date 2020/8/31
 */
public class JDBCUtil {

    // 静态数据库配置实体对象，程序运行时加载进内存
    private static PoolConfig config = new PoolConfig();

    static {
        InputStream is = JDBCUtil.class.getClassLoader().getResourceAsStream("db.properties");
        Properties p = new Properties();
        try {
            p.load(is);
            config.setDriverName(p.getProperty("driver"));
            config.setUrl(p.getProperty("url"));
            config.setUserName(p.getProperty("user"));
            config.setPassword(p.getProperty("password"));
            Class.forName(config.getDriverName());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static ConnectionPool connPool = new ConnectionPool(config);

    public static Connection getConnection(){
        return connPool.getConnection();
    }

    public static Connection getCurrentConnection(){
        return connPool.getCurrentConnection();
    }

    public static void closeConnection(Connection conn){
        connPool.releaseConnection(conn);
    }

    public static void closeOnlyP(Statement ps){
        if(ps != null){
            try {
                ps.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

    public static void closeOnlyPAndR(Statement ps, ResultSet rs){
        if(rs != null){
            try {
                rs.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        if(ps != null){
            try {
                ps.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

    public static void closeOnlyR(ResultSet rs){
        if(rs != null){
            try {
                rs.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}
