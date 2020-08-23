package com.xiyue.gmall.service;

import com.xiyue.gmall.bean.UmsMember;
import com.xiyue.gmall.bean.UmsMemberReceiveAddress;

import java.util.List;

public interface IUserSerivce {
    List<UmsMember> getAllUser();

    List<UmsMemberReceiveAddress> getReceiveAddressByMemberId(String memberId);
}
