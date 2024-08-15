package com.yangx.project.service;

import com.yangx.yapicommon.service.InnerUserInterfaceInfoService;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;

import static org.junit.Assert.assertTrue;

@SpringBootTest
public class UserInterfaceInfoServiceTest {

    @Resource
    private InnerUserInterfaceInfoService userInterfaceInfoService;

    @Test
    public void invokeCount() {
        boolean result = userInterfaceInfoService.invokeCount(1L, 1L);
        assertTrue(result);
    }
}