package com.magneto.his.domain;

import lombok.Data;

/**
 * 门诊医生主界面 开立处方 按照输入的字段查询指定的药品信息
 * MZYS_SelectMsgReturnPojo  就是返回的药品信息pojo
 */
@Data
public class MZYS_SelectMsgReturnPojo {

    private Integer ggid;//id
    private String yppm;//名称
    private String pym;//拼音码
    private String ypgg;//规格
    private double ypdj;//单价
    private String ypdw;//单位
    private Integer ypkc;//库存
    private String zxks;//执行科室
    private String sccj;//生产厂家
}
