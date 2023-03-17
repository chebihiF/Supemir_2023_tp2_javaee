package org.supemir.tp2.controllers.metier;

import org.springframework.beans.factory.annotation.Autowired;
import org.supemir.tp2.controllers.dao.CustomerDao;
import org.supemir.tp2.controllers.entities.Customer;

import java.util.List;

public class CustomerMetierImpl implements CustomerMetier {

    private CustomerDao dao ;

    public void setDao(CustomerDao dao) {
        this.dao = dao;
    }

    @Override
    public Customer saveCustomer(Customer customer) throws Exception {
        return dao.saveCustomer(customer);
    }

    @Override
    public Customer updateCustomer(Customer customer) throws Exception {
        return null;
    }

    @Override
    public Customer delteCustomer(Customer customer) throws Exception {
        return null;
    }

    @Override
    public Customer getCustomer(Long id) throws Exception {
        return null;
    }

    @Override
    public List<Customer> getCustomers() throws Exception {
        return null;
    }
}
