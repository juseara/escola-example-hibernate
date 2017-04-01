/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estudodirigido.infra;

import java.util.List;
import java.util.Map;
import estudodirigido.infra.IRepositorioGenerico;
import estudodirigido.modelo.Usuario;

/**
 *
 * @author jose
 * @param <Usuario>
 
 */
public interface IUsuarioRepositorio extends IRepositorioGenerico<Usuario>{
 
    
    List<Usuario> getAll();
}
