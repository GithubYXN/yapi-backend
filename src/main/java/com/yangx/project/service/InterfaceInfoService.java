package com.yangx.project.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.yangx.yapicommon.model.entity.InterfaceInfo;

/**
* @author yx
* @description 针对表【interfaceInfo(接口信息)】的数据库操作Service
* @createDate 2024-08-02 22:29:50
*/
public interface InterfaceInfoService extends IService<InterfaceInfo> {
    void validInterfaceInfo(InterfaceInfo interfaceInfo, boolean add);
}
