package com.dlithe.bankingapp.dto;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@EqualsAndHashCode
@ToString
public class StudentDetails {
    private String firstname;
    private String lastname;
    private String mobilenumber;
    private String section;
}
