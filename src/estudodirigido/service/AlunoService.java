/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estudodirigido.service;

import Commum.HibernateUtil;
import estudodirigido.infra.AlunoRepositorio;
import estudodirigido.infra.IAlunoRepositorio;
import estudodirigido.modelo.Aluno;
import java.util.List;

/**
 *
 * @author jose
 */
public class AlunoService implements IAlunoService{

    private final IAlunoRepositorio _repositorio;

    public AlunoService( ) {
        this._repositorio = new AlunoRepositorio(HibernateUtil.getSessionFactory());
    }
    
    
    
    @Override
    public Aluno get(long id) {
        return _repositorio.get(Aluno.class, id);
    }

    @Override
    public Aluno save(Aluno obj) {
        return _repositorio.save(obj);
    }

    @Override
    public void update(Aluno obj) {
         _repositorio.update(obj);
    }

    @Override
    public void delete(Aluno obj) {
         _repositorio.delete(obj);
    }

    @Override
    public List<Aluno> getAll() {
        return _repositorio.getAll();
    }
    
}
