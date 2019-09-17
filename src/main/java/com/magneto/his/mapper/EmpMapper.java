package com.magneto.his.mapper;

import com.magneto.his.domain.His_System;
import com.magneto.his.domain.Employee;
import com.magneto.his.domain.Dept;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;


@Mapper
public interface EmpMapper {

    /**
     *
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
    List<His_System> selectSystem(String username);

    /**
     * 通过用户名和系统id查询可用的科室
     * @param username  用户名
     * @param his_system_id  系统id
     * @return  可用的科室
     */
    List<Dept> selectDept(@Param("username") String username , @Param("his_system_id") Integer his_system_id);
}
