package com.magneto.his.mapper;

import com.magneto.his.domain.SelectByParamsPOJO;
import com.magneto.his.domain.YY_BRXX;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;


@Mapper
public interface MZGHMapper {

    List<YY_BRXX> selectBRXX();

    Integer insertBRXX(YY_BRXX brxx);

    Integer getCardCode();

    List<YY_BRXX> getCardList();

    Integer insert(YY_BRXX brxx);

    List<YY_BRXX> selectByParams(SelectByParamsPOJO params);
}
