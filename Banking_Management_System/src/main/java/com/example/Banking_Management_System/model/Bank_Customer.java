package com.example.Banking_Management_System.model;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Bank_Customer {

    @Id
    private int customer_id;
    private String customer_name;
    private String address;
    private String phone;


}
