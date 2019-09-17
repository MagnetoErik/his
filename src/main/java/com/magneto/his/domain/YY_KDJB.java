package com.magneto.his.domain;

import lombok.Data;

/**
 * 病人卡pojo
 */
@Data
public class YY_KDJB {

    private int cardCode;
    private int brxx_id;
    private String registrationTime;

    public YY_KDJB() {
    }

    public YY_KDJB(int cardCode, int brxx_id, String registrationTime) {
        this.cardCode = cardCode;
        this.brxx_id = brxx_id;
        this.registrationTime = registrationTime;
    }
}
