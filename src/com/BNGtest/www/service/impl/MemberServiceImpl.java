package com.BNGtest.www.service.impl;

import com.BNGtest.www.dao.MemberDao;
import com.BNGtest.www.dao.impl.MemberDaoImpl;
import com.BNGtest.www.po.Member;
import com.BNGtest.www.service.MemberService;

public class MemberServiceImpl implements MemberService {
    MemberDao memberDao = new MemberDaoImpl();

    @Override
    public boolean login(String memberId, String passWord) {
        Member member = memberDao.queryMemberByIdAndPwd(memberId,passWord);
        if (member != null){
            return true;
        }else {
            return false;
        }
    }

    @Override
    public Member queryMemberById(String memberId) {
        return memberDao.queryMemberById(memberId);
    }
}
