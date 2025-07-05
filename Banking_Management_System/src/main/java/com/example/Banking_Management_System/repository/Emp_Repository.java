package com.example.Banking_Management_System.repository;

import com.example.Banking_Management_System.model.Bank_Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface Emp_Repository extends JpaRepository<Bank_Employee,Integer> {


}
