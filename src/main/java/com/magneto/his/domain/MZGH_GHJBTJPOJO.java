package com.magneto.his.domain;

import lombok.Data;

/**
 * 门诊挂号登记 挂号级别统计pojo
 */
@Data
public class MZGH_GHJBTJPOJO {

    private String name;  //挂号级别

    private Integer value;  //挂号人数

    public MZGH_GHJBTJPOJO() {
    }

    public MZGH_GHJBTJPOJO(String name, Integer value) {
        this.name = name;
        this.value = value;
    }
}
