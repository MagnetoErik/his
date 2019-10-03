package com.magneto.his.service.impl;

import com.magneto.his.domain.*;
import com.magneto.his.mapper.MZYSMapper;
import com.magneto.his.service.MZYSService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MZYSServiceImpl implements MZYSService {

    @Autowired
    private MZYSMapper mzysMapper;

    /**
     * 诊医生主界面 开立处方 按照输入的字段查询指定的药品信息
     * @param name 输入的字段
     * @return 指定的药品信息
     */
    @Override
    public List<MZYS_SelectMsgReturnPojo> getMsg(String name) {
        return mzysMapper.getMsg(name);
    }


    /**
     *  门诊医生主界面  开立处方 左侧候诊病人列表
     * @return  候诊病人列表
     */
    @Override
    public List<YY_BRXX> waitList(Integer deptId) {
        return mzysMapper.waitList(deptId);
    }

    /**
     *  门诊医生主界面  开立处方 左侧候诊病人列表
     * @return  就诊病人列表
     */
    @Override
    public List<YY_BRXX> nowList(Integer deptId) {
        return mzysMapper.nowList(deptId);
    }

    @Override
    public Integer updateBRZT(MZYS_UpdateBRZT param) {
        return mzysMapper.updateBRZT(param);
    }

    /**
     * 开医嘱保存
     * @param params  参数列表
     * @return  受影响的行数
     */
    @Override
    public Integer save(MZYS_SavePOJO params) {
        return mzysMapper.save(params);
    }

    /**
     * 医生接诊输入卡号或者身份证号查找病人挂号信息
     * @param params 卡号或者身份证号
     * @return 病人挂号信息
     */
    @Override
    public YY_BRXX selectGHXX(MZGH_MZGHDJParamsPOJO params) {
        return mzysMapper.selectGHXX(params);
    }
}
