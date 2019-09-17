package com.magneto.his.service;

import com.magneto.his.domain.MZGH_MZGHDJParamsPOJO;
import com.magneto.his.domain.SelectByParamsPOJO;
import com.magneto.his.domain.YY_BRXX;

import java.util.Map;

public interface MZGHService {

    Integer insertBRXX(YY_BRXX brxx);

    Integer getCardCode();

    Map<String ,Object> selectByParams(SelectByParamsPOJO params,Integer pageNum);

    YY_BRXX selectBrxx(MZGH_MZGHDJParamsPOJO params);

//    Integer MZGHDJ();
}
