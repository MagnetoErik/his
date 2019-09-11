package com.magneto.his.service.impl;

import com.magneto.his.domain.Employee;
import com.magneto.his.domain.His_System;
import com.magneto.his.domain.Dept;
import com.magneto.his.domain.SelectByParamsPOJO;
import com.magneto.his.mapper.EmpMapper;
import com.magneto.his.service.EmpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmpServiceImpl implements EmpService {

    @Autowired
    private EmpMapper empMapper;

    @Override
    public Employee login(Employee employee) {
        return empMapper.login(employee);
    }

    @Override
    public List<His_System> selectHisSystem(String username) {
        List<His_System> systemList = empMapper.selectSystem(username);
        return systemList;
    }

    @Override
    public List<Dept> selectDept(String username , Integer his_system_id) {
        List<Dept> deptList = empMapper.selectDept(username,his_system_id);
        return deptList;
    }




}
