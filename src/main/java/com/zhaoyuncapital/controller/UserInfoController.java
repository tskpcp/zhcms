package com.zhaoyuncapital.controller;

import com.zhaoyuncapital.model.UserInfo;
import com.zhaoyuncapital.service.UserInfoService;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by gongtuo on 2017/6/1.
 */
@Controller
public class UserInfoController {
    private Logger logger = Logger.getLogger(UserInfoController.class);
    @Autowired
    private UserInfoService userInfoService;
    @RequestMapping("/getUserInfo")
    @ResponseBody
    public UserInfo getUserInfo(){
        UserInfo userInfo=userInfoService.getUserInfo();
        if(userInfo!=null){
            System.out.println("userInfo.getUsername():"+userInfo.getUsername());
            logger.info("userInfo.getUsername():"+userInfo.getUsername());
        }
        return userInfo;
    }


//    @RequestMapping
//    public PageInfo<UserInfo> getAll(UserInfo userInfo){
//        List<UserInfo> userInfoList=userInfoService.getAll(userInfo);
//        return new PageInfo<UserInfo>(userInfoList);
//    }
//
//    @RequestMapping(value="/add")
//    public UserInfo add(){
//        return new UserInfo();
//    }
//
//    @RequestMapping(value="/view/{id}")
//    public UserInfo view(@PathVariable Integer id){
//        ModelAndView result=new ModelAndView();
//        UserInfo userInfo=userInfoService.getById(id);
//        return userInfo;
//    }
//
//    @RequestMapping(value="/delete/{id}")
//    public ModelMap delete(@PathVariable Integer id){
//        ModelMap result=new ModelMap();
//        int returnResult=userInfoService.deleteById(id);
//        result.put("msg","删除成功！");
//        return result;
//    }
//
//    @RequestMapping(value = "/save",method= RequestMethod.POST)
//    public ModelMap save(UserInfo userInfo){
//        ModelMap result=new ModelMap();
//        String msg=userInfo.getId()==null?"新增成功!":"更新成功！";
//        userInfoService.save(userInfo);
//        result.put("userInfo",userInfo);
//        result.put("msg",msg);
//        return result;
//    }
}
