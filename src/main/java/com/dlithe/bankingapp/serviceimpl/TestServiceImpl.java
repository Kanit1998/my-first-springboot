package com.dlithe.bankingapp.serviceimpl;

import com.dlithe.bankingapp.dto.StudentDetails;
import com.dlithe.bankingapp.service.TestService;
import org.springframework.stereotype.Service;

@Service
public class TestServiceImpl implements TestService {

    @Override
    public String fetchProductDetails(String productName) {
        if (productName != null) {
            switch (productName) {
                case "A":
                    return "Best quality products";
                case "B":
                    return "Good quality products";
                case "C":
                    return "Low quality products";
                default:
                    return "No product found";
            }
        } else {
            return "product name can not be null";
        }

    }

    @Override
    public String registerStudent(StudentDetails studentDetailsRequest) {

        return null;
    }
}

