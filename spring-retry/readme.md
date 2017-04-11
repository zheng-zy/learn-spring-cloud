# spring-retry

> 在平常我们提供远程调用API时，都会因为各种原因引起调用失败，这个时候需要提供异常重试机制，
一般我们都使用for或者while机制，现在springboot给我们提供了一个良好的方法机制。

[测试链接访问](http://127.0.0.1:8080/test)

### @Retryable参数解析

value：指定异常重试
include：和value类似
exclude：排除某些异常

如果value，include，exclude都为空，任何异常都重试

maxAttempts：最大重试次数

backoff：重试策略，默认使用@Backoff，value为1000L，每间隔1秒重试一次，
multiplier默认值为0，表示固定暂停1秒重试，如果调整为2，那么第一次为1秒，第二次为2秒，第三次为4秒。

### 示例代码

[github下载](https://github.com/zheng-zy/learn-spring-cloud)