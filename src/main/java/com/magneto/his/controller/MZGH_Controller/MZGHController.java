package com.magneto.his.controller.MZGH_Controller;

import com.alibaba.fastjson.JSON;
import com.magneto.his.domain.MZGH_MZGHDJParamsPOJO;
import com.magneto.his.domain.SelectByParamsPOJO;
import com.magneto.his.domain.YY_BRXX;
import com.magneto.his.service.MZGHService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MZGHController {


    @Autowired
    private MZGHService mzghService;

    /**
     * 病人卡登记页面登记病人信息
     * @param brxx
     * @return 1 登记成功 跳转到挂号页面
     */
    @PostMapping(value = "/brkdj",produces="text/html")
    @ResponseBody
    public String brkdj(YY_BRXX brxx){
        Integer result = mzghService.insertBRXX(brxx);
        return JSON.toJSONString(result);
    }

    /**
     * 病人卡登记点击新增自动获取下一位卡号
     * @return
     */
    @GetMapping(value = "/getCardCode", produces="text/html")
    @ResponseBody
    public String getCardCode(){
        return  JSON.toJSONString(mzghService.getCardCode());
    }


    /**
     * 通过分页病人卡登记通过指定的信息检索病人卡信息
     * @param params  参数
     * @param pageNum 页码
     * @return  返回病人信息
     */
    @PostMapping(value = "/selectByParams",produces="text/html")
    @ResponseBody
    public String selectByParams(SelectByParamsPOJO params,String pageNum){
        if(pageNum==null){
            pageNum="1";
        }
        return JSON.toJSONString(mzghService.selectByParams(params,Integer.parseInt(pageNum)));
    }

    /**
     * 门诊挂号界面 输入卡号或者身份证号回车查询病人信息填充到页面
     * @return
     */
    @PostMapping(value = "/selectBrxx",produces="text/html")
    @ResponseBody
    public String selectBrxx(MZGH_MZGHDJParamsPOJO params){
        System.out.println(params);
        return JSON.toJSONString(mzghService.selectBrxx(params));
    }


}
