/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estudodirigido.infra;

import org.hibernate.SessionFactory;

/**
 *
 * @author jose
 */

public class RepositorioBase<T> extends RespositorioGenerico<T>{
    
    public RepositorioBase(Class<T> obj, SessionFactory sessionFactory) {
        super(obj, sessionFactory);
    }
    
}
