package com.magneto.his.controller.MZGH_Controller;

import com.alibaba.fastjson.JSON;
import com.magneto.his.domain.*;
import com.magneto.his.service.MZGHService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.Map;

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
    public String selectByParams(SelectByParamsPOJO params,Integer pageNum){
        if(pageNum==null){
            pageNum=1;
        }
        return JSON.toJSONString(mzghService.selectByParams(params,pageNum));
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
    public String getGHXXList(@RequestBody Map map){
        Integer pageNum = (Integer) map.get("pageNum");
        if(pageNum==null){
            pageNum=1;
        }
        return JSON.toJSONString(mzghService.getGHXXList(pageNum));
    }

    /**
     * 挂号级别统计
     * @return
     */
    @PostMapping(value = "/ghjbtj",produces="text/html")
    @ResponseBody
    public String ghjbtj(){
        return JSON.toJSONString(mzghService.ghjbtj());
    }


    /**
     * 门诊收费页面 通过指定的参数查询收费信息
     * @param params 参数列表
     * @return 收费信息
     */
    @PostMapping(value = "/getSFXX",produces="text/html")
    @ResponseBody
    public String getSFXX(@RequestBody MZGH_MZSFPOJO params){
        return JSON.toJSONString(mzghService.getSFXX(params));
    }


    /**
     * 门诊收费页面 将病人信息 挂号信息 收费金额写入数据库
     * @param params 病人信息 挂号信息 收费金额
     * @return 1 代表成功  0  代表失败
     */
    @PostMapping(value = "/MZSFinsert",produces="text/html")
    @ResponseBody
    public String MZSFinsert(@RequestBody MZGH_MZSFInsertPOJO params){
        return JSON.toJSONString(mzghService.MZSFinsert(params));
    }


    /**
     *  门诊收费页面   门诊退号退卡
     * @param cardCode 卡号
     * @param brxx_idCard  身份证号
     * @return  受影响的行数
     */
    @GetMapping(value = "/th",produces="text/html")
    @ResponseBody
    public String th(Integer cardCode,String brxx_idCard){
        System.out.println(cardCode+"-------"+brxx_idCard);
        return JSON.toJSONString(mzghService.th(cardCode,brxx_idCard));
    }



    /**
     *门诊收费页面   门诊退费
     * @param params 病人信息id  挂号信息id
     * @return 受影响的行数
     */
    @PostMapping(value = "/tf",produces="text/html")
    @ResponseBody
    public String tf(@RequestBody MZGH_MZSFInsertPOJO params){
        return JSON.toJSONString(mzghService.tf(params));
    }






}
