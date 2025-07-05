package com.example.Banking_Management_System.service;

import com.example.Banking_Management_System.model.Bank_Customer;
import com.example.Banking_Management_System.model.Bank_Employee;
import com.example.Banking_Management_System.repository.Cus_Repository;
import com.example.Banking_Management_System.repository.Emp_Repository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class Bank_Service {


    @Autowired
    Emp_Repository empRepository;


    @Autowired
    Cus_Repository cusRepository;


    public List<Bank_Employee>  getallemp() {
        return empRepository.findAll();

    }

    public void addemp(int emp_id, String emp_name, String role, String salary) {
        Bank_Employee bankEmployee=new Bank_Employee(emp_id,emp_name,role,salary);
        empRepository.save(bankEmployee);
    }

    public String updateemp(int emp_id, String emp_name, String role, String salary) {
        if(empRepository.existsById(emp_id)){
            Bank_Employee bankEmployee=new Bank_Employee(emp_id,emp_name,role,salary);
            empRepository.save(bankEmployee);
            return "updated!";

        }
        else{
            return "Employee not found!";
        }
    }

    public String deleteemp(int emp_id) {
        if(empRepository.existsById(emp_id)){
            empRepository.deleteById(emp_id);
            return "Deleted!";
        }
        else{
            return "employee not found";
        }
    }

    public List<Bank_Customer> getallcus() {
        return cusRepository.findAll();
    }


    public void addcust(int customer_id, String customer_name, String address, String phone) {
        Bank_Customer bankCustomer=new Bank_Customer(customer_id,customer_name,address,phone);
        cusRepository.save(bankCustomer);
    }

    public String updatecus(int customer_id, String customer_name, String address, String phone) {

        if(cusRepository.existsById(customer_id)){
            Bank_Customer bankCustomer=new Bank_Customer(customer_id,customer_name,address,phone);
            cusRepository.save(bankCustomer);
            return "updated";
        }
        else{
            return "Employee Not Found!...";
        }
    }


    public String deletecus(int customer_id) {
        if(cusRepository.existsById(customer_id)){
            cusRepository.deleteById(customer_id);
            return "deletion Successfull";
        }
        else{
            return "Employee Not Found";
        }
    }
}
