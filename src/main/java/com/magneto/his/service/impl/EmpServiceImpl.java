package com.magneto.his.service.impl;

import com.magneto.his.domain.Dept;
import com.magneto.his.domain.Employee;
import com.magneto.his.domain.His_System;
import com.magneto.his.mapper.EmpMapper;
import com.magneto.his.service.EmpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmpServiceImpl implements EmpService {

    @Autowired
    private EmpMapper empMapper;

    /**
     * 登录界判断用户名和密码是否正确
     * @param employee
     * @return
     */
    @Override
    public Employee login(Employee employee) {
        return empMapper.login(employee);
    }

    /**
     * 登陆成功后通过用户名查询可用的系统
     * @param username  用户名
     * @return 可用的系统
     */
    @Override
    public List<His_System> selectHisSystem(String username) {
        List<His_System> systemList = empMapper.selectSystem(username);
        return systemList;
    }

    /**
     * 通过用户名和系统id查询可用的科室
     * @param username  用户名
     * @param his_system_id  系统id
     * @return  可用的科室
     */
    @Override
    public List<Dept> selectDept(String username , Integer his_system_id) {
        List<Dept> deptList = empMapper.selectDept(username,his_system_id);
        return deptList;
    }




}
