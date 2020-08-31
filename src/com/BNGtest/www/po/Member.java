package com.BNGtest.www.po;

public class Member {

    private String memberId;
    private String memberPassword;
    private String memberName;
    private String memberSex;
    private Integer memberAge;
    private String memberEmail;

    public Member(String memberId, String memberPassword, String memberName, String memberSex, Integer memberAge, String memberEmail) {
        this.memberId = memberId;
        this.memberPassword = memberPassword;
        this.memberName = memberName;
        this.memberSex = memberSex;
        this.memberAge = memberAge;
        this.memberEmail = memberEmail;
    }

    public Member() {
    }

    public String getMemberId() {
        return memberId;
    }

    public void setMemberId(String memberId) {
        this.memberId = memberId;
    }

    public String getMemberPassword() {
        return memberPassword;
    }

    public void setMemberPassword(String memberPassword) {
        this.memberPassword = memberPassword;
    }

    public String getMemberName() {
        return memberName;
    }

    public void setMemberName(String memberName) {
        this.memberName = memberName;
    }

    public String getMemberSex() {
        return memberSex;
    }

    public void setMemberSex(String memberSex) {
        this.memberSex = memberSex;
    }

    public Integer getMemberAge() {
        return memberAge;
    }

    public void setMemberAge(Integer memberAge) {
        this.memberAge = memberAge;
    }

    public String getMemberEmail() {
        return memberEmail;
    }

    public void setMemberEmail(String memberEmail) {
        this.memberEmail = memberEmail;
    }

    @Override
    public String toString() {
        return "Member{" +
                "memberId='" + memberId + '\'' +
                ", memberPassword='" + memberPassword + '\'' +
                ", memberName='" + memberName + '\'' +
                ", memberSex='" + memberSex + '\'' +
                ", memberAge=" + memberAge +
                ", memberEmail='" + memberEmail + '\'' +
                '}';
    }
}
