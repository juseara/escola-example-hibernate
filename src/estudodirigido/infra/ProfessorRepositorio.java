/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estudodirigido.infra;

import estudodirigido.modelo.Professor;
import org.hibernate.SessionFactory;

/**
 *
 * @author jose
 */
public class ProfessorRepositorio extends RepositorioBase<Professor> implements IProfessorRepositorio{
    
    public ProfessorRepositorio(SessionFactory sessionFactory) {
        super(Professor.class, sessionFactory);
    }
    
}
