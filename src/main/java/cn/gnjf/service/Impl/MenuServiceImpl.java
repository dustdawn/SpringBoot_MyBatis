package cn.gnjf.service.Impl;

import cn.gnjf.dao.entity.Menu;
import cn.gnjf.dao.mapper.MenuMapper;
import cn.gnjf.service.MenuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
@Scope("prototype")
public class MenuServiceImpl implements MenuService {
    @Autowired
    private MenuMapper menuMapper;

    @Override
    public int insert(Menu menu) {
        return menuMapper.insert(menu);
    }

    @Override
    public int deleteById(String id) {
        return menuMapper.deleteById(id);
    }

    @Override
    public int updateById(Menu menu) {
        return menuMapper.updateById(menu);
    }

    @Override
    public Menu get(String id) {
        return menuMapper.get(id);
    }

    @Override
    public List<Menu> findAllList() {
        return menuMapper.findAllList();
    }

    @Override
    public List<Menu> findList(Menu menu) {
        return menuMapper.findList(menu);
    }
}
