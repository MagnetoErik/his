package com.magneto.his.controller.MZGH_Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/mzgh")
public class MZGHPageController {


    @GetMapping(value = "/mzgh_home",produces="text/html")
    public String mzgh_mzgh(){
        return "/pages/mzgh/mzgh_home";
    }

    @GetMapping(value = "/mzgh_brkdj",produces="text/html")
    public String mzgh_brkdj(){
        return "/pages/mzgh/mzgh_brkdj";
    }

    @GetMapping(value = "/mzgh_mzghdj",produces="text/html")
    public String mzgh_mzghdj(){
        return "/pages/mzgh/mzgh_mzghdj";
    }

    @GetMapping(value = "/mzgh_mzsf",produces="text/html")
    public String mzgh_mzsf(){
        return "/pages/mzgh/mzgh_mzsf";
    }


}
