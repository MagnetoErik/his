package com.magneto.his.controller.MZYS_Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/mzys")
public class MZYSPageController {

    /**
     * 跳转到欢迎页面
     * @return
     */
    @GetMapping(value = "/mzys_home", produces = "text/html")
    public String mzys_home() {
        return "/pages/mzys/mzys_home";
    }

}
