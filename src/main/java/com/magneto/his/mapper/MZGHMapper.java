package com.magneto.his.mapper;

import com.magneto.his.domain.MZGH_MZGHDJParamsPOJO;
import com.magneto.his.domain.SelectByParamsPOJO;
import com.magneto.his.domain.YY_BRXX;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;


@Mapper
public interface MZGHMapper {


    /**
     *
     * @param brxx
     * @return
     */
    Integer insertBRXX(YY_BRXX brxx);

    /**
     * 病人卡登记处自动获取卡号
     * @return
     */
    Integer getCardCode();

    /**
     *病人卡登记
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

//    Integer MZGHDJ();
}
