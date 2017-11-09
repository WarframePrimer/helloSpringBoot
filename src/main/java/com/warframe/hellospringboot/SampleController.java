package com.warframe.hellospringboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @Author warframe[github.com/WarframePrimer]
 * @Date 2017/11/9 16:30
 */

@Controller
@EnableAutoConfiguration
public class SampleController {

    @RequestMapping("/")
    @ResponseBody
    String home(){
        return "hello world";
    }

    public static void main(String[] args){
        SpringApplication.run(SampleController.class,args);

    }

}
