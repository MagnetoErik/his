package com.magneto.his.controller.MZGH_Controller;

import com.alibaba.fastjson.JSON;
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

    @PostMapping(value = "/brkdj",produces="text/html")
    @ResponseBody
    public String brkdj(YY_BRXX brxx){
        Integer result = mzghService.insertBRXX(brxx);
        return JSON.toJSONString(result);
    }

    @GetMapping(value = "/getCardCode", produces="text/html")
    @ResponseBody
    public String getCardCode(){
        return  JSON.toJSONString(mzghService.getCardCode());
    }

    @PostMapping(value = "/getCardList",produces="text/html")
    @ResponseBody
    public String getCardList(String pageNum){
        return JSON.toJSONString(mzghService.getCardList(Integer.parseInt(pageNum)));
    }

    @PostMapping(value = "/selectByParams",produces="text/html")
    @ResponseBody
    public String selectByParams(SelectByParamsPOJO params,String pageNum){
        if(pageNum==null){
            pageNum="1";
        }
        return JSON.toJSONString(mzghService.selectByParams(params,Integer.parseInt(pageNum)));
    }


}
