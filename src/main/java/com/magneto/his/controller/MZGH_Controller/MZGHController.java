package com.magneto.his.controller.MZGH_Controller;

import com.alibaba.fastjson.JSON;
import com.magneto.his.domain.*;
import com.magneto.his.service.MZGHService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

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
        return JSON.toJSONString(mzghService.selectBrxx(params));
    }

    /**
     * 门诊挂号登记
     * @return 1或者0   1代表登记成功
     */
    @PostMapping(value = "/MZGHDJ",produces="text/html")
    @ResponseBody
    public String MZGHDJ(HttpServletRequest request,MZGH_MZGHDJInSystemPOJO params){
        HttpSession session = request.getSession();
        Employee emp = (Employee) session.getAttribute("emp");
        params.setSfy(Integer.parseInt(emp.getUsername()));
        return JSON.toJSONString(mzghService.MZGHDJ(params));
    }

    /**
     * 挂号登记页面选择挂号级别查询相应的价格
     * @return
     */
    @PostMapping(value = "/getMoney",produces="text/html")
    @ResponseBody
    public String getMoney(Integer level){
        return JSON.toJSONString(mzghService.getMoney(level));
    }


    /**
     * 门诊划价表登记
     * @param hjb
     * @return
     */
    @RequestMapping(value = "/insertHJB",produces="text/html")
    @ResponseBody
    public String insertHJB(HJBPOJO hjb,HttpServletRequest request){
        HttpSession session = request.getSession();
        Employee emp =(Employee) session.getAttribute("emp");
        hjb.setHjy(Integer.parseInt(emp.getUsername()));
        hjb.setYsdm(Integer.parseInt(emp.getUsername()));
        return JSON.toJSONString(mzghService.insertHJB(hjb));
    }

    /**
     * 获得历史挂号信息
     * @return 挂号信息
     */
    @PostMapping(value = "/getGHXXList",produces="text/html")
    @ResponseBody
    public String getGHXXList(Integer pageNum){
        if(pageNum==null){
            pageNum=1;
        }
        return JSON.toJSONString(mzghService.getGHXXList(pageNum));
    }


}
