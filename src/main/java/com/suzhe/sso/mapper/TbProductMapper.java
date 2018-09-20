package com.suzhe.sso.mapper;

import com.suzhe.sso.pojo.TbProduct;
import com.suzhe.sso.pojo.TbProductCriteria;
import java.util.List;
/**
* <p>账户表操作接口</p>
* 类名:TbProductMapper<br>
* 创建人:suzhe<br>
* 创建时间:20180920<br>
*/

public interface TbProductMapper{

    int deleteByPrimaryKey(Integer id);

    int insertSelective(TbProduct record);

    TbProduct selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(TbProduct record);

    List<TbProduct> selectByCriteria(TbProductCriteria criteria);

    int countByCriteria(TbProductCriteria criteria);


}

