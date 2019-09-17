package com.magneto.his.controller.MZGH_Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/mzgh")
public class MZGHPageController {


    /**
     * 跳转到欢迎页面
     * @return
     */
    @GetMapping(value = "/mzgh_home", produces = "text/html")
    public String mzgh_mzgh() {
        return "/pages/mzgh/mzgh_home";
    }

    /**
     * 跳转到病人卡登记页面
     * @return
     */
    @GetMapping(value = "/mzgh_brkdj", produces = "text/html")
    public String mzgh_brkdj() {
        return "/pages/mzgh/mzgh_brkdj";
    }

    /**
     * 跳转到门诊挂号登记页面
     * @return
     */
    @GetMapping(value = "/mzgh_mzghdj", produces = "text/html")
    public String mzgh_mzghdj() {
        return "/pages/mzgh/mzgh_mzghdj";
    }

    /**
     * 跳转到门诊收费页面
     * @return
     */
    @GetMapping(value = "/mzgh_mzsf", produces = "text/html")
    public String mzgh_mzsf() {
        return "/pages/mzgh/mzgh_mzsf";
    }


}
