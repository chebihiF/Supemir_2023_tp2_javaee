package org.supemir.tp2.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.supemir.tp2.entities.Customer;
import org.supemir.tp2.util.HibernateUtil;

import java.util.List;

public class CustomerDaoImpl implements CustomerDao {

    private SessionFactory factory = HibernateUtil.getFactory();
    private Session session;

    @Override
    public Customer saveCustomer(Customer customer) throws Exception {
        try{
            if(session!=null && session.isOpen())
                session = factory.getCurrentSession();
            else
                session = factory.openSession();
            session.beginTransaction();

            session.save(customer);
            session.getTransaction().commit();
            return customer;
        }catch (Exception ex){
            session.getTransaction().rollback();
            throw new Exception(ex.getMessage());
        }finally {
            session.close();
        }
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
