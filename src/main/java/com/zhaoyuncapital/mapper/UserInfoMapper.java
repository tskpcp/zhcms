package com.zhaoyuncapital.mapper;

import com.zhaoyuncapital.model.UserInfo;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * Created by gongtuo on 2017/5/22.
 */
@Mapper
public interface UserInfoMapper{
    UserInfo findUserInfo();
    UserInfo selectByUserName(String userCode);

    int insertUserInfo(@Param("UserInfo") UserInfo userInfo);


}
