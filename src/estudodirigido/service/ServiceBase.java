/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estudodirigido.service;

import estudodirigido.infra.RespositorioGenerico;
import java.util.List;
import java.util.Map;
import org.hibernate.SessionFactory;
import estudodirigido.infra.IRepositorioGenerico;

/**
 *
 * @author jose
 * @param <T>
 */
public class ServiceBase<T> implements IServiceBase<T>{

    private final IRepositorioGenerico<T> repository;
    private final Class<T> obj;

    public ServiceBase(Class<T> obj, SessionFactory sessionFactory) {
        this.obj = obj;
        this.repository = new RespositorioGenerico<T>(obj,sessionFactory);
    }
    
    @Override
    public List<T> getAll() {
            return query("from "+obj.getName(),null);
    }

    @Override
    public T get(Class<T> obj, long id) {
        return (T)repository.get(obj, id);
    }

    @Override
    public T save(T obj) {
        return (T)repository.save(obj);
    }

    @Override
    public void update(T obj) {
        repository.update(obj);
    }

    @Override
    public void delete(T obj) {
        repository.delete(obj);
    }

    @Override
    public List<T> query(String hsql, Map<String, Object> params) {
        return (List<T>)repository.query(hsql, params);
    }

    
    
}
