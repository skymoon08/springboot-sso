package com.suzhe.sso.service.impl;

import com.suzhe.sso.common.web.LoginUser;
import com.suzhe.sso.common.R;
import com.suzhe.sso.common.constant.LoginConstant;
import com.suzhe.sso.common.util.CodecUtil;
import com.suzhe.sso.common.util.RedisUtil;
import com.suzhe.sso.common.util.RediskeyUtil;
import com.suzhe.sso.convert.PojoToVoConvert;
import com.suzhe.sso.mapper.TbUserMapper;
import com.suzhe.sso.pojo.TbUser;
import com.suzhe.sso.pojo.TbUserCriteria;
import com.suzhe.sso.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class UserServiceImpl implements IUserService{

    @Autowired
    TbUserMapper tbUserMapper;

    @Autowired
    RedisUtil redisUtil;

    @Override
    public R<String> login(String username, String password) {
        TbUser user = getByUsername(username);
        if (user == null){
            return R.createByErrorMessage(LoginConstant.Msg.username_not_exsit.getValue());
        }
        String encryptPassword = CodecUtil.encryptMD5(password + user.getSalt());
        if (!encryptPassword.equals(user.getPassword())){
            return R.createByErrorMessage(LoginConstant.Msg.password_error.getValue());
        }
        //创建授权token
        LoginUser loginUser = PojoToVoConvert.MAPPER.pojoToLoginUser(user);
        String authToken = UUID.randomUUID().toString();
        redisUtil.set(RediskeyUtil.getAuthTokenKey(authToken),loginUser, LoginConstant.AUTH_TOKEN_EXPIRE_TIME);
        return R.createBySuccess(authToken);
    }

    @Override
    public TbUser getByUsername(String username) {
        TbUserCriteria criteria = new TbUserCriteria();
        criteria.createCriteria().andUsernameEqualTo(username);
        List<TbUser> users = tbUserMapper.selectByCriteria(criteria);
        if (users != null && !users.isEmpty()){
            return users.get(0);
        }
        return  null;
    }
}
