package com.magneto.his.controller.MZHS_Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/mzhs")
public class MZHSPageController {

    /**
     * 跳转到欢迎页面
     * @return
     */
    @GetMapping(value = "/mzhs_home", produces = "text/html")
    public String mzhs_home() {
        return "/pages/mzhs/mzhs_home";
    }

}
