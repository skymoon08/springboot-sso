package com.suzhe.sso.vo;

import lombok.Data;

import java.math.BigDecimal;

@Data
public class AccountVo {

    /**
     * 总资产
     */
    private BigDecimal totalAssets;

    /**
     * 总收益
     */
    private BigDecimal totalIncome;

    /**
     * 钱包
     */
    private BigDecimal wallet;

}
