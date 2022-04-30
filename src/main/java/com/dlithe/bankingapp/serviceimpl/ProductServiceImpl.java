package com.dlithe.bankingapp.serviceimpl;

import com.dlithe.bankingapp.dto.ProductDetail;
import com.dlithe.bankingapp.dto.ProductDetailsResponse;
import com.dlithe.bankingapp.dto.ReviewResponse;
import com.dlithe.bankingapp.entity.Product;
import com.dlithe.bankingapp.repository.ProductDAO;
import com.dlithe.bankingapp.service.ProductService;
import javafx.scene.canvas.GraphicsContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
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
        //ReviewResponse reviewResponse=new ReviewResponse();
        List<ReviewResponse> reviewResponseList=new ArrayList<>();

        //DB call
        Optional<Product> product = productDAO.findById(productId);
        Product productDetailsFromDb = product.get();
        ProductDetailsResponse productDetailsResponse = new ProductDetailsResponse();
        productDetailsResponse.setProductName(productDetailsFromDb.getProductName());
        productDetailsResponse.setPrice(productDetailsFromDb.getPrice());
        productDetailsResponse.setId(productDetailsFromDb.getId());

        ReviewResponse reviewResponse=new ReviewResponse();
        reviewResponse.setReview("product quality is low");
        reviewResponse.setReviewerName("kanit");
        reviewResponse.setRating("4");
        reviewResponseList.add(reviewResponse);


        ReviewResponse reviewResponse1=new ReviewResponse();
        reviewResponse1.setReview("Quality of product is good");
        reviewResponse1.setReviewerName("Vishal");
        reviewResponse1.setRating("4");
        reviewResponseList.add(reviewResponse1);


        //productDetailsResponse.setReview(reviewResponse);
        productDetailsResponse.setReview(reviewResponseList);
        return productDetailsResponse;

    }
}
