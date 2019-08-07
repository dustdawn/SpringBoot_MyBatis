package cn.gnjf.controller;

import cn.gnjf.dao.entity.User;
import cn.gnjf.service.UserService;
import cn.hutool.json.JSON;
import cn.hutool.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 用户Controller层
 * @author luobin
 */
@Controller
@RequestMapping(value = "user")
public class UserController {

    @Autowired
    private UserService userService;

    @ResponseBody
    @RequestMapping(value = "findAllList")
    public List<User> findAllList() {
        return userService.findAllList();
    }


    @RequestMapping(value = "login", method = RequestMethod.POST)
    @ResponseBody
    public JSON Login(@RequestBody String reqData) {
        //return reqData.toString();
        JSONObject json = new JSONObject(reqData);
        String login_name = (String) json.get("login_name");
        String password = (String) json.get("password");
        User user = new User();
        user.setId(null);
        user.setLoginName(login_name);
        List<User> userList = userService.findList(user);

        JSONObject res = new JSONObject();
        Integer code = 500;
        String msg = "失败";
        Object data = null;

        if(userList != null && userList.size() > 0) {
            code = 200;
            User u = userList.get(0);
            if(password.equals(u.getPassword())) {
                msg = "登陆成功";
                data = u;
            }else {
                msg = "密码错误";
            }
        }else {
            msg = "账号错误";
        }

        res.put("code",code);
        res.put("msg",msg);
        res.put("data",data);
        return res;

    }




}
