package com.magneto.his.service;

import com.magneto.his.domain.Dept;
import com.magneto.his.domain.Employee;
import com.magneto.his.domain.His_System;

import java.util.List;

public interface EmpService {


    /**
     * 登录界判断用户名和密码是否正确
     * @param employee
     * @return
     */
    Employee login(Employee employee);

    /**
     * 登陆成功后通过用户名查询可用的系统
     * @param username  用户名
     * @return 可用的系统
     */
    List<His_System> selectHisSystem(String username);

    /**
     * 通过用户名和系统id查询可用的科室
     * @param username  用户名
     * @param his_system_id  系统id
     * @return  可用的科室
     */
    List<Dept> selectDept(String username , Integer his_system_id);




}
