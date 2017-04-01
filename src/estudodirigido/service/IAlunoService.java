/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estudodirigido.service;

import estudodirigido.modelo.Aluno;
import java.util.List;

/**
 *
 * @author jose
 */
public interface IAlunoService {
    
    public Aluno get(long id);
    public Aluno save(Aluno obj);
    public void update(Aluno obj);
    public void delete(Aluno obj);
    public List<Aluno> getAll();
    
}
