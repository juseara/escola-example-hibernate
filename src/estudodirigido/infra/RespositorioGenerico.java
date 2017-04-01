/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estudodirigido.infra;

import Commum.AssertionConcern;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.hibernate.Query;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

/**
 *
 * @author jose
 */
public class RespositorioGenerico<T> extends AssertionConcern implements IRepositorioGenerico<T> {

    private SessionFactory sessionFactory;

    public RespositorioGenerico(Class<T> obj, SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
        this.assertArgumentNotNull(sessionFactory, "Erro ao consumir session factory");
    }

    @Override
    public T get(Class<T> obj, long id) {

        Session session = sessionFactory.getCurrentSession();
        try {

            session.beginTransaction();
            @SuppressWarnings("unchecked")
            T element = (T) session.get(obj, id);
            
            
            return element;
        } catch (Exception e) {
            throw new RuntimeException(RespositorioGenerico.class.getName() + " :" + e.getMessage());
        } finally {
            session.getTransaction().commit();
        }
        
    }

    @Override
    public T save(T obj) {
        Session session = sessionFactory.getCurrentSession();

        try {
           session.beginTransaction();
           session.save(obj);
           session.getTransaction().commit();
            
        } catch (Exception e) {
            session.getTransaction().rollback();
            throw new RuntimeException(RespositorioGenerico.class.getName() + " :" + e.getMessage());
        }

        return obj;
    }

    @Override
    public void update(T obj) {
        Session session = sessionFactory.getCurrentSession();

        try {

            session.beginTransaction();
            session.update(obj);
            session.getTransaction().commit();
            

        } catch (Exception e) {
            session.getTransaction().rollback();
            throw new RuntimeException(RespositorioGenerico.class.getName() + " :" + e.getMessage());
        }

    }

    @Override
    public void delete(T obj) {
        Session session = sessionFactory.getCurrentSession();

        try {

            session.beginTransaction();
            session.delete(obj);
            session.getTransaction().commit();
            

        } catch (Exception e) {
            session.getTransaction().rollback();
            throw new RuntimeException(RespositorioGenerico.class.getName() + " :" + e.getMessage());
        }

    }

    @Override
    public List<T> query(String hsql, Map<String, Object> params) {
        Session session = sessionFactory.getCurrentSession();
        List<T> result = null;
        try {

            session.beginTransaction();
            Query query = session.createQuery(hsql);
            if (params != null) {
                for (String i: params.keySet()) {
                    
                    query.setParameter(i, params.get(i));
                }
            }

            if (((!hsql.toUpperCase().contains("DELETE")) && (!hsql.toUpperCase().contains("UPDATE")))
                    && (!hsql.toUpperCase().contains("INSERT"))) {
                result = query.list();
            }
            
            
        } catch (Exception e) {
           // session.getTransaction().rollback();
            throw new RuntimeException(RespositorioGenerico.class.getName() + " :" + e.getMessage());
        } finally {
            session.getTransaction().commit();
        }

        return result;

    }

}
