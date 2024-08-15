package com.yangx.yapicommon.service;


import com.baomidou.mybatisplus.extension.service.IService;
import com.yangx.yapicommon.model.entity.User;



/**
 * 用户服务
 *
 * @author yangx
 */
public interface InnerUserService {

    /**
     * 数据库中是否已分配给用户密钥
     * @param accessKey
     * @return
     */
    User getInvokeUser(String accessKey);

}
