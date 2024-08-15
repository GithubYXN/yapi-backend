package com.yangx.yapigateway;

import com.yangx.project.rpc.RpcDemoService;
import org.apache.dubbo.config.annotation.DubboReference;
import org.apache.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.autoconfigure.jdbc.DataSourceTransactionManagerAutoConfiguration;
import org.springframework.boot.autoconfigure.orm.jpa.HibernateJpaAutoConfiguration;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.stereotype.Service;

@EnableDubbo
@Service
@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class,
        DataSourceTransactionManagerAutoConfiguration.class,
        HibernateJpaAutoConfiguration.class})
public class YapiGatewayApplication {

    @DubboReference
    private RpcDemoService rpcDemoService;


    public static void main(String[] args) {
        ConfigurableApplicationContext context = SpringApplication.run(YapiGatewayApplication.class, args);

        YapiGatewayApplication application = context.getBean(YapiGatewayApplication.class);

        String result = application.sayHello("test successful");

        System.out.println("result: " + result);
    }

    public String sayHello(String name) {
        return rpcDemoService.sayHello(name);
    }


}
