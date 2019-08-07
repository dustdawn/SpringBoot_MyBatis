package cn.gnjf.dao.entity;

import java.io.Serializable;
import java.util.UUID;

public class Menu implements Serializable {
    private String id;
    private String parentId;    //父id
    private String parentIds;
    private String name;
    private String delFlag;
    private Role role;

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }

    private static final long serialVersionUID = 1L;

    public Menu() {
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

    public String getParentId() {
        return parentId;
    }

    public void setParentId(String parentId) {
        this.parentId = parentId;
    }

    public String getParentIds() {
        return parentIds;
    }

    public void setParentIds(String parentIds) {
        this.parentIds = parentIds;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDelFlag() {
        return delFlag;
    }

    public void setDelFlag(String delFlag) {
        this.delFlag = delFlag;
    }

    @Override
    public String toString() {
        return "Menu{" +
                "id='" + id + '\'' +
                ", parentId='" + parentId + '\'' +
                ", parentIds='" + parentIds + '\'' +
                ", name='" + name + '\'' +
                ", delFlag='" + delFlag + '\'' +
                ", role=" + role +
                '}';
    }
}
