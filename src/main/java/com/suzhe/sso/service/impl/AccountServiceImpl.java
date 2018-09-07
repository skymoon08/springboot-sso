package com.suzhe.sso.service.impl;

import com.suzhe.sso.convert.PojoToVoConvert;
import com.suzhe.sso.mapper.TbAccountMapper;
import com.suzhe.sso.pojo.TbAccount;
import com.suzhe.sso.pojo.TbAccountCriteria;
import com.suzhe.sso.service.IAccountService;
import com.suzhe.sso.vo.AccountVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class AccountServiceImpl implements IAccountService {

    @Autowired
    TbAccountMapper mapper;

    @Override
    public AccountVo getAccountVo(Integer userId) {
        TbAccountCriteria criteria = new TbAccountCriteria();
        criteria.createCriteria().andUserIdEqualTo(userId);
        List<TbAccount> list = mapper.selectByCriteria(criteria);
        if (list != null && !list.isEmpty()){
            return PojoToVoConvert.MAPPER.pojoToAccountVo(list.get(0));
        }
        return null;
    }
}
