package com.magneto.his.service.impl;

import com.magneto.his.domain.Employee;
import com.magneto.his.domain.TempEmp_HisSystem;
import com.magneto.his.domain.TempEmp_dept;
import com.magneto.his.mapper.EmpMapper;
import com.magneto.his.service.EmpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmpServiceImpl implements EmpService {

    private final EmpMapper empMapper;

    @Autowired
    public EmpServiceImpl(EmpMapper empMapper) {
        this.empMapper = empMapper;
    }


    @Override
    public Employee login(Employee employee) {
        return empMapper.login(employee);
    }

    @Override
    public List<TempEmp_HisSystem> selectHisSystem(String username) {
        List<TempEmp_HisSystem> systemList = empMapper.selectSystem(username);
        return systemList;
    }

    @Override
    public List<TempEmp_dept> selectDept(String username ,Integer his_system_id) {
        List<TempEmp_dept> deptList = empMapper.selectDept(username,his_system_id);
        return deptList;
    }


}
