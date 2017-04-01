/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Commum;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
import org.hibernate.service.ServiceRegistryBuilder;

/**
 * Hibernate Utility class with a convenient method to get Session Factory
 * object.
 *
 * @author jose
 */
public class HibernateUtil {

    private static final SessionFactory ourSessionFactory;
    
    static {
        try {
            Configuration configuration = new Configuration();
            
        	configuration.configure();
             
            StandardServiceRegistryBuilder builder= new StandardServiceRegistryBuilder().applySettings(
                    configuration.getProperties());
            
            ourSessionFactory = configuration.buildSessionFactory(builder.build());
        } catch (Throwable ex) {
            // Log the exception. 
            System.err.println("Initial SessionFactory creation failed." + ex);
            throw new ExceptionInInitializerError(ex);
        }
    }
    
    public static SessionFactory getSessionFactory() {
    	return ourSessionFactory;
    }
    
    public static Session getSession() throws HibernateException {
        return ourSessionFactory.openSession();
    }
}
