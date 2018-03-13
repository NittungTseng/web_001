package com.cn.eddy.dao;

import com.cn.eddy.pojo.UnlockUser;
import org.mybatis.spring.annotation.MapperScan;


public interface UnlockUserMapper {
    int deleteByPrimaryKey(Long jobId);

    int insert(UnlockUser record);

    int insertSelective(UnlockUser record);

    UnlockUser selectByPrimaryKey(Long jobId);

    int updateByPrimaryKeySelective(UnlockUser record);

    int updateByPrimaryKey(UnlockUser record);
}