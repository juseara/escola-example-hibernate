/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estudodirigido.modelo;

import Commum.ObjetodeValor.CPF;
import Commum.TipoUsuario;
import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.Id;

/**
 *
 * @author Renato
 */
@Entity
public class Professor{

    @Id
    private long professorId;
   
    private String nome;
    
    @Embedded
    private CPF cpf;
    private String especialidade;

    public Professor() {
    }

    public Professor(long id,String nome, String cpf, String especialidade) {
        
        this.nome = nome;
        this.cpf = new CPF(cpf);
        this.especialidade = especialidade;
        
    }

   

   

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public long getProfessorId() {
        return professorId;
    }

    public CPF getCpf() {
        return cpf;
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }
    
    
}
