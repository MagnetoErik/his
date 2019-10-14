package com.magneto.his.service.impl;

import com.magneto.his.domain.MZGH_GHJBTJPOJO;
import com.magneto.his.domain.MZGH_MZSFInsertPOJO;
import com.magneto.his.mapper.YFMapper;
import com.magneto.his.service.YFService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class YFServiceImpl implements YFService {

    @Autowired
    private YFMapper yfMapper;

    /**
     * 药房管理系统 门诊发药
     *
     * @param params 病人信息id  和   ghxx_id
     * @return
     */
    @Override
    public Integer fy(MZGH_MZSFInsertPOJO params) {
        return yfMapper.fy(params);
    }


    /**
     * 药房管理系统 门诊退药
     *
     * @param params 病人信息id  和   ghxx_id
     * @return
     */
    @Override
    public Integer ty(MZGH_MZSFInsertPOJO params) {
        return yfMapper.ty(params);
    }

    /**
     * 药房收入统计
     * @return 药房收入前8
     */
    @Override
    public List<MZGH_GHJBTJPOJO> srtj() {
        return yfMapper.srtj();
    }
}
