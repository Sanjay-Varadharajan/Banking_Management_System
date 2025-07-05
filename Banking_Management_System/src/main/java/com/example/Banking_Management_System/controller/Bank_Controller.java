package com.example.Banking_Management_System.controller;


import com.example.Banking_Management_System.model.Bank_Customer;
import com.example.Banking_Management_System.model.Bank_Employee;
import com.example.Banking_Management_System.service.Bank_Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RequestMapping("/bank")
@RestController
public class Bank_Controller {


    @Autowired
    Bank_Service bankService;


    @GetMapping("/employees")
    public List<Bank_Employee> getallemp() {
        return bankService.getallemp();
    }

    @PostMapping("/employees/addemployee")
    public String addemp(@RequestParam("emp_id") int emp_id, @RequestParam("emp_name") String emp_name, @RequestParam("role") String role,
                         @RequestParam("salary") String salary) {
        bankService.addemp(emp_id, emp_name, role, salary);
        return "Employee" + " " + emp_name + " " + "is Successfull Added";
    }

    @PutMapping("/employees/updateemployee")
    public String updatemep(@RequestParam("emp_id") int emp_id, @RequestParam("emp_name") String emp_name, @RequestParam("role") String role,
                            @RequestParam("salary") String salary) {
        return bankService.updateemp(emp_id, emp_name, role, salary);

    }

    @DeleteMapping("/employees/deleteemployee")
    public String deleteemp(@RequestParam("emp_id") int emp_id) {
        return bankService.deleteemp(emp_id);
    }

    @GetMapping("/customer")
    public List<Bank_Customer> getallcus(){
        return bankService.getallcus();
    }

    @PostMapping("/addcustomer")
    public String addcust(@RequestParam("customer_id")int customer_id,@RequestParam("customer_name")String customer_name,
                          @RequestParam("address")String address,@RequestParam("phone")String phone){
        bankService.addcust(customer_id,customer_name,address,phone);
        return "Employee" + " " + customer_name + " " + "is Successfull Added";
    }

    @PutMapping("/updatecustomer")
    public String updatecus(@RequestParam("customer_id")int customer_id,@RequestParam("customer_name")String customer_name,
                            @RequestParam("address")String address,@RequestParam("phone")String phone){
        return bankService.updatecus(customer_id,customer_name,address,phone);
    }

    @DeleteMapping("/deletecus")
    public String deletecus(@RequestParam("customer_id")int customer_id){
        return bankService.deletecus(customer_id);
    }
}



