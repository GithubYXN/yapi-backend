package com.yangx.yapiclientsdk.utils;

import cn.hutool.crypto.digest.DigestUtil;

import java.util.Map;

public class SignUtils {
    /**
     * 生成签名
     * @param headerMap
     * @param secretKey
     * @return
     */
    public static String genSign(Map<String, String> headerMap, String secretKey){
        String content = headerMap.toString() + secretKey;

        return DigestUtil.sha256Hex(content);
    }
}
