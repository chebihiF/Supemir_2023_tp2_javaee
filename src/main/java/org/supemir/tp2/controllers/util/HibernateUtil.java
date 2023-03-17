package org.supemir.tp2.controllers.util;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.supemir.tp2.controllers.entities.Customer;

public class HibernateUtil {
    private static SessionFactory factory;
    static {
        factory = new Configuration().configure()
                .addAnnotatedClass(Customer.class)
                .buildSessionFactory();
    }

    public static SessionFactory getFactory() {
        return factory;
    }
}
