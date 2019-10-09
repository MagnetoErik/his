package com.magneto.his.controller;

import com.alibaba.fastjson.JSON;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.HashMap;
import java.util.Map;

@Controller
@RequestMapping("/pages")
public class PagesController {

    /**
     * 根据his_system_id跳转系统
     *
     * @param his_system_id
     * @param request
     * @param dept_id
     * @return
     */
    @GetMapping(value = "/forward", produces = "text/html")
    public String forward(Integer his_system_id, HttpServletRequest request, Integer dept_id) {
        HttpSession session = request.getSession();
        session.setAttribute("dept_id", dept_id);
        switch (his_system_id) {
            case 1:
                return "/pages/mzgh/mzgh";
            case 2:
                return "/pages/mzys/mzys";
            case 3:
                return "/pages/mzhs/mzhs";
            case 4:
                return "/pages/yj/yj";
            case 5:
                return "/pages/yf/yf";
            case 6:
                return "/pages/jc/jc";
            default:
                return null;
        }
    }

    //跳转index登录页面
    @GetMapping(value = "/index", produces = "text/html")
    public String index() {
        return "/index";
    }


    /**
     * 登录时或者切换科室时获取Session信息
     *
     * @param request
     * @return
     */
    @GetMapping(value = "/getSession", produces = "text/html")
    @ResponseBody
    public String getSession(HttpServletRequest request) {
        HttpSession session = request.getSession();
        Object employee = session.getAttribute("emp");
        Object his_system_name = session.getAttribute("his_system_name");
        Object deptName = session.getAttribute("deptName");
        Object his_system_id = session.getAttribute("his_system_id");
        Object dept_id = session.getAttribute("dept_id");
        Map<String, Object> map = new HashMap<>();
        map.put("emp", employee);
        map.put("his_system_name", his_system_name);
        map.put("deptName", deptName);
        map.put("his_system_id", his_system_id);
        map.put("dept_id", dept_id);
        return JSON.toJSONString(map);
    }
}
