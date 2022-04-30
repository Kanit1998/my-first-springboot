package com.dlithe.bankingapp.dto;


import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.List;

@ToString
@Getter
@Setter
@EqualsAndHashCode
public class ProductDetailsResponse {
    private int id;
    private String productName;
    private int price;

    //private ReviewResponse review;
    private List<ReviewResponse> review;
}
