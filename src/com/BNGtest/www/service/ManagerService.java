package com.BNGtest.www.service;

import com.BNGtest.www.po.Manager;

public interface ManagerService {
    /**
     * 管理员登录业务
     * @param managerId 管理员号
     * @param passWord 密码
     * @return true表示成功
     */
    public boolean login (String managerId, String passWord);

    /**
     * 根据管理员号查询管理员信息的业务
     * @param managerId 管理员工号
     * @return 如果返回null，说明没这个管理员，反之亦然。
     */
    public Manager queryManagerById(String managerId);

    /**
     * 根据管理员号查询管理员信息的业务
     * @param email 管理员工号
     * @return 如果返回null，说明没这个管理员，反之亦然。
     */
    public Manager queryManagerByEmail(String email);
}
