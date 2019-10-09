package com.magneto.his.domain;

import lombok.Data;


/**
 * 门诊收费将病人信息 挂号信息 收费金额写入数据库POJO （参数列表）
 */
@Data
public class MZGH_MZSFInsertPOJO {

    private Integer fp_id;
    private Integer brxx_id;
    private Integer ghxx_id;
    private Double sum;

    public MZGH_MZSFInsertPOJO() {
    }

    public MZGH_MZSFInsertPOJO(Integer fp_id, Integer brxx_id, Integer ghxx_id, Double sum) {
        this.fp_id = fp_id;
        this.brxx_id = brxx_id;
        this.ghxx_id = ghxx_id;
        this.sum = sum;
    }
}
