/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estudodirigido.Controle;

import estudodirigido.modelo.Aluno;
import estudodirigido.modelo.Professor;
import estudodirigido.modelo.Usuario;
import java.util.List;

/**
 *
 * @author Andre
 */
public class UsuarioControle {

    public RepositorioBase _bd;
    public UsuarioControle(RepositorioBase bd) {
        
        this._bd = bd;
    }
    
    public List<Usuario> Getall()
    {
        return _bd.Usuarios;
    }
    
    public Usuario GetbyLogin(String login)
    {
        for (Usuario u: _bd.Usuarios) {
            if(u.getLogin().toLowerCase().equals(login))
            {
                return u;
            }
            
            
        }
        
        return null;
    }
    
    public Usuario IsValid(String login, String senha)
    {
        Usuario usuario = GetbyLogin(login);
        
        if(usuario!=null)
        {
            if(usuario.getSenha().equals(senha))
            {
                return usuario;
            }
        }
        
        return null;
    }
     public boolean Create(Usuario usuario)
    {
        try {
             _bd.Usuarios.add(usuario);
             return true;
             
        } catch (Exception e) {
            return false;
        }
    }
     
     public boolean Delete (Usuario usuario)
    {
        try {
            for (Usuario us:_bd.Usuarios) {
                if(us.getLogin() == usuario.getLogin())
                {
                    _bd.Usuarios.remove(us);
                    return true;
                }
            }
            return false;
        } catch (Exception e) {
            return false;
        }
    }
     
     public boolean Update(Usuario usuario)
    {
        return true;
    }
     public List<Professor> GetAll()
    {
        return _bd.Professores;
    }
}
