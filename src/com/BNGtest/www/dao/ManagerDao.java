package com.BNGtest.www.dao;

import com.BNGtest.www.po.Manager;

public interface ManagerDao {

    /**
     * 根据管理员号和密码查询管理员信息
     *
     * @param id       管理员工号
     * @param passWord 密码
     * @return 如果返回null，说明没这个管理员，反之亦然。
     */
    public Manager queryManagerByIdAndPwd(String id, String passWord);

    /**
     * 根据管理员号查询管理员信息
     *
     * @param managerId 管理员工号
     * @return 如果返回null，说明没这个管理员，反之亦然。
     */
    public Manager queryManagerById(String managerId);

    /**
     * 根据管理员邮箱号查询管理员信息
     *
     * @param email 管理员邮箱号
     * @return 如果返回null，说明没这个管理员，反之亦然。
     */
    public Manager queryManagerByEmail(String email);

}
