package com.yangx.yapiinterface;

import com.yangx.yapiclientsdk.client.YApiClient;
import com.yangx.yapiclientsdk.model.User;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;

@SpringBootTest
class YapiInterfaceApplicationTests {

    @Resource
    private YApiClient yApiClient;

    @Test
    void contextLoads() {
        String yx = yApiClient.getNameByGet("yx");

        User user = new User();
        user.setUsername("yangx");
        String username = yApiClient.getUsernameByPost(user);

        System.out.println(yx);
        System.out.println(username);
    }

}
