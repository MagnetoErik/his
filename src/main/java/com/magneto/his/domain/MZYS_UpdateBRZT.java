package com.magneto.his.domain;

import lombok.Data;

/**
 * 门诊医生主界面双击候诊病人接诊POJO
 */
@Data
public class MZYS_UpdateBRZT {

    private Integer hjid;
    private Integer bz;

    public MZYS_UpdateBRZT() {
    }

    public MZYS_UpdateBRZT(Integer hjid, Integer bz) {
        this.hjid = hjid;
        this.bz = bz;
    }
}
