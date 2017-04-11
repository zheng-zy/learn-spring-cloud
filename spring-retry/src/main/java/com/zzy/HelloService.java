package com.zzy;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.retry.annotation.Backoff;
import org.springframework.retry.annotation.Recover;
import org.springframework.retry.annotation.Retryable;
import org.springframework.stereotype.Service;

import java.util.Random;

/**
 * Created by zhezhiyong@163.com on 17-4-11.
 */
@Service
public class HelloService {

    private Logger logger = LoggerFactory.getLogger(getClass());

    private Random random = new Random();

    @Retryable(include = RuntimeException.class, maxAttempts = 3, backoff = @Backoff(value = 2000L))
    public String testRetry() {
        int randomInt = random.nextInt(10);
        if (randomInt < 7) {
            logger.error("异常： {}", randomInt);
            throw new RuntimeException("call fail");
        } else {
            logger.info("成功");
            return "success";
        }
    }

    @Recover
    public String reliable() {
        return "cloud native java (reliable)";
    }

}
