package com.suzhe.sso.vo;

import lombok.Data;

import java.math.BigDecimal;

@Data
public class ProductVo {

    /**
     * 产品名字
     */
    private String productName;

    /**
     * 年化收益率
     */
    private BigDecimal annualYield;

    /**
     * 总额度
     */
    private BigDecimal totalAmount;

    /**
     * 剩余额度
     */
    private BigDecimal remainingAmount;

    /**
     * 投资期限
     */
    private Integer investPeriod;
}
