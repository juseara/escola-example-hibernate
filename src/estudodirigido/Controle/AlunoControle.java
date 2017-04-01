/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estudodirigido.Controle;


import estudodirigido.modelo.Aluno;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Andre
 */
public class AlunoControle {
    
    private static RepositorioBase _bd;

    public AlunoControle(RepositorioBase bd) {
         this._bd=bd;
    }
    
    
     public boolean Create(Aluno aluno)
    {
        try {
             _bd.Alunos.add(aluno);
             return true;
             
        } catch (Exception e) {
            return false;
        }
    }
     
     public boolean Delete (Aluno aluno)
    {
        try {
            for (Aluno al:_bd.Alunos) {
                if(al.getMatricula() == aluno.getMatricula())
                {
                    _bd.Alunos.remove(al);
                    return true;
                }
            }
            return false;
        } catch (Exception e) {
            return false;
        }
    }
     
     public boolean Update(Aluno aluno)
    {
        return true;
    }
     public List<Aluno> GetAll()
    {
        return _bd.Alunos;
    }
     public List<Aluno> GetByAluno(int matricula)
    {
        
        List<Aluno> temp = new ArrayList<Aluno>();
//        for (Aluno ad: _bd.Alunos) {
//            if(ad.getMatricula() == matricula)
//            {
//                temp.add(ad);
//            }
//        }
        
        return temp;
    }
}
