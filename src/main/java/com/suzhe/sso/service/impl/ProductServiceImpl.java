package com.suzhe.sso.service.impl;

import com.suzhe.sso.convert.PojoToVoConvert;
import com.suzhe.sso.mapper.TbProductMapper;
import com.suzhe.sso.pojo.TbProduct;
import com.suzhe.sso.pojo.TbProductCriteria;
import com.suzhe.sso.service.IProductService;
import com.suzhe.sso.vo.ProductVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ProductServiceImpl implements IProductService{


    @Autowired
    TbProductMapper tbProductMapper;
    @Override
    public List<ProductVo> list() {

        TbProductCriteria criteria = new TbProductCriteria();
        List<TbProduct> list = tbProductMapper.selectByCriteria(criteria);
        List<ProductVo> productVos = new ArrayList<>();
        for (TbProduct product:
             list) {
            ProductVo productVo = PojoToVoConvert.MAPPER.pojoToProductVo(product);
            productVos.add(productVo);

        }

        return  productVos;
    }
}
