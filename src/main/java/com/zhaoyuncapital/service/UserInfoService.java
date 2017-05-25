package com.zhaoyuncapital.service;

import com.github.pagehelper.PageHelper;
import com.zhaoyuncapital.mapper.UserInfoMapper;
import com.zhaoyuncapital.model.UserInfo;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * Created by gongtuo on 2017/5/22.
 */
public class UserInfoService {

    @Autowired
    private UserInfoMapper userInfoMapper;

    public List<UserInfo> getAll(UserInfo UserInfo){
        if(UserInfo.getPage()!=null && UserInfo.getRows() !=null){
            PageHelper.startPage(UserInfo.getPage(), UserInfo.getRows());
        }
        return userInfoMapper.selectAll();
    }
    public UserInfo getById(Integer id){
        return userInfoMapper.selectByPrimaryKey(id);
    }
    public int deleteById(Integer id){
        return userInfoMapper.deleteByPrimaryKey(id);
    }
    public int save(UserInfo UserInfo){

        if(UserInfo.getId()!=null){
            return  userInfoMapper.updateByExample(UserInfo,UserInfo.getId());
        }else{
            return userInfoMapper.insert(UserInfo);
        }
    }
}
