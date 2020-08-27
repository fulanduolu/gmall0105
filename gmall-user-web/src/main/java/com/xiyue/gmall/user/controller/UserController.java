package com.xiyue.gmall.user.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.xiyue.gmall.bean.UmsMember;
import com.xiyue.gmall.bean.UmsMemberReceiveAddress;
import com.xiyue.gmall.service.IUserSerivce;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class UserController {

    @Reference
    IUserSerivce userSerivce;


    @RequestMapping("getReceiveAddressByMemberId")
    @ResponseBody
    public List<UmsMemberReceiveAddress> getReceiveAddressByMemberId(String memberId){
        List<UmsMemberReceiveAddress> umsMemberReceiveAddresses = userSerivce.getReceiveAddressByMemberId(memberId);
        return umsMemberReceiveAddresses;
    }

    @RequestMapping("getAllUser")
    @ResponseBody
    public List<UmsMember> getAllUser(){
        List<UmsMember> umsMemebers = userSerivce.getAllUser();
        return umsMemebers;
    }

    @RequestMapping("index")
    @ResponseBody
    public String index(){
        return "hello user";
    }
}
