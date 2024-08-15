package com.yangx.yapiinterface.controller;

import com.yangx.yapiclientsdk.model.User;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;

import static com.yangx.yapiclientsdk.utils.SignUtils.genSign;


/**
 *  名称 API
 *
 * @author yx
 */
@RestController
@RequestMapping("/name")
public class NameController {

    @GetMapping("/test")
    public String getNameByGet(String name, HttpServletRequest request){
        System.out.println(request.getHeader("yangx"));
        System.out.println(name);
        return "GET 你的名字是" + name;
    }

    @PostMapping("/")
    public String getNameByPost(@RequestParam String name){
        return "POST 你的名字是" + name;
    }

    @PostMapping("/user")
    public String getUsernameByPost(@RequestBody User user, HttpServletRequest request){
//        String accessKey = request.getHeader("accessKey");
//        String nonce = request.getHeader("nonce");
//        String timestamp = request.getHeader("timestamp");
//        String body = request.getHeader("body");
//        String sign = request.getHeader("sign");
//
//        HashMap<String, String> map = new HashMap<>();
//        map.put("accessKey", accessKey);
//        map.put("nonce", nonce);
//        map.put("timestamp", timestamp);
//        map.put("body", body);
//
//        String signLocal = genSign(map, "cd358dc5181e5b76cb9dbe82c015a470");
//
//        // 五分钟内的请求有效
////        if (System.currentTimeMillis() - Long.parseLong(timestamp) > 5 * 60 * 1000) {
////            return "无权限";
////        }
//        //签名校验
//        if(!sign.equals(signLocal)){
//            throw new RuntimeException("无权限");
//        }

        String result = "POST 用户名是" + user.getUsername();
        return result;
    }

}
