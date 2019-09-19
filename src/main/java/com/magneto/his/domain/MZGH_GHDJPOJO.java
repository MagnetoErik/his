package com.magneto.his.domain;

import lombok.Data;

/**
 * 门诊挂号登记处查询历史信息POJO
 */
@Data
public class MZGH_GHDJPOJO {
    private Integer cardCode;
    private String brxx_name;
    private String deptName;
    private double je;

    public MZGH_GHDJPOJO() {
    }

    public MZGH_GHDJPOJO(Integer cardCode, String brxx_name, String deptName, double je) {
        this.cardCode = cardCode;
        this.brxx_name = brxx_name;
        this.deptName = deptName;
        this.je = je;
    }
}
