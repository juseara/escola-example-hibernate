/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estudodirigido.modelo;

import Commum.AssertionConcern;
import Commum.ObjetodeValor.CPF;
import estudodirigido.modelo.Curso;
import java.io.Serializable;
import java.util.ArrayList;
import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.Id;
import org.hibernate.annotations.Type;

/**
 *
 * @author Renato
 */
@Entity
public class Aluno extends AssertionConcern implements Serializable{
    
    @Id
    private Long AlunoId;
    
    private String Matricula;
    private String Nome;
    
    @Embedded
    private CPF cpf;
    //private Curso Curso ;
   
    
   protected Aluno()
   {
       
   }
    
    public Aluno(long id, String nome,String matricula, String cpf) {
        this.assertArgumentNotEmpty(cpf, "CPF é obrigatorio!");
        this.assertArgumentNotEmpty(nome, "nome é obrigatorio!");
        this.assertArgumentLength(matricula, 3, 10, "Tamanho para matricula invalido");
        this.AlunoId = id;
        this.Matricula = matricula;
        this.Nome = nome;
        this.cpf = new CPF(cpf);
        //this.Curso = curso;
        
        
    }

    
    
    public String getMatricula() {
        return Matricula;
    }

    public void setMatricula(String matricula) {
        this.Matricula = matricula;
    }

    public String getNome() {
        return Nome;
    }

    public void setNome(String nome) {
        this.Nome = nome;
    }

    public CPF getCpf() {
        return cpf;
    }

//    public Curso getCurso() {
//        return Curso;
//    }
//
//    public void setCurso(Curso curso) {
//        this.Curso = curso;
//    }

    public Long getAlunoId() {
        return AlunoId;
    }

}
