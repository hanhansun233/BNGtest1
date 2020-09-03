package com.BNGtest.www.service;

import com.BNGtest.www.po.Member;

public interface MemberService {

    /**
     * 成员登录业务
     * @param memberId 成员号
     * @param passWord 密码
     * @return true表示成功
     */
    public boolean login (String memberId, String passWord);

    /**
     * 根据成员号查询管理员信息的业务
     * @param memberId 成员号
     * @return 如果返回null，说明没这个成员，反之亦然。
     */
    public Member queryMemberById(String memberId);
}
