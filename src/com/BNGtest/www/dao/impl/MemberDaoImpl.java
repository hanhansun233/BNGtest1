package com.BNGtest.www.dao.impl;

import com.BNGtest.www.dao.BaseDao;
import com.BNGtest.www.dao.MemberDao;
import com.BNGtest.www.po.Member;
import com.BNGtest.www.util.JDBCUtil;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class MemberDaoImpl extends BaseDao implements MemberDao {
    @Override
    public Member queryMemberByIdAndPwd(String memberId, String passWord) {
        Member member = new Member();
        Connection conn = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        String sql = "select * from t_member where id=? and password=?";
        try {
            rs = query(conn,ps,rs,sql,memberId,passWord);
            member = getMember(rs);
        } catch (Exception e) {
            e.printStackTrace();
        }finally {
            JDBCUtil.closeOnlyPAndR(ps,rs);
            JDBCUtil.closeConnection(conn);
        }
        return member;
    }

    private Member getMember(ResultSet rs) throws Exception{
        Member member = null;
        while (rs.next()){
            member = new Member(rs.getString("id"),rs.getString("password"),rs.getString("name"),rs.getString("sex"),rs.getInt("age"),rs.getString("email"));
        }
        return member;
    }

    @Override
    public Member queryMemberById(String memberId) {
        return null;
    }
}
