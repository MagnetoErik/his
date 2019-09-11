package com.magneto.his.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.magneto.his.domain.SelectByParamsPOJO;
import com.magneto.his.domain.YY_BRXX;
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


    @Override
    public Integer insertBRXX(YY_BRXX brxx) {
        return mzghMapper.insertBRXX(brxx);
    }


    @Override
    public Integer getCardCode() {
        return mzghMapper.getCardCode()+1;
    }

    @Override
    public Map<String , Object> getCardList(Integer pageNum) {
        PageHelper.startPage(pageNum,10);
        List<YY_BRXX> cardList = mzghMapper.getCardList();
        PageInfo pageInfo = new PageInfo(cardList);
        Map<String , Object> map = new HashMap<>();
        map.put("cardList",cardList);
        map.put("pageInfo",pageInfo);
        return map;

    }

    @Override
    public Map<String ,Object> selectByParams(SelectByParamsPOJO params,Integer pageNum) {
        System.out.println(params);
        PageHelper.startPage(pageNum,10);
        List<YY_BRXX> cardList = mzghMapper.selectByParams(params);
        PageInfo pageInfo = new PageInfo(cardList);
        Map<String ,Object> map = new HashMap<>();
        map.put("cardList",cardList);
        map.put("pageInfo",pageInfo);
        return map;
    }
}
