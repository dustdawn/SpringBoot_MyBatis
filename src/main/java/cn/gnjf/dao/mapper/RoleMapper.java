package cn.gnjf.dao.mapper;

import cn.gnjf.dao.entity.Role;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface RoleMapper {
    /**
     * 查询
     */
    //查询所有用户
    public List<Role> findAllList();

    //根据id查询用户
    public Role get(String id);


    /**
     * 添加
     */
    public int insert(Role role);

    /**
     * 删除
     */
    public int deleteById(String id);
    /**
     * 修改
     */
    public int updateById(Role role);

    /**
     * 条件查询
     */
    public List<Role> findList(Role role);
}
