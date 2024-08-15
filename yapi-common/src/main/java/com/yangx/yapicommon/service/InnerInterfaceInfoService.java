package com.yangx.yapicommon.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.yangx.yapicommon.model.entity.InterfaceInfo;

/**
* @author yx
* @description 针对表【interfaceInfo(接口信息)】的数据库操作Service
* @createDate 2024-08-02 22:29:50
*/
public interface InnerInterfaceInfoService {

    /**
     * 从数据库中查询模拟接口是否存在
     * @param path
     * @param method
     * @return
     */
    InterfaceInfo getInterfaceInfo(String path, String method);

}
