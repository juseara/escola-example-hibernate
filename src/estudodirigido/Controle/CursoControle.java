/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estudodirigido.Controle;

import estudodirigido.modelo.Curso;
import java.util.List;

/**
 *
 * @author Renato
 */
public class CursoControle {
    
    private static RepositorioBase _bd;

    public CursoControle(RepositorioBase bd) {
        
        _bd=bd;
    }
    
     public boolean Create(Curso curso)
    {
        try {
             _bd.Cursos.add(curso);
             return true;
             
        } catch (Exception e) {
            return false;
        }
    }
     
     public boolean Update(Curso curso)
    {
        return true;
    }
    
    public List<Curso> Getall()
    {
        return _bd.Cursos;
    }
    
    public Curso GetByNome(String nome)
    {
        for (Curso c:_bd.Cursos) {
            if(c.getNome().equals(nome))
            {
                return c;
            }
        }
        
        return null;
    }
    
    
}
