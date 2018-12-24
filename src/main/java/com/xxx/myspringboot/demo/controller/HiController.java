package com.xxx.myspringboot.demo.controller;

import com.xxx.myspringboot.config.ConfigInfo;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName HiController
 * @Author hello
 * @Date 2018/12/22 12:55
 *  //@RestController = @Controller +  @ResponseBody
 **/
@RestController
public class HiController {

    @Autowired
    ConfigInfo configInfo;

//    @Value("${wangchuan.name}")
    private String name;

//    @Value("${wangchuan.age}")
    private int age;


    /**
     *只支持get请求
     *  //@GetMapping = @RequestMapping + method = RequestMethod.GET
     *  //@PostMapping = @RequestMapping + method = RequestMethod.POST
     */
    @ApiOperation("测试")
    @RequestMapping(value = "/hi",method = RequestMethod.GET)
    public String sayHi(){
        return "姓名:"+name+"--年龄:"+age+"===xm:"+configInfo.getName()+"--age:"+configInfo.getAge();
    }

}
