package com.yangx.yapiclientsdk;

import com.yangx.yapiclientsdk.client.YApiClient;
import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ConfigurationProperties("yapi.client")
@Data
@ComponentScan
public class YApiClientConfig {
    private String accessKey;
    private String secretKey;

    @Bean
    public YApiClient yApiClient() {
        return new YApiClient(accessKey, secretKey);
    }
}
