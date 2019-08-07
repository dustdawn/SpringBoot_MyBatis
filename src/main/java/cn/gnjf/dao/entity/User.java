package cn.gnjf.dao.entity;

import java.io.Serializable;
import java.util.UUID;

public class User implements Serializable {

    private static final long serialVersionUID = 1L;
    private String id;//编号
    private String name;    // 姓名
    private String loginName;// 登录名
    private String password;// 密码
    private String mobile;    // 手机
    private Role role;  //角色
    private String delFlag;  //删除标志

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }



    @Override
    public String toString() {
        return "User{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", loginName='" + loginName + '\'' +
                ", password='" + password + '\'' +
                ", mobile='" + mobile + '\'' +
                ", role=" + role +
                ", delFlag='" + delFlag + '\'' +
                '}';
    }

    public User() {
        this.id = UUID.randomUUID().toString().replace("-","");
        this.delFlag = "0";
    }

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public String getDelFlag() {
        return delFlag;
    }

    public void setDelFlag(String delFlag) {
        this.delFlag = delFlag;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLoginName() {
        return loginName;
    }

    public void setLoginName(String loginName) {
        this.loginName = loginName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }


}