package com.dlithe.bankingapp.dto;


import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@ToString
@Getter
@Setter
@EqualsAndHashCode
public class ProductDetailsResponse {
    private int id;
    private String product_name;
    private int price;
}
