package com.suzhe.sso.service;

import com.suzhe.sso.vo.ProductVo;

import java.util.List;

public interface IProductService {

    /**
     * 获取产品列表
     * @return
     */
    List<ProductVo> list();

}
