package com.magneto.his.controller.MZYS_Controller;

import com.alibaba.fastjson.JSON;
import com.magneto.his.domain.MZYS_SelectMsgReturnPojo;
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
        System.out.println(param.get("param"));
        return JSON.toJSONString(mzysService.getMsg(param.get("param").toString()));
    }

    @PostMapping(value = "/insert",produces="text/html")
    @ResponseBody
    public String insert(@RequestBody  MZYS_SelectMsgReturnPojo params){
        System.out.println(params);
        return null;
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


}
