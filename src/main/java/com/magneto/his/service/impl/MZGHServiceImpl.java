package com.magneto.his.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.magneto.his.domain.*;
import com.magneto.his.mapper.MZGHMapper;
import com.magneto.his.service.MZGHService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class MZGHServiceImpl implements MZGHService {

    @Autowired
    private MZGHMapper mzghMapper;


    /**
     * 病人卡登记
     * @param brxx 病人信息
     * @return  返回1或0  1代表登记成功
     */
    @Override
    public Integer insertBRXX(YY_BRXX brxx) {
        return mzghMapper.insertBRXX(brxx);
    }


    /**
     * 病人卡登记页面新增按钮自动获取卡号
     * @return 卡号
     */
    @Override
    public Integer getCardCode() {
        return mzghMapper.getCardCode()+1;
    }


    /**
     * 病人卡登记处通过指定的条件以及分页查询病人卡信息
     * @param params  指定的条件
     * @param pageNum  页码
     * @return 查询病人卡信息
     */
    @Override
    public Map<String ,Object> selectByParams(SelectByParamsPOJO params,Integer pageNum) {
        PageHelper.startPage(pageNum,12);
        List<YY_BRXX> cardList = mzghMapper.selectByParams(params);
        PageInfo pageInfo = new PageInfo(cardList);
        Map<String ,Object> map = new HashMap<>();
        map.put("cardList",cardList);
        map.put("pageInfo",pageInfo);
        return map;
    }

    /**
     * 门诊挂号登记处通过卡号或者身份证号回车检索病人信息
     * @param params 卡号或者身份证号
     * @return 病人信息
     */
    @Override
    public YY_BRXX selectBrxx(MZGH_MZGHDJParamsPOJO params) {
        return mzghMapper.selectOneBrxx(params);
    }

    /**
     *门诊挂号登记
     * @param params
     * @return
     */
    @Override
    public Integer MZGHDJ(MZGH_MZGHDJInSystemPOJO params) {
        return mzghMapper.MZGHDJ(params);
    }

    /**
     * 挂号登记页面选择挂号级别查询相应的价格
     * @return  价格
     */
    @Override
    public double getMoney(Integer level) {
        return mzghMapper.getMoney(level);
    }

    /**
     * 门诊划价表登记
     * @param hjb
     * @return
     */
    @Override
    public Integer insertHJB(HJBPOJO hjb) {
        return mzghMapper.insertHJB(hjb);
    }

    /**
     *门诊挂号登记界面查询历史挂号信息
     * @param pageNum  页码
     * @return 分页信息   历史挂号信息
     */
    @Override
    public Map<String ,Object> getGHXXList(Integer pageNum) {
        PageHelper.startPage(pageNum,8);
        List<MZGH_GHDJPOJO> ghxx = mzghMapper.getGHXXList();
        PageInfo pageInfo = new PageInfo(ghxx);
        Map<String ,Object> map = new HashMap<>();
        map.put("ghxx",ghxx);
        map.put("pageInfo",pageInfo);
        return map;
    }

    /**
     * 门诊挂号系统 挂号级别统计
     * @return
     */
    @Override
    public List<MZGH_GHJBTJPOJO> ghjbtj() {
        return mzghMapper.ghjbtj();
    }

    /**
     * 门诊收费页面 通过指定的参数查询收费信息
     * @param params 参数列表
     * @return 收费信息
     */
    @Override
    public List<MZGH_MZSFPOJO> getSFXX(MZGH_MZSFPOJO params) {
        return mzghMapper.getSFXX(params);
    }

    /**
     * 门诊收费页面 将病人信息 挂号信息 收费金额写入数据库
     * @param params 病人信息 挂号信息 收费金额
     * @return 1 代表成功  0  代表失败
     */
    @Override
    public Integer MZSFinsert(MZGH_MZSFInsertPOJO params) {
        if(mzghMapper.MZSFinsert(params)==1){
            return mzghMapper.updateYZZT(params);
        }
        else{
            return 0;
        }
    }

    /**
     *  门诊收费页面   门诊退号退卡
     * @param cardCode 卡号
     * @param brxx_idCard  身份证号
     * @return  受影响的行数
     */
    @Override
    public Integer th(Integer cardCode, String brxx_idCard) {
        return mzghMapper.th(cardCode,brxx_idCard);
    }

    /**
     *门诊收费页面   门诊退费
     * @param params 病人信息id  挂号信息id
     * @return 受影响的行数
     */
    @Override
    public Integer tf(MZGH_MZSFInsertPOJO params) {
        return mzghMapper.tf(params);
    }
}
