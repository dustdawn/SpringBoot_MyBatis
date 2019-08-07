package cn.gnjf;

import cn.gnjf.dao.entity.Menu;
import cn.gnjf.dao.entity.Role;
import cn.gnjf.dao.mapper.MenuMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Iterator;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = MyApplication.class)
public class MenuTest {
    @Autowired
    private MenuMapper menuMapper;


    @Test
    public void insert(){
        Menu menu = new Menu();
        menu.setId("3");
        Role role = new Role();
        role.setId("1");
        menu.setRole(role);
        int n = menuMapper.insert(menu);
        System.out.println(n);
        /*for (int i = 0; i <10 ; i++) {
            Menu menu = new Menu();
            menu.setParentId(i+1+"");
            menu.setParentIds(i+2+"");
            int j = menuMapper.insert(menu);
            System.out.println(j);
        }*/
    }

    @Test
    public void findAll() {
        List<Menu> menuList = menuMapper.findAllList();
        Iterator iterator = menuList.iterator();
        while(iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }

    @Test
    public void get() {
        Menu menu = menuMapper.get("1");
        System.out.println(menu);

    }

    @Test
    public void update() {
        Menu menu = new Menu();
        menu.setId("3");
        menu.setName("菜单3");
        menu.setParentId("2");
        menu.setParentIds("0,1");
        Role role = new Role();
        role.setId("1");
        menu.setRole(role);
        int i = menuMapper.updateById(menu);
        System.out.println(i);
    }

    @Test
    public void delete() {

        int i = menuMapper.deleteById("1");
        System.out.println(i);
    }

    @Test
    public void findList() {
        Menu menu = new Menu();
        menu.setId("1");
        Role role = new Role();
        role.setId("3");
        List<Menu> list = menuMapper.findList(menu);
        System.out.println();

    }

}
