package com.magneto.his.mapper;

import com.magneto.his.domain.His_System;
import com.magneto.his.domain.Employee;
import com.magneto.his.domain.Dept;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;


@Mapper
public interface EmpMapper {

    Employee login(Employee employee);

    List<His_System> selectSystem(String username);

    List<Dept> selectDept(@Param("username") String username , @Param("his_system_id") Integer his_system_id);
}
