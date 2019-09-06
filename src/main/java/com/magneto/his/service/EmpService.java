package com.magneto.his.service;

import com.magneto.his.domain.TempEmp_HisSystem;
import com.magneto.his.domain.TempEmp_dept;
import com.magneto.his.domain.Employee;

import java.util.List;

public interface EmpService {


    Employee login(Employee employee);

    List<TempEmp_HisSystem> selectHisSystem(String username);

    List<TempEmp_dept> selectDept(String username ,Integer his_system_id);



}
