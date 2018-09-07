package com.suzhe.sso.mapper;

import com.suzhe.sso.pojo.TbAccount;
import com.suzhe.sso.pojo.TbAccountCriteria;
import java.util.List;
/**
* <p>账户表Mapper</p>
* 类名:TbAccountMapper<br>
* 创建人:suzhe<br>
* 创建时间:20180907<br>
*/

public interface TbAccountMapper{

    int deleteByPrimaryKey(Integer id);

    int insertSelective(TbAccount record);

    TbAccount selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(TbAccount record);

    List<TbAccount> selectByCriteria(TbAccountCriteria criteria);

    int countByCriteria(TbAccountCriteria criteria);


}

