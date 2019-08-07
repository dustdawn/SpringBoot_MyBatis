package cn.gnjf.service;

import cn.gnjf.dao.entity.Role;

import java.util.List;

public interface RoleService {
    //添加
    public int insert(Role role);
    //删除
    public int deleteById(String id);
    //修改
    public int updateById(Role role);
    //查询未删除的角色集合
    public List<Role> findAllList();
    //根据id查询角色
    public Role get(String id);
    //条件查询
    public List<Role> findList(Role role);
}
