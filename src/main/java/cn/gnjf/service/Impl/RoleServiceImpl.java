package cn.gnjf.service.Impl;

import cn.gnjf.dao.entity.Role;
import cn.gnjf.dao.mapper.RoleMapper;
import cn.gnjf.service.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Scope("prototype")
public class RoleServiceImpl implements RoleService {
    @Autowired
    private RoleMapper roleMapper;

    @Override
    public int insert(Role role) {
        return roleMapper.insert(role);
    }

    @Override
    public int deleteById(String id) {
        return roleMapper.deleteById(id);
    }

    @Override
    public int updateById(Role role) {
        return roleMapper.updateById(role);
    }

    @Override
    public List<Role> findAllList() {
        return roleMapper.findAllList();
    }

    @Override
    public Role get(String id) {
        return roleMapper.get(id);
    }

    @Override
    public List<Role> findList(Role role) {
        return roleMapper.findList(role);
    }
}
