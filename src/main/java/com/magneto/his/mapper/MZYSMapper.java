package com.magneto.his.mapper;

import com.magneto.his.domain.MZYS_SelectMsgReturnPojo;
import com.magneto.his.domain.YY_BRXX;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface MZYSMapper {

    /**
     * 门诊医生主界面 开立处方 按照输入的字段查询指定的药品信息
     * @param name 输入的字段
     * @return 指定的药品信息
     */
    List<MZYS_SelectMsgReturnPojo> getMsg(String name);

    /**
     *  门诊医生主界面  开立处方 左侧候诊病人列表
     * @return  候诊病人列表
     */
    List<YY_BRXX> waitList(Integer deptId);

    /**
     *  门诊医生主界面  开立处方 左侧候诊病人列表
     * @return  就诊病人列表
     */
    List<YY_BRXX> nowList(Integer deptId);
}
