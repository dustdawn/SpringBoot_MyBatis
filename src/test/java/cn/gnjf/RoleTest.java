package cn.gnjf;

import cn.gnjf.dao.entity.Menu;
import cn.gnjf.dao.entity.Role;
import cn.gnjf.dao.entity.User;
import cn.gnjf.dao.mapper.MenuMapper;
import cn.gnjf.dao.mapper.RoleMapper;
import cn.gnjf.dao.mapper.UserMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Iterator;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = MyApplication.class)
public class RoleTest {
    @Autowired
    private RoleMapper roleMapper;
    @Autowired
    private UserMapper userMapper;


    @Test
    public void insert(){
        Role role1 = new Role();
        role1.setId("3");
        int j = roleMapper.insert(role1);
        /*for (int i = 0; i <10 ; i++) {
            Role role = new Role();
            int m = roleMapper.insert(role);
            System.out.println(j);
        }*/
    }

    @Test
    public void findAll() {
        List<Role> roleList = roleMapper.findAllList();
        Iterator iterator = roleList.iterator();
        while(iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }

    @Test
    public void get() {
        Role role = roleMapper.get("1");
        System.out.println(role);

    }

    @Test
    public void update() {
        Role role = new Role();
        role.setId("3");
        role.setName("角色3");

        int i = roleMapper.updateById(role);
        System.out.println(i);
    }

    @Test
    public void delete() {

        int i = roleMapper.deleteById("1");
        System.out.println(i);
    }

    @Test
    public void findList() {
        Role role = new Role();

        role.setDelFlag("0");
        role.setId("1");
        role.setName("角色1");


        List<Role> list = roleMapper.findList(role);
        System.out.println(list);
    }

}
