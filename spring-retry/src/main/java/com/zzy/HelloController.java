package com.zzy;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * Created by zhezhiyong@163.com on 17-4-11.
 */
@RestController
public class HelloController {

    @Resource
    private HelloService helloService;

    @GetMapping("/test")
    public String test() {
        return helloService.testRetry();
    }


}
