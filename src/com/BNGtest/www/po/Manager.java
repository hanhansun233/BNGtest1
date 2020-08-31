package com.BNGtest.www.po;

/**
 * 创建一个管理员实体类
 * @author sunhaohang
 * @date 2020/8/31
 */
public class Manager {

    /**
     * 定义各种变量。
     */
    private String managerId;
    private String managerPassword;
    private String managerName;
    private String managerSex;
    private Integer managerAge;
    private String managerEmail;

    /**
     *构造方法，分为有参和无参两种
     */
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

    /**
     * 定义各种Getter和Setter方法。
     */
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
