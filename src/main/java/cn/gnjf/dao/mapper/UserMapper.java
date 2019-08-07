package cn.gnjf.dao.mapper;

import cn.gnjf.dao.entity.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;


@Mapper
public interface UserMapper {



    /**
     * 添加
     */
    public int insert(User user);

    /**
     * 删除
     */
    public int deleteById(String id);
    /**
     * 修改
     */
    public int updateById(User user);
    /**
     * 查询
     */
    //查询所有用户
    public List<User> findAllList();

    //根据id查询用户
    public User get(String id);

    //条件查询用户集合
    public List<User> findList(User user);

}
