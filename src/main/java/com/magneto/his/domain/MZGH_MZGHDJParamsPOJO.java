package com.magneto.his.domain;

import lombok.Data;

/**
 * 门诊挂号界面 输入卡号或者身份证号回车查询病人信息填充到页面
 */
@Data
public class MZGH_MZGHDJParamsPOJO {

    private Integer cardCode;
    private String brxx_idCard;

    public MZGH_MZGHDJParamsPOJO() {
    }

    public MZGH_MZGHDJParamsPOJO(Integer cardCode, String brxx_idCard) {
        this.cardCode = cardCode;
        this.brxx_idCard = brxx_idCard;
    }
}
