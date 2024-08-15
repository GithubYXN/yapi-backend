package com.yangx.yapigateway;

import com.yangx.project.rpc.RpcDemoService;
import org.apache.dubbo.config.annotation.DubboReference;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class YapiGatewayApplicationTests {

    @DubboReference
    private RpcDemoService rpcDemoService;

    @Test
    void testRpc() {
        System.out.println(rpcDemoService.sayHello("world"));
    }

}

