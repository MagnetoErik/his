package com.magneto.his.controller.MZYS_Controller;

import com.alibaba.fastjson.JSON;
import com.magneto.his.domain.MZGH_MZGHDJParamsPOJO;
import com.magneto.his.domain.MZYS_SavePOJO;
import com.magneto.his.domain.MZYS_UpdateBRZT;
import com.magneto.his.service.MZYSService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.Map;

@Controller
@RequestMapping("/mzys")
public class MZYSController {

    @Autowired
    private MZYSService mzysService;

    @PostMapping(value = "/getMsg",produces="text/html")
    @ResponseBody
    public String getMsg(@RequestBody Map param){
        return JSON.toJSONString(mzysService.getMsg(param.get("param").toString()));
    }


    @PostMapping(value = "/waitList",produces="text/html")
    @ResponseBody
    public String waitList(HttpServletRequest request){
        HttpSession session = request.getSession();
        Integer id =(Integer) session.getAttribute("dept_id");
        return JSON.toJSONString(mzysService.waitList(id));
    }

    @PostMapping(value = "/nowList",produces="text/html")
    @ResponseBody
    public String nowList(HttpServletRequest request){
        HttpSession session = request.getSession();
        Integer id =(Integer) session.getAttribute("dept_id");
        return JSON.toJSONString(mzysService.nowList(id));
    }

    @PostMapping(value = "/updateBRZT",produces="text/html")
    @ResponseBody
    public String updateBRZT(@RequestBody MZYS_UpdateBRZT param){
        return JSON.toJSONString(mzysService.updateBRZT(param));
    }

    /**
     * 开医嘱保存
     * @param params  参数列表
     * @return  受影响的行数
     */
    @PostMapping(value = "/save",produces="text/html")
    @ResponseBody
    public String save(@RequestBody  MZYS_SavePOJO params){
        System.out.println(params);
        return JSON.toJSONString(mzysService.save(params));
    }


    /**
     * 医生接诊输入卡号或者身份证号查找病人挂号信息
     * @param params 卡号或者身份证号
     * @return 病人挂号信息
     */
    @PostMapping(value = "/selectGHXX",produces="text/html")
    @ResponseBody
    public String selectGHXX(MZGH_MZGHDJParamsPOJO params){
        return JSON.toJSONString(mzysService.selectGHXX(params));
    }



}
