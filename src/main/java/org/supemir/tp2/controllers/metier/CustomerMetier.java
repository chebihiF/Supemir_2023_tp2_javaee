package org.supemir.tp2.controllers.metier;

import org.supemir.tp2.controllers.entities.Customer;

import java.util.List;

public interface CustomerMetier {
    Customer saveCustomer(Customer customer) throws Exception;
    Customer updateCustomer(Customer customer) throws Exception;
    Customer delteCustomer(Customer customer) throws Exception;
    Customer getCustomer(Long id) throws Exception;
    List<Customer> getCustomers() throws Exception;
}
