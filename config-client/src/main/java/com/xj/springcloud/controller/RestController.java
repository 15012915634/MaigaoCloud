package com.xj.springcloud.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;

import java.text.SimpleDateFormat;
import java.util.Date;
/*import org.springframework.web.bind.annotation.RestController;*/

@org.springframework.web.bind.annotation.RestController
@RefreshScope//使用该注解的类，会在接到SpringCloud配置中心配置刷新的时候，自动将新的配置更新到该类对应的字段中。
public class RestController {
    @Value("${spring.application.name}")
    private String applicationName;
    @Value("${server.port}")
    private String port;
    @Value("${constant.name}")
    private String userName;
    @Value("${constant.password}")
    private String password;

    @GetMapping("/rest")
    public String rest(){
        System.out.println("applicationName:"+applicationName+"    ,port:"+port+"    ,userName:"+userName+"    ,password:"+password);
        return "applicationName:"+applicationName+"    ,port:"+port+"    ,userName:"+userName+"    ,password:"+password;
    }


    public static void main(String[] args){
        Date newTime = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd ");
        String dateString = sdf.format(newTime );
    }
}
