/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estudodirigido.Controle;

import estudodirigido.modelo.Disciplina;
import java.util.List;

/**
 *
 * @author Renato
 */
public class DisciplinaControle {
    
    private static RepositorioBase _bd;

    public DisciplinaControle(RepositorioBase bd) {
        
        _bd=bd;
    }
    
    public List<Disciplina> Gettall()
    {
        return _bd.Disciplinas;
    }
    
    
    public Disciplina GetByName(String nome)
    {
        for (Disciplina d: _bd.Disciplinas) {
            if (d.getNome().equals(nome)) {
                return d;
            }
        }
        
        return null;
    }
    
    
}
