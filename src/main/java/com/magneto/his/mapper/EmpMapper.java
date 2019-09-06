package com.magneto.his.mapper;

import com.magneto.his.domain.TempEmp_HisSystem;
import com.magneto.his.domain.Employee;
import com.magneto.his.domain.TempEmp_dept;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;


@Mapper
public interface EmpMapper {

    Employee login(Employee employee);

    List<TempEmp_HisSystem> selectSystem(String username);

    List<TempEmp_dept> selectDept(@Param("username") String username , @Param("his_system_id") Integer his_system_id);
}
