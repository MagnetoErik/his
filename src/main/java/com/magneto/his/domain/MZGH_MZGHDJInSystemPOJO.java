package com.magneto.his.domain;

import lombok.Data;

/**
 * 门诊挂号登记
 */
@Data
public class MZGH_MZGHDJInSystemPOJO {

    private Integer brxx_id;//病人信息id
    private Integer ghks;//挂号科室id
    private Integer ghjb;//挂号级别
    private Integer sfy;//收费员工号

    public MZGH_MZGHDJInSystemPOJO() {
    }

    public MZGH_MZGHDJInSystemPOJO(Integer brxx_id, Integer ghks, Integer ghjb, Integer sfy) {
        this.brxx_id = brxx_id;
        this.ghks = ghks;
        this.ghjb = ghjb;
        this.sfy = sfy;
    }
}
