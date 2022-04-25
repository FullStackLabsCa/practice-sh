package com.example.abc;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.view.RedirectView;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@RestController
public class CustomerRestController {

    private static List<Customer> customers=new ArrayList<>();
    {
        customers.add(Customer.builder().customerId(1L)
            .name("Shailja")
            .emailId("shailja@gmail.com")
            .build());
        customers.add(Customer.builder().customerId(2L)
                .name("Harjot")
                .emailId("Harjot@gmail.com")
                .build());
    }



//    @GetMapping("/customers")
//    public ResponseEntity<List<Customer>> getCustomers(){
//
//        return ResponseEntity.ok(customers);
//    }

    @GetMapping("/")
    public RedirectView app(){
        return new RedirectView("actuator");
    }



}
