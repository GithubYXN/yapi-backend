package com.yangx.project.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.yangx.yapicommon.model.entity.UserInterfaceInfo;

import java.util.List;

/**
* @author yx
* @description 针对表【userinterfaceinfo(用户调用接口关系)】的数据库操作Mapper
* @createDate 2024-08-08 20:17:15
* @Entity com.yangx.project.model.entity.UserInterfaceInfo
*/
public interface UserInterfaceInfoMapper extends BaseMapper<UserInterfaceInfo> {

    List<UserInterfaceInfo> listTopInvokeInterfaceInfo(int limit);
}




