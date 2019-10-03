package com.magneto.his.domain;

import lombok.Data;

/**
 * 门诊医生开医嘱后点击保存pojo
 */
@Data
public class MZYS_SavePOJO {

    private Integer brxx_id;//病人信息id
    private Integer ghxx_id;//挂号信息id
    private String kzsj;//开嘱时间
    private String ggid;//医嘱内容关联yf_ypxx
    private Integer jl;//剂量
    private String dw;//单位
    private Integer pc;//频次
    private String yf;//用法
    private Integer ts;//天数
    private Double dj;//单价
    private Double zje;//总金额

    public MZYS_SavePOJO() {
    }

    public MZYS_SavePOJO(Integer brxx_id, Integer ghxx_id, String kzsj, String ggid, Integer jl, String dw, Integer pc, String yf, Integer ts, Double dj, Double zje) {
        this.brxx_id = brxx_id;
        this.ghxx_id = ghxx_id;
        this.kzsj = kzsj;
        this.ggid = ggid;
        this.jl = jl;
        this.dw = dw;
        this.pc = pc;
        this.yf = yf;
        this.ts = ts;
        this.dj = dj;
        this.zje = zje;
    }
}
