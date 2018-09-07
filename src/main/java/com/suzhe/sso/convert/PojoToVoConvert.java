package com.suzhe.sso.convert;


import com.suzhe.sso.common.web.LoginUser;
import com.suzhe.sso.pojo.TbAccount;
import com.suzhe.sso.pojo.TbUser;
import com.suzhe.sso.vo.AccountVo;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface PojoToVoConvert {

    PojoToVoConvert MAPPER = Mappers.getMapper(PojoToVoConvert.class);

    LoginUser pojoToLoginUser(TbUser user);

    AccountVo pojoToAccountVo(TbAccount account);

}
