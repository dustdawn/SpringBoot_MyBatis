package cn.gnjf.dao.mapper;

import cn.gnjf.dao.entity.Menu;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface MenuMapper {
    /**
     * 添加
     */
    public int insert(Menu menu);
    /**
     * 删除
     */
    public int deleteById(String id);
    /**
     * 修改
     */
    public int updateById(Menu menu);
    /**
     * 查询
     */
    public Menu get(String id);
    public List<Menu> findAllList();

    /**
     * 条件查询
     */
    public List<Menu> findList(Menu menu);



}
