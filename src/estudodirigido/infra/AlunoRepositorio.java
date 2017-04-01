/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estudodirigido.infra;

import estudodirigido.modelo.Aluno;
import java.util.List;
import org.hibernate.SessionFactory;

/**
 *
 * @author jose
 */
public class AlunoRepositorio extends RepositorioBase<Aluno> implements IAlunoRepositorio{
    
    public AlunoRepositorio(SessionFactory sessionFactory) {
        super(Aluno.class, sessionFactory);
    }

    @Override
    public List<Aluno> getAll() {
        return (List<Aluno>) this.query("From " + Aluno.class.getName(), null);
    }

    
    
}
