/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estudodirigido.infra;

import java.util.List;
import java.util.Map;


/**
 *
 * @author jose
 */
public interface IRepositorioGenerico<T> {
    
    public T get(Class<T> obj, long id);
    public T save(T obj);
    public void update(T obj);
    public void delete(T obj);
    public List<T> query (String hsql,Map<String,Object>params);
    
}
