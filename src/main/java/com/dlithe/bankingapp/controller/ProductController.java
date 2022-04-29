package com.dlithe.bankingapp.controller;


import com.dlithe.bankingapp.dto.ProductDetail;
import com.dlithe.bankingapp.dto.ProductDetailsResponse;
import com.dlithe.bankingapp.service.ProductService;
import lombok.Getter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class ProductController {
    @Autowired
    private ProductService productService;

    @PostMapping("order-successfully")
    public String orderNewSuccessfully(@RequestBody ProductDetail productDetail) {
        return productService.orderSuccessfull(productDetail);
    }

    @GetMapping("get-product-details/{productId}")
    public ProductDetailsResponse fetchUserDetails(@PathVariable int productId) {
        return productService.getProductDetail(productId);
    }
}

