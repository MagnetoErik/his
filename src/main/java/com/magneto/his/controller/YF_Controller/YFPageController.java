package com.magneto.his.controller.YF_Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/yf")
public class YFPageController {


    /**
     * 跳转到欢迎页面
     * @return
     */
    @GetMapping(value = "/yf_home", produces = "text/html")
    public String yf_home() {
        return "/pages/yf/yf_home";
    }

    /**
     * 跳转到门诊发药
     * @return
     */
    @GetMapping(value = "/yf_mzfy", produces = "text/html")
    public String yf_mzfy() {
        return "/pages/yf/yf_mzfy";
    }

    /**
     * 跳转到门诊退药
     * @return
     */
    @GetMapping(value = "/yf_mzty", produces = "text/html")
    public String yf_mzty() {
        return "/pages/yf/yf_mzty";
    }

    /**
     * 跳转到药房收入统计
     * @return
     */
    @GetMapping(value = "/yf_yfsrtj", produces = "text/html")
    public String yf_yfsrtj() {
        return "/pages/yf/yf_yfsrtj";
    }
}


