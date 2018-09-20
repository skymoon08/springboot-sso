package com.suzhe.sso.pojo;
import java.math.BigDecimal;
import java.util.Date;

/**
 * <p>账户表</p>
 * 类名:TbProduct<br>
 * 创建人:suzhe<br>
 * 创建时间:20180920<br>
 */

public class TbProduct{


    /**
     * ID
     */
    private Integer id;

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

    /**
     * 创建时间
     */
    private Date createTime;

    /**
     * 更新时间
     */
    private Date updateTime;


    public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

    public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

    public BigDecimal getAnnualYield() {
		return annualYield;
	}

	public void setAnnualYield(BigDecimal annualYield) {
		this.annualYield = annualYield;
	}

    public BigDecimal getTotalAmount() {
		return totalAmount;
	}

	public void setTotalAmount(BigDecimal totalAmount) {
		this.totalAmount = totalAmount;
	}

    public BigDecimal getRemainingAmount() {
		return remainingAmount;
	}

	public void setRemainingAmount(BigDecimal remainingAmount) {
		this.remainingAmount = remainingAmount;
	}

    public Integer getInvestPeriod() {
		return investPeriod;
	}

	public void setInvestPeriod(Integer investPeriod) {
		this.investPeriod = investPeriod;
	}

    public Date getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

    public Date getUpdateTime() {
		return updateTime;
	}

	public void setUpdateTime(Date updateTime) {
		this.updateTime = updateTime;
	}



}
