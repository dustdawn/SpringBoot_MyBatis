package cn.gnjf.service;

import cn.gnjf.dao.entity.Menu;

import java.util.List;

public interface MenuService {
    //添加
    public int insert(Menu menu);
    //删除
    public int deleteById(String id);
    //修改
    public int updateById(Menu menu);
    //查询
    public Menu get(String id);
    public List<Menu> findAllList();
    //条件查询
    public List<Menu> findList(Menu menu);

}
