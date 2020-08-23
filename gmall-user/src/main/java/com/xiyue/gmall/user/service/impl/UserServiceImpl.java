package com.xiyue.gmall.user.service.impl;

import com.xiyue.gmall.bean.UmsMember;
import com.xiyue.gmall.bean.UmsMemberReceiveAddress;
import com.xiyue.gmall.service.IUserSerivce;
import com.xiyue.gmall.user.mapper.UmsMemberReceiveAddressMapper;
import com.xiyue.gmall.user.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tk.mybatis.mapper.entity.Example;

import java.util.List;

@Service
public class UserServiceImpl implements IUserSerivce {

    @Autowired
    UserMapper userMapper;
    @Autowired
    UmsMemberReceiveAddressMapper umsMemberReceiveAddressMapper;

    @Override
    public List<UmsMember> getAllUser() {
        List<UmsMember> umsMemberList = userMapper.selectAll();//userMapper.selectAllUser();
        return umsMemberList;
    }

    @Override
    public List<UmsMemberReceiveAddress> getReceiveAddressByMemberId(String memberId) {
        Example e = new Example(UmsMemberReceiveAddress.class);
        e.createCriteria().andEqualTo("memberId",memberId);
        List<UmsMemberReceiveAddress> umsMemberReceiveAddressList = umsMemberReceiveAddressMapper.selectByExample(e);
        return umsMemberReceiveAddressList;
    }


}
