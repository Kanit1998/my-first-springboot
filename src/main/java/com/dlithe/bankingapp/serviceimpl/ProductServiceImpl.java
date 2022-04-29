package com.dlithe.bankingapp.serviceimpl;

import com.dlithe.bankingapp.dto.ProductDetail;
import com.dlithe.bankingapp.dto.ProductDetailsResponse;
import com.dlithe.bankingapp.entity.Product;
import com.dlithe.bankingapp.repository.ProductDAO;
import com.dlithe.bankingapp.service.ProductService;
import javafx.scene.canvas.GraphicsContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class ProductServiceImpl implements ProductService {


    @Autowired
    private ProductDAO productDAO;

    @Override
    public String orderSuccessfull(ProductDetail productDetail) {
        Product product= new Product();
       product.setProductName(productDetail.getProductName());
        product.setPrice(productDetail.getPrice());

       productDAO.save(product);
        return "product successfully ordered";
    }


    @Override
    public String fetchProductDetails(String productName) {
        return null;
    }

    @Override
    public ProductDetailsResponse getProductDetail(int productId) {
        //DB call
        Optional<Product> product = productDAO.findById(productId);
        Product productDetailsFromDb = product.get();
        ProductDetailsResponse productDetailsResponse = new ProductDetailsResponse();
        productDetailsResponse.setProduct_name(productDetailsFromDb.getProductName());
        productDetailsResponse.setPrice(productDetailsFromDb.getPrice());
        productDetailsResponse.setId(productDetailsFromDb.getId());
        return productDetailsResponse;
    }
}
