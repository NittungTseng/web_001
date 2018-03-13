package com.cn.eddy.service.impl;

import com.cn.eddy.dao.UnlockUserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.cn.eddy.pojo.UnlockUser;
import com.cn.eddy.service.UnlockUserService;

import javax.annotation.Resource;

/**
 * Created By Eddy on ${Date}
 */
@Service("unlockUserService")
public class UnlockUserServiceImpl implements UnlockUserService{
    @Autowired
    private UnlockUserMapper unlockUserMapper;

    public UnlockUser getUserById(Long userId) {
        return this.unlockUserMapper.selectByPrimaryKey(userId);
    }
}
