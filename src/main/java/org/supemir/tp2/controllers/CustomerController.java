package org.supemir.tp2.controllers;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.supemir.tp2.entities.Customer;
import org.supemir.tp2.metier.CustomerMetier;

@Controller
@RequestMapping(path = "/customers")
@RequiredArgsConstructor
public class CustomerController {
    private final CustomerMetier metier;

    @GetMapping
    public String saveCustomer(Model model){
        try {
            Customer customer = metier.saveCustomer(new Customer(1L,"chebihi","chebihi@gmail.com"));
            model.addAttribute("customer",customer);
        } catch (Exception e) {
            model.addAttribute("error",e.getMessage());
        }
        return "customers";
    }
}
