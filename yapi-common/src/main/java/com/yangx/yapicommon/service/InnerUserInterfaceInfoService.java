package com.yangx.yapicommon.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.yangx.yapicommon.model.entity.UserInterfaceInfo;


/**
* @author yx
* @description 针对表【userinterfaceinfo(用户调用接口关系)】的数据库操作Service
* @createDate 2024-08-08 20:17:15
*/
public interface InnerUserInterfaceInfoService {

    /**
     * 调用接口统计
     * @param interfaceInfoId
     * @param userId
     * @return
     */
    boolean invokeCount(long interfaceInfoId, long userId);
}
