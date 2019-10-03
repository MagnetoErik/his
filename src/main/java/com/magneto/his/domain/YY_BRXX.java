package com.magneto.his.domain;

import lombok.Data;

/**
 * 病人信息pojo
 */
@Data
public class YY_BRXX {

    private int hjid;
    private int ghxx_id;
    private int brxx_id;
    private String brxx_name;
    private int brxx_age;
    private String brxx_sex;
    private String brxx_phone;
    private String brxx_birth;
    private String brxx_address;
    private String brxx_idCard;
    private YY_KDJB yy_kdjb;

    public YY_BRXX() {
    }


    public YY_BRXX(int brxx_id, String brxx_name, int brxx_age, String brxx_sex, String brxx_phone, String brxx_birth, String brxx_address, String brxx_idCard) {
        this.brxx_id = brxx_id;
        this.brxx_name = brxx_name;
        this.brxx_age = brxx_age;
        this.brxx_sex = brxx_sex;
        this.brxx_phone = brxx_phone;
        this.brxx_birth = brxx_birth;
        this.brxx_address = brxx_address;
        this.brxx_idCard = brxx_idCard;
    }

    public YY_BRXX(int brxx_id, String brxx_name, int brxx_age, String brxx_sex, String brxx_phone, String brxx_birth, String brxx_address, String brxx_idCard, YY_KDJB yy_kdjb) {
        this.brxx_id = brxx_id;
        this.brxx_name = brxx_name;
        this.brxx_age = brxx_age;
        this.brxx_sex = brxx_sex;
        this.brxx_phone = brxx_phone;
        this.brxx_birth = brxx_birth;
        this.brxx_address = brxx_address;
        this.brxx_idCard = brxx_idCard;
        this.yy_kdjb = yy_kdjb;
    }
}
