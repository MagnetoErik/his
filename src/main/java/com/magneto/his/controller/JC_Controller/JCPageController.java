package com.magneto.his.controller.JC_Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/jc")
public class JCPageController {

    /**
     * 跳转到欢迎页面
     * @return
     */
    @GetMapping(value = "/jc_home", produces = "text/html")
    public String mzgh_home() {
        return "/pages/jc/jc_home";
    }
}
