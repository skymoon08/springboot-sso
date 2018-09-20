package com.suzhe.sso.controller;


import com.suzhe.sso.common.R;
import com.suzhe.sso.service.IProductService;
import com.suzhe.sso.vo.ProductVo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/product/")
@Slf4j
public class ProductController {

    @Autowired
    IProductService iProductService;


    @RequestMapping(value = "list", method = RequestMethod.GET)
    public R list() {
        List<ProductVo> vos = iProductService.list();
        return R.createBySuccess(vos);
    }



}
