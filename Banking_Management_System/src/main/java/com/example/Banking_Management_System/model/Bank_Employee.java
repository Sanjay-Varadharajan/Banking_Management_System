package com.example.Banking_Management_System.model;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Bank_Employee {
    @Id
    private int emp_id;
    private String emp_name;
    private String role;
    private String salary;


}
