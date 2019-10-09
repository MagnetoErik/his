package com.magneto.his.domain;

import lombok.Data;

/**
 * 门诊挂号系统 门诊收费列表
 * 门诊收费页面 通过指定的参数查询收费信息 （参数列表）
 * 收费列表和参数列表
 */
@Data
public class MZGH_MZSFPOJO {
    private Integer id;//id
    private Integer cardCode;
    private String brxx_idCard;
    private Integer brxx_id;
    private Integer ghxx_id;
    private String brxx_name;
    private String brxx_phone;
    private String brxx_address;
    private String yppm;//医嘱内容
    private Integer jl;//剂量
    private String dw;//单位
    private Integer pc;//频次
    private String yf;//用法
    private String ypgg;//规格
    private Double dj;//单价
    private Double zje;//总金额
    private String sccj;//生产厂家
    private String zxks;//执行科室

    public MZGH_MZSFPOJO() {
    }

    public MZGH_MZSFPOJO(Integer id, Integer cardCode, String brxx_idCard, Integer brxx_id, Integer ghxx_id, String brxx_name, String brxx_phone, String brxx_address, String yppm, Integer jl, String dw, Integer pc, String yf, String ypgg, Double dj, Double zje, String sccj, String zxks) {
        this.id = id;
        this.cardCode = cardCode;
        this.brxx_idCard = brxx_idCard;
        this.brxx_id = brxx_id;
        this.ghxx_id = ghxx_id;
        this.brxx_name = brxx_name;
        this.brxx_phone = brxx_phone;
        this.brxx_address = brxx_address;
        this.yppm = yppm;
        this.jl = jl;
        this.dw = dw;
        this.pc = pc;
        this.yf = yf;
        this.ypgg = ypgg;
        this.dj = dj;
        this.zje = zje;
        this.sccj = sccj;
        this.zxks = zxks;
    }
}
