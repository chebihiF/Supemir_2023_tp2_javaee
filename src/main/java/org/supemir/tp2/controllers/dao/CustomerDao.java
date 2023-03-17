package org.supemir.tp2.controllers.dao;

import org.supemir.tp2.controllers.entities.Customer;

import java.util.List;

public interface CustomerDao {
    Customer saveCustomer(Customer customer) throws Exception;
    Customer updateCustomer(Customer customer) throws Exception;
    Customer delteCustomer(Customer customer) throws Exception;
    Customer getCustomer(Long id) throws Exception;
    List<Customer> getCustomers() throws Exception;
}
