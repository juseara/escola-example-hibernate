/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estudodirigido.Controle;

import estudodirigido.modelo.Professor;
import java.util.List;

/**
 *
 * @author Renato
 */
public class ProfessorControle {
     private static RepositorioBase _bd;

    public ProfessorControle(RepositorioBase bd) {
         this._bd=bd;
    }
    
    
    public boolean Create(Professor professor)
    {
        try {
             _bd.Professores.add(professor);
             return true;
             
        } catch (Exception e) {
            return false;
        }
    }
    public boolean Delete (Professor professor)
    {
        try {
            for (Professor pr:_bd.Professores) {
//                if(pr.getRegistro()== professor.getRegistro())
//                {
//                    _bd.Professores.remove(pr);
//                    return true;
//                }
            }
            return false;
        } catch (Exception e) {
            return false;
        }
    }
    
    public boolean Update(Professor professor)
    {
        return true;
    }
     public List<Professor> GetAll()
    {
        return _bd.Professores;
    }
}
