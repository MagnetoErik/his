package com.magneto.his.mapper;

import com.magneto.his.domain.YY_BRXX;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;


@Mapper
public interface YY_BRXXMapper {

    List<YY_BRXX> selectBRXX();

    Integer insertBRXX();
}
