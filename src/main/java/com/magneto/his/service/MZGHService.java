package com.magneto.his.service;

import com.magneto.his.domain.*;

import java.util.List;
import java.util.Map;

public interface MZGHService {

    /**
     * 病人卡登记
     * @param brxx 病人信息
     * @return  返回1或0  1代表登记成功
     */
    Integer insertBRXX(YY_BRXX brxx);

    /**
     * 病人卡登记页面新增按钮自动获取卡号
     * @return 卡号
     */
    Integer getCardCode();

    /**
     * 病人卡登记处通过指定的条件以及分页查询病人卡信息
     * @param params  指定的条件
     * @param pageNum  页码
     * @return 指定分页的病人卡信息
     */
    Map<String ,Object> selectByParams(SelectByParamsPOJO params,Integer pageNum);


    /**
     * 门诊挂号登记处通过卡号或者身份证号回车检索病人信息
     * @param params 卡号或者身份证号
     * @return 指定的病人信息
     */
    YY_BRXX selectBrxx(MZGH_MZGHDJParamsPOJO params);


    /**
     * 门诊挂号登记
     * @return 1或者0   1代表登记成功
     */
    Integer MZGHDJ(MZGH_MZGHDJInSystemPOJO params);

    /**
     * 挂号登记页面选择挂号级别查询相应的价格
     * @return  价格
     */
    double getMoney(Integer level);

    /**
     * 门诊划价表登记
     * @param hjb
     * @return
     */
    Integer insertHJB(HJBPOJO hjb);


    /**
     * 门诊挂号登记界面查询历史挂号信息
     * @return  历史挂号信息
     */
    Map<String ,Object> getGHXXList(Integer pageNum);

    /**
     * 门诊挂号系统 挂号级别统计
     * @return
     */
    List<MZGH_GHJBTJPOJO> ghjbtj();

    /**
     * 门诊收费页面 通过指定的参数查询收费信息
     * @param params 参数列表
     * @return 收费信息
     */
    List<MZGH_MZSFPOJO> getSFXX(MZGH_MZSFPOJO params);


    /**
     * 门诊收费页面 将病人信息 挂号信息 收费金额写入数据库
     * @param params 病人信息 挂号信息 收费金额
     * @return 1 代表成功  0  代表失败
     */
    Integer MZSFinsert(MZGH_MZSFInsertPOJO params);


    /**
     *  门诊收费页面   门诊退号退卡
     * @param cardCode 卡号
     * @param brxx_idCard  身份证号
     * @return  受影响的行数
     */
    Integer th(Integer cardCode,String brxx_idCard);


    /**
     *门诊收费页面   门诊退费
     * @param params 病人信息id  挂号信息id
     * @return 受影响的行数
     */
    Integer tf(MZGH_MZSFInsertPOJO params);
}
