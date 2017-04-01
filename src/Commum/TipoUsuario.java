/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Commum;

/**
 *
 * @author jose
 */
public enum TipoUsuario {
    Aluno(1),Professor(2),ADM(3);
    
    private final int tipo;
    
    TipoUsuario(int tipo){
        this.tipo = tipo;
    }

    public int getTipo() {
        return tipo;
    }
    
}
