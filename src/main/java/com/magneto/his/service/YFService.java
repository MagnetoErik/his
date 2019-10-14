package com.magneto.his.service;

import com.magneto.his.domain.MZGH_GHJBTJPOJO;
import com.magneto.his.domain.MZGH_MZSFInsertPOJO;

import java.util.List;

public interface YFService {

    /**
     * 药房管理系统 门诊发药
     *
     * @param params 病人信息id  和   ghxx_id
     * @return
     */
    Integer fy(MZGH_MZSFInsertPOJO params);


    /**
     * 药房管理系统 门诊退药
     *
     * @param params 病人信息id  和   ghxx_id
     * @return
     */
    Integer ty(MZGH_MZSFInsertPOJO params);

    /**
     * 药房收入统计
     * @return 药房收入前8
     */
    List<MZGH_GHJBTJPOJO> srtj();
}
