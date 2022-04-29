package com.dlithe.bankingapp.service;

import com.dlithe.bankingapp.dto.StudentDetails;
import org.springframework.stereotype.Component;
//Component annotations: used to mark the class/interface as BEAN
@Component
public interface TestService {
    String fetchProductDetails(String productName);// get Mapping

    String registerStudent(StudentDetails studentDetailsRequest);
}
