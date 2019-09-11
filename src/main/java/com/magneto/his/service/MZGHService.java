package com.magneto.his.service;

import com.magneto.his.domain.SelectByParamsPOJO;
import com.magneto.his.domain.YY_BRXX;

import java.util.Map;

public interface MZGHService {

    Integer insertBRXX(YY_BRXX brxx);

    Integer getCardCode();

    Map<String , Object> getCardList(Integer pageNum);

    Map<String ,Object> selectByParams(SelectByParamsPOJO params,Integer pageNum);

}
