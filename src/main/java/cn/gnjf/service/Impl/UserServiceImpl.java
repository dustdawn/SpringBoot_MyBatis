package cn.gnjf.service.Impl;

import cn.gnjf.dao.entity.User;
import cn.gnjf.dao.mapper.UserMapper;
import cn.gnjf.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Scope("prototype")
@Transactional(readOnly = true)
public class UserServiceImpl implements UserService {
    @Autowired
    private UserMapper userMapper;

    /**
     * 增
     * @param user
     * @return
     */
    @Override
    public int insert(User user) {

        int n = userMapper.insert(user);
        if(n != 0) {

        }
        return 0;
    }

    /**
     * 删
     * @param id
     * @return
     */
    @Override
    public int deleteById(String id) {

        int n = userMapper.deleteById(id);
        if(n != 0) {

        }
        return 0;
    }

    /**
     * 改
     * @param user
     * @return
     */
    @Override
    public int updateById(User user) {
        int n = userMapper.updateById(user);
        return 0;
    }

    /**
     * 查
     * @param id
     * @return
     */
    @Override
    public User get(String id) {

        return userMapper.get(id);
    }

    @Override
    public List<User> findAllList() {
        return userMapper.findAllList();
    }

    /**
     * 条件查询
     * @param user
     * @return
     */
    @Override
    public List<User> findList(User user) {
        return userMapper.findList(user);
    }


}
