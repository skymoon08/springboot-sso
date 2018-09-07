package com.suzhe.sso.vo;

import com.suzhe.sso.common.validation.EqualLength;
import lombok.Data;
import org.hibernate.validator.constraints.NotBlank;

@Data
public class LoginParam {
    @NotBlank(message="用户名不能为空")
    private String username;
    @EqualLength(value = 6)
    private String password;

}
