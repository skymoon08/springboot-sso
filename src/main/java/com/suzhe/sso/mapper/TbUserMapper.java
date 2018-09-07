package com.suzhe.sso.mapper;


import com.suzhe.sso.pojo.TbUser;
import com.suzhe.sso.pojo.TbUserCriteria;

import java.util.List;
/**
* <p>用户表Mapper</p>
* 类名:TbUserMapper<br>
* 创建人:suzhe<br>
* 创建时间:20180904<br>
*/

public interface TbUserMapper{

    int deleteByPrimaryKey(Integer id);

    int insertSelective(TbUser record);

    TbUser selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(TbUser record);

    List<TbUser> selectByCriteria(TbUserCriteria criteria);

    int countByCriteria(TbUserCriteria criteria);


}

