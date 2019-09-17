package com.magneto.his.controller;

import com.alibaba.fastjson.JSON;
import com.magneto.his.domain.Dept;
import com.magneto.his.domain.Employee;
import com.magneto.his.domain.His_System;
import com.magneto.his.service.EmpService;
import com.magneto.his.utils.Md5Encrypt;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.List;

@Controller
@RequestMapping("/emp")
public class EmpController {

    private final EmpService empService;

    @Autowired
    public EmpController(EmpService empService) {
        this.empService = empService;
    }

    /**
     * 验证用户名和密码 并存入session
     * @param employee
     * @param request
     * @return
     */
    @PostMapping(value = "/login",produces="text/html")
    @ResponseBody
    public String login(Employee employee, HttpServletRequest request) {
        String s = Md5Encrypt.MD5(employee.getPassword());
        employee.setPassword(s);
        HttpSession session = request.getSession();
        Employee emp = empService.login(employee);
        session.setAttribute("emp",emp);
        return JSON.toJSONString(emp);
    }

    /**
     * 通过用户名查询可用的系统
     * @param username
     * @return
     */
    @PostMapping(value = "/selectHisSystem",produces="text/html")
    @ResponseBody
    public String selectHisSystem(String username){
        List<His_System> hisSystemList = empService.selectHisSystem(username);
        return JSON.toJSONString(hisSystemList);
    }

    /**
     * 通过用户名和系统id 查询可用的科室
     * @param username
     * @param his_system_id
     * @return
     */
    @PostMapping(value = "/selectDept",produces="text/html")
    @ResponseBody
    public String selectDept(String username ,Integer his_system_id){
        List<Dept> deptList = empService.selectDept(username,his_system_id);
        return JSON.toJSONString(deptList);
    }



}

