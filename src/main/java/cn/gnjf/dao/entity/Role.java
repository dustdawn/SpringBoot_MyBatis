package cn.gnjf.dao.entity;

import java.io.Serializable;
import java.util.List;
import java.util.UUID;

public class Role implements Serializable {
    private String id;
    private String name;
    private String delFlag;

    private List<User> userList;
    private List<Menu> menuList;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Menu> getMenuList() {
        return menuList;
    }

    public void setMenuList(List<Menu> menuList) {
        this.menuList = menuList;
    }

    public List<User> getUserList() {
        return userList;
    }

    public void setUserList(List<User> userList) {
        this.userList = userList;
    }

    private static final long serialVersionUID = 1L;

    public Role() {
        this.id = UUID.randomUUID().toString().replace("-","");
        this.delFlag = "0";
    }



    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }



    public String getDelFlag() {
        return delFlag;
    }

    public void setDelFlag(String delFlag) {
        this.delFlag = delFlag;
    }

    @Override
    public String toString() {
        return "Role{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", delFlag='" + delFlag + '\'' +
                ", userList=" + userList +
                ", menuList=" + menuList +
                '}';
    }
}
