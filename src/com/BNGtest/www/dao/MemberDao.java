package com.BNGtest.www.dao;

import com.BNGtest.www.po.Manager;

public interface MemberDao {

    /**
     * 根据成员号和密码查询成员信息
     * @param memberId 成员号
     * @param passWord 密码
     * @return 如果返回null，说明没这个成员，反之亦然。
     */
    public Manager queryManagerByIdAndPwd(String memberId, String passWord);

    /**
     * 根据成员号查询成员信息
     * @param memberId 成员号
     * @return 如果返回null，说明没这个成员，反之亦然。
     */
    public Manager queryManagerById(String memberId);
}
