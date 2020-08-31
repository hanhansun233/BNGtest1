package com.BNGtest.www.util.pool;

/**
 * 数据库连接池配置类
 * @author sunhaohang
 * @date 2020/5/22
 */
public class PoolConfig {

    //数据库的驱动类
    private String driverName;
    //数据库的连接地址
    private String url;
    //数据库用户名
    private String userName;
    //数据库密码
    private String password;

    /*
    连接池配置
     */
    //空闲集合中最少连接数
    private int minConn = 1;
    //空闲集合最多的连接数
    private int maxConn = 50;
    //初始连接数
    private int initConn = 50;
    //整个连接池（数据库）允许的最大连接数
    private int maxActiveConn = 100;
    //单位毫秒，连接数不够时，线程等待的时间
    private int waitTime = 1000;
    //数据库连接池是否启用自检机制（间隔一段时间检测连接池状态）
    private boolean isCheck = false;
    //自检周期
    private long checkPeriod = 1000 * 30;

    public PoolConfig() {
    }

    public PoolConfig(String driverName, String url, String userName, String password, int minConn, int maxConn, int initConn, int maxActiveConn, int waitTime, boolean isCheck, long checkPeriod) {
        this.driverName = driverName;
        this.url = url;
        this.userName = userName;
        this.password = password;
        this.minConn = minConn;
        this.maxConn = maxConn;
        this.initConn = initConn;
        this.maxActiveConn = maxActiveConn;
        this.waitTime = waitTime;
        this.isCheck = isCheck;
        this.checkPeriod = checkPeriod;
    }

    public String getDriverName() {
        return driverName;
    }

    public void setDriverName(String driverName) {
        this.driverName = driverName;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getMinConn() {
        return minConn;
    }

    public void setMinConn(int minConn) {
        this.minConn = minConn;
    }

    public int getMaxConn() {
        return maxConn;
    }

    public void setMaxConn(int maxConn) {
        this.maxConn = maxConn;
    }

    public int getInitConn() {
        return initConn;
    }

    public void setInitConn(int initConn) {
        this.initConn = initConn;
    }

    public int getMaxActiveConn() {
        return maxActiveConn;
    }

    public void setMaxActiveConn(int maxActiveConn) {
        this.maxActiveConn = maxActiveConn;
    }

    public int getWaitTime() {
        return waitTime;
    }

    public void setWaitTime(int waitTime) {
        this.waitTime = waitTime;
    }

    public boolean isCheck() {
        return isCheck;
    }

    public void setCheck(boolean check) {
        isCheck = check;
    }

    public long getCheckPeriod() {
        return checkPeriod;
    }

    public void setCheckPeriod(long checkPeriod) {
        this.checkPeriod = checkPeriod;
    }
}
