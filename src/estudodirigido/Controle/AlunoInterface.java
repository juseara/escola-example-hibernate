/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estudodirigido.Controle;

import estudodirigido.modelo.Aluno;



/**
 *
 * @author jose
 */
public interface AlunoInterface {
    
    public Aluno Add(Aluno aluno); 
    
    public boolean Remove(Aluno aluno);
    
    public Aluno GetById(int alunoId);
}
