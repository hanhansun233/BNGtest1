package com.BNGtest.www.po;

public class Manager {

    private String managerId;
    private String managerPassword;
    private String managerName;
    private String managerSex;
    private Integer managerAge;
    private String managerEmail;

    public Manager(String managerId, String managerPassword, String managerName, String managerSex, Integer managerAge, String managerEmail) {
        this.managerId = managerId;
        this.managerPassword = managerPassword;
        this.managerName = managerName;
        this.managerSex = managerSex;
        this.managerAge = managerAge;
        this.managerEmail = managerEmail;
    }

    public Manager() {
    }

    public String getManagerId() {
        return managerId;
    }

    public void setManagerId(String managerId) {
        this.managerId = managerId;
    }

    public String getManagerPassword() {
        return managerPassword;
    }

    public void setManagerPassword(String managerPassword) {
        this.managerPassword = managerPassword;
    }

    public String getManagerName() {
        return managerName;
    }

    public void setManagerName(String managerName) {
        this.managerName = managerName;
    }

    public String getManagerSex() {
        return managerSex;
    }

    public void setManagerSex(String managerSex) {
        this.managerSex = managerSex;
    }

    public Integer getManagerAge() {
        return managerAge;
    }

    public void setManagerAge(Integer managerAge) {
        this.managerAge = managerAge;
    }

    public String getManagerEmail() {
        return managerEmail;
    }

    public void setManagerEmail(String managerEmail) {
        this.managerEmail = managerEmail;
    }

    @Override
    public String toString() {
        return "Manager{" +
                "managerId='" + managerId + '\'' +
                ", managerPassword='" + managerPassword + '\'' +
                ", managerName='" + managerName + '\'' +
                ", managerSex='" + managerSex + '\'' +
                ", managerAge=" + managerAge +
                ", managerEmail='" + managerEmail + '\'' +
                '}';
    }
}
