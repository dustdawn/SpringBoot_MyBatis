package cn.gnjf;


import cn.gnjf.dao.entity.Role;
import cn.gnjf.dao.entity.User;
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
public class UserTest {
    @Autowired
    private UserMapper userMapper;


    @Test
    public void insert(){
        User user = new User();
        user.setId("3");
        user.setName("用户3");
        Role role = new Role();
        role.setId("2");
        user.setRole(role);
        int j = userMapper.insert(user);
        System.out.println(j);

        for (int i = 0; i <10 ; i++) {

        }
    }

    @Test
    public void findAll() {
        List<User> users = userMapper.findAllList();
        Iterator iterator = users.iterator();
        while(iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }

    @Test
    public void get() {
        User user = userMapper.get("1");
        System.out.println(user);

    }

    @Test
    public void update() {
        User user = new User();
        user.setId("2");
        user.setName("用户2");
        user.setLoginName("gnjf");
        user.setPassword("123");
        Role role = new Role();
        role.setId("3");
        user.setRole(role);
        int i = userMapper.updateById(user);
        System.out.println(i);
    }

    @Test
    public void delete() {

        int i = userMapper.deleteById("1");
        System.out.println(i);
    }

    @Test
    public void findList() {
        User user = new User();
        //user.setId("2");
        Role role = new Role();
        role.setId("3");
        List<User> userList = userMapper.findList(user);
        System.out.println(userList);
    }

}


