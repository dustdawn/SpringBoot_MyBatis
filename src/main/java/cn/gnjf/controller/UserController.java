package cn.gnjf.controller;

import cn.gnjf.dao.entity.User;
import cn.gnjf.service.UserService;
import cn.hutool.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

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


    @RequestMapping(value = "toIndex", method = RequestMethod.POST)
    @ResponseBody
    public String toIndex(/*@RequestBody User user, */HttpServletRequest request ) {
        /*JSONObject json = new JSONObject(reqData);
        String login_name = (String) json.get("login_name");
        String password = (String) json.get("password");*/
        String login_name = request.getParameter("login_name");
        String password = request.getParameter("password");

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
            msg = "账号不存在";
        }

        res.put("code",code);
        res.put("msg",msg);
        res.put("data",data);
        return res.toString();

    }

    @RequestMapping("/login")
    public String login(Model model){
        model.addAttribute("name","here");
        return "/jsp/login";
    }

    @RequestMapping("/to")
    @ResponseBody
    public String to(){

        return "success";
    }





}
