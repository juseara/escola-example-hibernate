/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estudodirigido.Controle;

import estudodirigido.modelo.AlunoDisciplina;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Andre
 */
public class AlunoDisciplinaControle {
    
    private static RepositorioBase _bd;

    public AlunoDisciplinaControle(RepositorioBase bd) {
        this._bd=bd;
    }
    
    
    public boolean Create(AlunoDisciplina alunoDisciplina)
    {
        try {
             _bd.alunoDisciplinas.add(alunoDisciplina);
             return true;
             
        } catch (Exception e) {
            return false;
        }
    }
    
    public boolean Delete (AlunoDisciplina alunoDisciplina)
    {
        try {
            for (AlunoDisciplina ad:_bd.alunoDisciplinas) {
                if(ad.getAluno().getMatricula() == alunoDisciplina.getAluno().getMatricula())
                {
                    _bd.alunoDisciplinas.remove(ad);
                    return true;
                }
            }
            return false;
        } catch (Exception e) {
            return false;
        }
    }
    
    public boolean Update(AlunoDisciplina alunoDisciplina)
    {
        return true;
    }
  
    
    public List<AlunoDisciplina> GetAll()
    {
        return _bd.alunoDisciplinas;
    }
    
    
    public List<AlunoDisciplina> GetByAluno(int matricula)
    {
        
        List<AlunoDisciplina> temp = new ArrayList<AlunoDisciplina>();
//        for (AlunoDisciplina ad: _bd.alunoDisciplinas) {
//            if(ad.getAluno().getMatricula() == matricula)
//            {
//                temp.add(ad);
//            }
//        }
        
        return temp;
    }
    
}
