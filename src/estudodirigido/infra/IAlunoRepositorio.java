/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estudodirigido.infra;

import estudodirigido.infra.IRepositorioGenerico;
import estudodirigido.modelo.Aluno;
import java.util.List;

/**
 *
 * @author jose
 */
public interface IAlunoRepositorio extends IRepositorioGenerico<Aluno>{
    
    public List<Aluno> getAll();
}
