package com.yangx.yapiclientsdk.client;

import cn.hutool.core.util.RandomUtil;
import cn.hutool.http.HttpRequest;
import cn.hutool.http.HttpUtil;
import cn.hutool.json.JSONUtil;

import com.yangx.yapiclientsdk.model.User;

import java.util.HashMap;
import java.util.Map;

import static com.yangx.yapiclientsdk.utils.SignUtils.genSign;


/**
 * 调用第三方接口客户端
 *
 * @author yx
 */
public class YApiClient {
    private String accessKey;
    private String secretKey;

    public YApiClient(String accessKey, String secretKey) {
        this.accessKey = accessKey;
        this.secretKey = secretKey;
    }

    public String getNameByGet(String name){
        HashMap<String, Object> paramMap = new HashMap<>();
        paramMap.put("name", name);

        String result= HttpUtil.get("http://localhost:8090/api/name/", paramMap);
        System.out.println(result);

        return result;
    }

    public String getNameByPost(String name){
        HashMap<String, Object> paramMap = new HashMap<>();
        paramMap.put("name", name);

        String result= HttpUtil.post("http://localhost:8090/api/name/", paramMap);
        System.out.println(result);

        return result;
    }


    private Map<String, String> getHeaderMap(String body){
        Map<String, String> headerMap = new HashMap<>();

        headerMap.put("accessKey", accessKey);
//        headerMap.put("secretKey", secretKey);
        headerMap.put("nonce", RandomUtil.randomNumbers(5));
        headerMap.put("body", body);
        headerMap.put("timestamp", String.valueOf(System.currentTimeMillis() / 1000));
        headerMap.put("sign", genSign(headerMap, secretKey));

        return headerMap;
    }


    public String getUsernameByPost(User user){
        String json = JSONUtil.toJsonStr(user);
        String httpResponse = HttpRequest.post("http://localhost:8090/api/name/user")
                .addHeaders(getHeaderMap(json))
                .body(json)
                .execute().body();

        System.out.println(httpResponse);

        return httpResponse;
    }
}
