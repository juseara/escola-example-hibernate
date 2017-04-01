/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estudodirigido.infra;

import estudodirigido.infra.IUsuarioRepositorio;
import estudodirigido.infra.RepositorioBase;
import estudodirigido.modelo.Usuario;

import java.util.List;
import java.util.Map;
import org.hibernate.SessionFactory;

/**
 *
 * @author jose
 */
public class UsuarioRepositorio extends RepositorioBase<Usuario> implements IUsuarioRepositorio {

    public UsuarioRepositorio(SessionFactory sessionFactory) {
        super(Usuario.class, sessionFactory);
    }

    @Override
    public List<Usuario> getAll() {
        return (List<Usuario>) this.query("from " + Usuario.class.getName(), null);
    }

}
