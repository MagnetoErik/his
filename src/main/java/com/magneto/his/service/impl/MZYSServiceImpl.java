package com.magneto.his.service.impl;

import com.magneto.his.domain.MZYS_SelectMsgReturnPojo;
import com.magneto.his.domain.YY_BRXX;
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
}
