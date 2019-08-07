package cn.gnjf.service;

import cn.gnjf.dao.entity.User;
import java.util.List;


public interface UserService {
    //增
    public int insert(User user);
    //删
    public int deleteById(String id);
    //改
    public int updateById(User user);
    //查
    public User get(String id);
    public List<User> findAllList();
    //条件查询
    public List<User> findList(User user);
}