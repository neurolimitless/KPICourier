package kpicourier.com.application;

import org.apache.commons.logging.Log;
import org.apache.log4j.Logger;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;

import java.io.IOException;

public class HibernateSessionFactory {
    static final Logger logger = Logger.getLogger(HibernateSessionFactory.class);
    private static SessionFactory sessionFactory = buildSessionFactory();
    private static SessionFactory buildSessionFactory(){
        try {
            if (sessionFactory == null) {
                Configuration configuration = new Configuration().configure(HibernateSessionFactory.class.getResource("/hibernate.cfg.xml"));
                StandardServiceRegistryBuilder builder = new StandardServiceRegistryBuilder().applySettings(configuration.getProperties());
                sessionFactory = configuration.buildSessionFactory(builder.build());
            }
            return sessionFactory;
        } catch (Throwable ex){
            logger.error("Can not initialize Hibernate session",ex);
            throw new ExceptionInInitializerError();
        }
    }
    public static SessionFactory getSessionFactory(){
        return sessionFactory;
    }
    public static void shutdown(){
        sessionFactory.close();
    }
}
