package com.magneto.his.controller.YF_Controller;

import com.alibaba.fastjson.JSON;
import com.magneto.his.domain.MZGH_MZSFInsertPOJO;
import com.magneto.his.domain.MZGH_MZSFPOJO;
import com.magneto.his.mapper.MZGHMapper;
import com.magneto.his.service.YFService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/yf")
public class YFController {


    @Autowired
    private YFService yfService;

    @Autowired
    private MZGHMapper mzghMapper;

    /**
     * 药房管理系统 门诊发药
     *
     * @param params 病人信息id  和   ghxx_id
     * @return
     */
    @PostMapping(value = "/fy", produces="text/html")
    @ResponseBody
    public String fy(@RequestBody MZGH_MZSFInsertPOJO params){
        return JSON.toJSONString(yfService.fy(params));
    }

    /**
     * 药房管理系统 门诊发药
     *
     * @param params cardCode：病人卡号
     *               brxx_id:病人信息id
     *               ghxx_id：挂号信息id
     *               yzzt = '已收费'
     * @return
     */
    @PostMapping(value = "/getFYXX", produces="text/html")
    @ResponseBody
    public String getFYXX(@RequestBody MZGH_MZSFPOJO params){
        return JSON.toJSONString(mzghMapper.getSFXX(params));
    }

    /**
     * 药房管理系统 门诊发药
     *
     * @param params 病人信息id  和   ghxx_id
     * @return
     */
    @PostMapping(value = "/ty", produces="text/html")
    @ResponseBody
    public String ty(@RequestBody MZGH_MZSFInsertPOJO params){
        return JSON.toJSONString(yfService.ty(params));
    }

    /**
     * 药房收入统计
     * @return 药房收入前8
     */
    @PostMapping(value = "/srtj", produces="text/html")
    @ResponseBody
    public String srtj(){
        return JSON.toJSONString(yfService.srtj());
    }
}
