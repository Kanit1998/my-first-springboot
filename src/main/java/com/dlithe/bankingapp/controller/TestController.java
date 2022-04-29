package com.dlithe.bankingapp.controller;
import com.dlithe.bankingapp.dto.StudentDetails;
import com.dlithe.bankingapp.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class TestController {

 @Autowired
    private TestService testService;

    //path variables
    @GetMapping("fetch-product-details/{productName}")
    public String myFirstMethod(@PathVariable String productName) {
        return testService.fetchProductDetails(productName);

    }

    @PostMapping("register-student")
    public String registerNewStudent(@RequestBody StudentDetails studentDetails){
        return testService.registerStudent(studentDetails);
    }

}
//    @GetMapping("test")
//    public String myFirstMethod() {
//        return "Hey welcome to java";
//    }
//
//    @GetMapping("fetch-product-detail/{productName}")
//    public String myFirstMethod(@PathVariable String productName) {
//        switch (productName) {
//            case "mobilePhones":
//                return mobilePhoneDetails();
//            case "cricketKit":
//                return cricketKit();
//            default:
//                return "no product found";
//        }
//    }
//
//    public String mobilePhoneDetails() {
//        return "here is the list of mobile phones";
//    }
//
//    public String cricketKit() {
//        return "limited stock avaiable";
//    }
//
//    //path variables
//    @GetMapping("add/{numOne}/{numTwo}")
//    public int myFirstMethod(@PathVariable int numOne, @PathVariable int numTwo) {
//        return numOne + numTwo;
//    }
//
//      @GetMapping("multiple/{firstNum}/{secondNum}")
//      public int myFirstMethod(@PathVariable int firstNum, @PathVariable int secondNum){
//         return firstNum * secondNum;
//   }
//
//
//   @GetMapping("try/{numberFirst}/{numberSecond}")
//    public int myMethod(@PathVariable int numberFirst, int numberSecond)



