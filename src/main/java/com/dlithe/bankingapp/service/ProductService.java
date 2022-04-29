package com.dlithe.bankingapp.service;

import com.dlithe.bankingapp.dto.ProductDetail;
import com.dlithe.bankingapp.dto.ProductDetailsResponse;
import com.dlithe.bankingapp.dto.StudentDetails;
import org.springframework.stereotype.Component;

@Component
public interface ProductService {
    String orderSuccessfull(ProductDetail productDetail);
    String fetchProductDetails(String productName);
    ProductDetailsResponse getProductDetail(int userId);
}
