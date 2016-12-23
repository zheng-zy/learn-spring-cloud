package org.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * <p></p>
 * Created by zhezhiyong@163.com on 2016/12/21.
 */
@RestController
public class ConsumerController {

    @Resource
    private ComputeClient computeClient;

    @RequestMapping(value = "add", method = RequestMethod.GET)
    public Integer add() {
        return computeClient.add(10, 20);
    }

}
