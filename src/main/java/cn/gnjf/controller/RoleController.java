package cn.gnjf.controller;

import cn.gnjf.dao.entity.Role;
import cn.gnjf.service.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * 角色Controller层
 * @author luobin
 */
@Controller
@RequestMapping(value = "role")
public class RoleController {

    @Autowired
    private RoleService roleService;

    @RequestMapping(value = "/findAllList")
    @ResponseBody
    public List<Role> findAllList() {
        return roleService.findAllList();
    }



}
