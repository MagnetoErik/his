package com.magneto.his.mapper;

import com.magneto.his.domain.*;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;


@Mapper
public interface MZGHMapper {


    /**
     *病人卡登记
     * @param brxx 病人信息
     * @return
     */
    Integer insertBRXX(YY_BRXX brxx);

    /**
     * 病人卡登记页面新增按钮自动获取卡号
     * @return
     */
    Integer getCardCode();

    /**
     * HisApplicationTests 中批量添加病人卡信息
     * @param brxx 病人信息
     * @return
     */
    Integer insert(YY_BRXX brxx);

    /**
     * 病人卡登记处通过指定的条件查询病人卡信息
     * @param params 指定的条件
     * @return
     */
    List<YY_BRXX> selectByParams(SelectByParamsPOJO params);

    /**
     * 门诊挂号登记处通过卡号或者身份证号回车检索病人信息
     * @param params
     * @return
     */
    YY_BRXX selectOneBrxx(MZGH_MZGHDJParamsPOJO params);

    /**
     * 门诊挂号登记
     * @return
     */
    Integer MZGHDJ(MZGH_MZGHDJInSystemPOJO params);

    /**
     * 挂号登记页面选择挂号级别查询相应的价格
     * @return  价格
     */
    double getMoney(Integer level);

    /**
     * 门诊划价表登记  (挂号登记)
     * @param hjb
     * @return
     */
    Integer insertHJB(HJBPOJO hjb);

    /**
     * 门诊挂号登记界面查询历史挂号信息
     * @return  历史挂号信息
     */
    List<MZGH_GHDJPOJO> getGHXXList();

    /**
     * 门诊挂号系统 挂号级别统计
     * @return
     */
    List<MZGH_GHJBTJPOJO> ghjbtj();

}
