package com.example.Banking_Management_System.repository;

import com.example.Banking_Management_System.model.Bank_Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface Cus_Repository extends JpaRepository<Bank_Customer,Integer> {
}
