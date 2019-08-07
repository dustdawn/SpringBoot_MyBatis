package cn.gnjf.controller;

import cn.gnjf.dao.entity.Menu;
import cn.gnjf.service.MenuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * 菜单Controller层
 * @author luobin
 */
@Controller
@RequestMapping(value = "menu")
public class MenuController {

    @Autowired
    private MenuService menuService;

    @RequestMapping(value = "/findAllList")
    @ResponseBody
    public List<Menu> findAllList() {
        return menuService.findAllList();
    }



}
