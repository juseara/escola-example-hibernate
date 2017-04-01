/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estudodirigido.service;

import estudodirigido.modelo.Usuario;
import java.util.List;

/**
 *
 * @author jose
 */
public interface IUsuarioService {
    
    public Usuario save(Usuario obj);
    public List<Usuario> getAll();
    public Usuario Autenticar(String login, String senha);
}
