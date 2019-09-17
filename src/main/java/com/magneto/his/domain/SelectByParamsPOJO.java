package com.magneto.his.domain;

import lombok.Data;

/**
 * 病人卡登记界面通过以下指定的参数查询病人卡信息
 */
@Data
public class SelectByParamsPOJO {
    String Brxx_Card;
    String Brxx_Name;
    String Brxx_Phone;
    String Brxx_Start_Birth;
    String Brxx_End_Birth;
    String Card_Start_registrationTime;
    String Card_End_registrationTime;
}
