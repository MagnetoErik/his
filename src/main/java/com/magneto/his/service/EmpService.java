package com.magneto.his.service;

import com.magneto.his.domain.His_System;
import com.magneto.his.domain.Dept;
import com.magneto.his.domain.Employee;
import com.magneto.his.domain.SelectByParamsPOJO;

import java.util.List;

public interface EmpService {


    Employee login(Employee employee);

    List<His_System> selectHisSystem(String username);

    List<Dept> selectDept(String username , Integer his_system_id);




}
