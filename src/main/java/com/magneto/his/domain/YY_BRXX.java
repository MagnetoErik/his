package com.magneto.his.domain;

import lombok.Data;

import java.util.Date;

@Data
public class YY_BRXX {

    private int brxx_id;
    private String brxx_name;
    private String brxx_sex;
    private String brxx_phone;
    private Date brxx_birth;
    //诊疗卡
    private YY_KDJB yy_kdjb;

    public YY_BRXX() {
    }

    public YY_BRXX(int brxx_id, String brxx_name, String brxx_sex, String brxx_phone, Date brxx_birth, YY_KDJB yy_kdjb) {
        this.brxx_id = brxx_id;
        this.brxx_name = brxx_name;
        this.brxx_sex = brxx_sex;
        this.brxx_phone = brxx_phone;
        this.brxx_birth = brxx_birth;
        this.yy_kdjb = yy_kdjb;
    }
}
