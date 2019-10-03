package com.magneto.his.mapper;

import com.magneto.his.domain.*;
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

    /**
     *  门诊医生主界面双击候诊病人接诊
     * @param param hjid 和 brzt=1
     * @return 受影响的行数
     */
    Integer updateBRZT(MZYS_UpdateBRZT param);



    /**
     * 开医嘱保存
     * @param params  参数列表
     * @return  受影响的行数
     */
    Integer save(MZYS_SavePOJO params);


    /**
     * 医生接诊输入卡号或者身份证号查找病人挂号信息
     * @param params 卡号或者身份证号
     * @return 病人挂号信息
     */
    YY_BRXX selectGHXX(MZGH_MZGHDJParamsPOJO params);
}
